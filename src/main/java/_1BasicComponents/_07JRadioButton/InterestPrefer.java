package _1BasicComponents._07JRadioButton;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * JRadioButton类用于创建单选按钮。它用于从多个选项中选择一个选项。它广泛用于考试系统或测验中。
 * 应该将其添加到ButtonGroup中，以仅选择一个单选按钮。
 *
 * 一个小小的兴趣爱好提问
 */
public class InterestPrefer extends JFrame implements ActionListener {
    JLabel questionLabel=new JLabel("你最喜欢的兴趣爱好是什么？");
    JRadioButton rButton1=new JRadioButton("1) 健身运动");
    JRadioButton rButton2=new JRadioButton("2) 美食烹饪");
    JRadioButton rButton3=new JRadioButton("3) 聚会轰趴");
    JRadioButton rButton4=new JRadioButton("4) 音乐潮流");
    ButtonGroup bg=new ButtonGroup();
    JButton jButton=new JButton("提交");

    InterestPrefer(){
        //设置参数
        this.setLayout(null);
        this.setSize(200,250);
        questionLabel.setBounds(10,10,150,20);
        rButton1.setBounds(10,40,150,20);
        rButton2.setBounds(10,70,150,20);
        rButton3.setBounds(10,100,150,20);
        rButton4.setBounds(10,130,150,20);
        bg.add(rButton1);bg.add(rButton2);bg.add(rButton3);bg.add(rButton4);
        jButton.setBounds(10,160,100,20);
        jButton.addActionListener(this);

        //添加元素
        this.add(questionLabel);
        this.add(rButton1);
        this.add(rButton2);
        this.add(rButton3);
        this.add(rButton4);
        this.add(jButton);

        //显示可见
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String interestStr="";
        if(rButton1.isSelected()){
            interestStr="健身运动";
        }else if (rButton2.isSelected()){
            interestStr="美食烹饪";
        }else if (rButton3.isSelected()){
            interestStr="聚会轰趴";
        }else if (rButton4.isSelected()){
            interestStr="音乐潮流";
        }
        String showMsg="原来你也喜欢"+interestStr;
        JOptionPane.showMessageDialog(this,showMsg,"提示框",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    public static void main(String[] args) {
        new InterestPrefer();
    }
}
