/*
 * Created by JFormDesigner on Wed Dec 22 19:39:06 CST 2021
 */

package SystemManager;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.plaf.*;

/**
 * @author peiChun lu
 */
public class GroupManage extends JPanel {
    public GroupManage() {
        initComponents();
        GroupSearch groupSearch = new GroupSearch();
        groupSearch.setSize(new Dimension(tabbedPane1.getWidth(), tabbedPane1.getHeight()));
        tabbedPane1.add("群組查詢",groupSearch);
        GroupCreate groupCreate = new GroupCreate();
        groupCreate.setSize(new Dimension(tabbedPane1.getWidth(), tabbedPane1.getHeight()));
        tabbedPane1.add("群組建立",groupCreate);
        GroupMemberDelete groupMemberDelete = new GroupMemberDelete();
        groupMemberDelete.setSize(new Dimension(tabbedPane1.getWidth(), tabbedPane1.getHeight()));
        tabbedPane1.add("群組成員查詢與刪除",groupMemberDelete);
        GroupMemberAdd groupMemberAdd = new GroupMemberAdd();
        groupMemberAdd.setSize(new Dimension(tabbedPane1.getWidth(), tabbedPane1.getHeight()));
        tabbedPane1.add("新增群組成員",groupMemberAdd);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - peiChun lu
        panel1 = new JPanel();
        tabbedPane1 = new JTabbedPane();

        //======== this ========
        setBackground(new Color(214, 214, 214));
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax
        . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn" , javax. swing
        .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .
        Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,java . awt. Color .red
        ) , getBorder () ) );  addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override
        public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062ord\u0065r" .equals ( e. getPropertyName (
        ) ) )throw new RuntimeException( ) ;} } );

        //======== panel1 ========
        {
            panel1.setBackground(new Color(214, 214, 214));
            panel1.setLayout(new GridBagLayout());
            ((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {103, 1202, 0};
            ((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {111, 600, 0};
            ((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
            ((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {0.0, 0.0, 1.0E-4};
            panel1.add(tabbedPane1, new GridBagConstraints(0, 0, 2, 2, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - peiChun lu
    private JPanel panel1;
    private JTabbedPane tabbedPane1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
