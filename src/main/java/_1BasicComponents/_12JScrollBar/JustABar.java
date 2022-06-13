package _12JScrollBar;

import javax.swing.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

/**
 * JScrollbar类的对象用于添加水平和垂直滚动条。它是滚动条的实现。它继承了JComponent类。
 *
 * 就是一个滚动条，在标签中显示值
 */
public class JustABar extends JFrame{
    //创建元素
    JLabel label;
    JScrollBar bar;

    JustABar(){
        //设置元素值
        setSize(400,400);
        setLayout(null);
        label=new JLabel("滚动条的值是：");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400,100);
        bar=new JScrollBar();
        bar.setSize(20,200);
        bar.setLocation(190,100);
        bar.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                label.setText("滚动条的值是："+bar.getValue());
            }
        });
        //添加元素
        add(label);
        add(bar);
        //显示
        setVisible(true);
    }

    public static void main(String[] args) {
        new JustABar();
    }
}
