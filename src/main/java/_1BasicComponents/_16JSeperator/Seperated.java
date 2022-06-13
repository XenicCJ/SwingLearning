package _1BasicComponents._16JSeperator;

import javax.swing.*;
import java.awt.*;

/**
 * JSeparator类的对象用于提供用于实现分隔线的通用组件。它用于绘制一条线以分隔布局中的小部件。它继承了JComponent类。
 *
 * 给菜单项和内部元素添加分隔线
 */
public class Seperated extends JFrame{
    JMenuBar menuBar=new JMenuBar();
    JMenu menu=new JMenu("菜单");
    JMenuItem menuItem1=new JMenuItem("我被分了？");
    JSeparator separator1=new JSeparator();
    JMenuItem menuItem2=new JMenuItem("我也被分了？");
    JLabel label1=new JLabel("我被分了？");
    JSeparator separator2=new JSeparator();
    JLabel label2=new JLabel("我也被分了？");

    Seperated(){
        //属性设置
        setTitle("我被分了？");
        setSize(400,400);
        setLayout(new GridLayout(0,1));
        //组装元素
        menuBar.add(menu);
        menu.add(menuItem1);
        menu.add(separator1);
        menu.add(menuItem2);
        //添加至框架
        setJMenuBar(menuBar);
        add(label1);
        add(separator2);
        add(label2);
        //显示
        setVisible(true);
    }

    public static void main(String[] args) {
        new Seperated();
    }
}
