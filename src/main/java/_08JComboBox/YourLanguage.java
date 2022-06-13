package _08JComboBox;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 选择你目前主要使用的编程语言
 */
public class YourLanguage extends JFrame implements ActionListener {
    JLabel showLabel=new JLabel("你的语言是：");
    JComboBox languageBox=new JComboBox();
    JButton showButton=new JButton("Show");

    YourLanguage(){
        //设置属性
        this.setSize(250,150);
        this.setLayout(null);
        showLabel.setBounds(10,20,150,20);
        String[] elements={"Java","C++","C#","C","Swift","Golang","Python"};
        languageBox=new JComboBox(elements);
        languageBox.setBounds(10,50,150,20);
        showButton.setBounds(10,80,100,20);
        showButton.addActionListener(this);
        //添加元素
        add(showLabel);
        add(languageBox);
        add(showButton);
        //显示
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str=(String)(languageBox.getItemAt(languageBox.getSelectedIndex()));
        showLabel.setText("你的语言是："+str);
    }

    public static void main(String[] args) {
        new YourLanguage();
    }
}
