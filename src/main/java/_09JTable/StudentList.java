package _09JTable;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * 一个简单的学生列表，选定元素时在控制台输出选中元素
 */
public class StudentList extends JFrame implements ListSelectionListener {
    String[][] studentInfos=
                    {{"101","LiHua","20"},
                            {"102","ZhangMei","21"},
                            {"103","WangLiang","22"},
                            {"101","LiHua","20"},
                            {"102","ZhangMei","21"},
                            {"103","WangLiang","22"},
                            {"101","LiHua","20"},
                            {"102","ZhangMei","21"},
                            {"103","WangLiang","22"},
                            {"101","LiHua","20"},
                            {"102","ZhangMei","21"},
                            {"103","WangLiang","22"},};
    String[] columns={"ID","NAME","AGE"};
    JTable tb=new JTable(studentInfos,columns);
    JScrollPane sp=new JScrollPane(tb);

    StudentList(){
        //设置属性
        this.setSize(300,150);
        tb.setBounds(10,10,200,200);
        tb.getTableHeader().setReorderingAllowed(false);
        ListSelectionModel select=tb.getSelectionModel();
        select.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        select.addListSelectionListener(this);
        //添加元素
        add(sp);
        //设置可见
        setVisible(true);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        //需要判定鼠标点击还是松开
        if(!e.getValueIsAdjusting()){
            String str=(String)(tb.getValueAt(tb.getSelectedRow(),tb.getSelectedColumn()));
            System.out.println("选择数据："+str);
        }
    }

    public static void main(String[] args) {
        new StudentList();
    }
}
