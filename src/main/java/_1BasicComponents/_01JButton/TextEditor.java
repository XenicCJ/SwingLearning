package _1BasicComponents._01JButton;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * JButton类用于创建具有平台独立实现的带标签的按钮。按下按钮后，应用程序将执行某些操作。它继承了AbstractButton类。
 *
 * 包含一个输入框和按钮的窗口
 * 按下按钮时，输入框内容会变为预设值
 */
public class TextEditor {
    public static void main(String[] args) {
        //初始化变量
        JFrame jFrame=new JFrame("按钮动作测试");
        JTextField jTextField=new JTextField();
        JButton jButton=new JButton("修改内容");

        //设置各各元素属性
        jFrame.setSize(300,300);
        jFrame.setLayout(null);
        jTextField.setBounds(100,50,150,20);
        jButton.setBounds(100,100,100,20);
        jButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText("Hello Java Swing!");
            }
        });

        //添加元素
        jFrame.add(jTextField);
        jFrame.add(jButton);

        //设置可见性
        jFrame.setVisible(true);
    }
}
