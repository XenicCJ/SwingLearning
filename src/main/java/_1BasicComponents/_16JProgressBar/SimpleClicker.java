package _1BasicComponents._16JProgressBar;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * JProgressBar类用于显示任务的进度。它继承了JComponent类。
 *
 * 一个简单的点击器，点击会增加进度条进度
 */
public class SimpleClicker extends JFrame {
    JFrame frame=this;
    JLabel label=new JLabel("点击鼠标左键增加进度");
    JProgressBar progressBar=new JProgressBar(0,100);

    SimpleClicker(){
        //设置属性
        setTitle("简单点击器");
        setSize(400,400);
        setLayout(null);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                progressBar.setValue(progressBar.getValue()+1);
                if(progressBar.getValue()==progressBar.getMaximum()){
                    JOptionPane.showMessageDialog(frame,"进度条已满，游戏完成");
                    System.exit(0);
                }
            }
        });
        label.setBounds(125,90,150,20);
        progressBar.setBounds(100,200,200,20);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        //添加元素
        add(label);
        add(progressBar);
        //显示
        setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleClicker();
    }

}
