package _02JLabel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 简单的label测试，显示两个标签和一个退出按钮
 */
public class StudyDay {
    public static void main(String[] args) {
        //初始化元素
        JFrame jFrame=new JFrame();
        JLabel jLabel1=new JLabel("今天又是好好学习的一天。",JLabel.CENTER);
        JLabel jLabel2=new JLabel("是啊是啊，明天也要继续好好学习！",JLabel.CENTER);
        JButton jButton=new JButton("好好学习去啦");

        //设置元素属性
        jFrame.setSize(400,200);
        jFrame.setLayout(null);
        jLabel1.setBounds(100,30,200,20);
        jLabel2.setBounds(100,70,200,20);
        jButton.setBounds(125,120,150,20);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        //添加元素
        jFrame.add(jLabel1);
        jFrame.add(jLabel2);
        jFrame.add(jButton);

        //设置可见性
        jFrame.setVisible(true);
    }
}
