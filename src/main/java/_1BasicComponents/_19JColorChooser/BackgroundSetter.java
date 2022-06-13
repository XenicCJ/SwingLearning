package _19JColorChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * JColorChooser类用于创建颜色选择器对话框，以便用户可以选择任何颜色。它继承了JComponent类。
 *
 * 用户可以自定义app的背景颜色
 */
public class BackgroundSetter extends JFrame implements ActionListener {
    JButton button=new JButton("SetBgColor");

    BackgroundSetter(){
        //设置属性
        setTitle("BackgroundSetter");
        setSize(400,400);
        setLayout(null);
        button.setBounds(150,150,100,30);
        button.addActionListener(this);
        //添加元素
        add(button);
        //展现
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //弹出颜色选择框，选定颜色后返回
        Color color=JColorChooser.showDialog(this,"Choose",Color.CYAN);
        getContentPane().setBackground(color);
    }

    public static void main(String[] args) {
        new BackgroundSetter();
    }
}
