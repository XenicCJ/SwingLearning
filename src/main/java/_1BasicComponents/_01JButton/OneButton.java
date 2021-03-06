package _1BasicComponents._01JButton;

import javax.swing.*;

/**
 * JButton类用于创建具有平台独立实现的带标签的按钮。按下按钮后，应用程序将执行某些操作。它继承了AbstractButton类。
 *
 * 简单的JButton测试，仅包含一个按键的窗口
 */
public class OneButton {
    public static void main(String[] args) {
        //初始化框架和按钮
        JFrame jFrame=new JFrame("按钮测试");
        JButton jButton=new JButton("一个按钮");
        //设置按钮位置和框架大小
        jButton.setBounds(150,100,100,20);
        jFrame.setSize(400,400);
        //添加按钮到框架
        jFrame.add(jButton);
        //设置框架布局和可见性
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
}
