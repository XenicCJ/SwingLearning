package _03JTextField;

import javax.swing.*;

/**
 * 包含三个单行输入框，并显示一些内容
 */
public class MeetAgain extends JFrame {
    //初始化元素
    JTextField tf1=new JTextField("Hey, how you doing these days?");
    JTextField tf2=new JTextField("Well, this days are no going well for me.");
    JTextField tf3=new JTextField("Really? What happened these days?");

    MeetAgain(){
        //设置元素属性
        this.setSize(400,400);
        this.setLayout(null);
        tf1.setBounds(75,50,250,20);
        tf2.setBounds(75,150,250,20);
        tf3.setBounds(75,250,250,20);

        //添加元素
        this.add(tf1);
        this.add(tf2);
        this.add(tf3);

        //显示
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MeetAgain();
    }
}
