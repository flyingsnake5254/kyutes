package DataClass;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

public class Question {
    private int questionID;
    private String content;
    private String answer;
    private String degreeOfDifficulty;
    private String questionType;
    private String c1,c2,c3,c4;
    public Question(int questionID , String content , String answer , String degreeOfDifficulty
    , String questionType , String c1 , String c2 , String c3 , String c4){
        this.questionID = questionID;
        this.content = content;
        this.answer = answer;
        this.degreeOfDifficulty = degreeOfDifficulty;
        this.questionType = questionType ;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
    }

    // 建立題目
    public static void createQuestion(String sujectName , String qbName , String questionType
    , String content , String answer , String choice1 , String choice2 , String choice3
    , String choice4 , String difficulty){
        Statement st = new GetDBdata().getStatement();
        try {
            st.execute("insert into " + qbName
            + "(content,answer,questionType,degreeOfDifficulty,choice1,choice2,choice3,choice4) " +
                    "values " +
                    "('" + content + "','" + answer + "','" + questionType + "','"
            + difficulty + "','" + choice1 + "','" + choice2 + "','" + choice3 + "','" + choice4
            + "')");
            Sujects sujects = new Sujects();
            Suject suject = sujects.getSuject(sujectName);
            suject.updateQuestionNumber(1,qbName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int getQuestionID() {
        return questionID;
    }

    public String getContent() {
        return content;
    }

    public String getAnswer() {
        return answer;
    }

    public String getDegreeOfDifficulty() {
        return degreeOfDifficulty;
    }

    public String getQuestionType() {
        return questionType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return questionID == question.questionID && Objects.equals(content, question.content) && Objects.equals(answer, question.answer) && Objects.equals(degreeOfDifficulty, question.degreeOfDifficulty) && Objects.equals(questionType, question.questionType) && Objects.equals(c1, question.c1) && Objects.equals(c2, question.c2) && Objects.equals(c3, question.c3) && Objects.equals(c4, question.c4);
    }

    public String getC1() {
        return c1;
    }

    public String getC2() {
        return c2;
    }

    public String getC3() {
        return c3;
    }

    public String getC4() {
        return c4;
    }

    @Override
    public int hashCode() {
        return Objects.hash(questionID, content, answer, degreeOfDifficulty, questionType, c1, c2, c3, c4);
    }
}
