package _1BasicComponents._04JTextArea;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * JTextArea类的对象是显示文本的多行区域。它允许编辑多行文本。它继承了JTextComponent类。
 *
 * 一个简单英文文本计数器软件，统计textarea内文本的词数与字母数
 */
public class SimpleEngilshCounter extends JFrame implements ActionListener {
    //初始化元素
    JLabel wordLabel=new JLabel("Words: \\");
    JLabel alphabetLabel=new JLabel("Alphabets: \\");
    JTextArea textArea=new JTextArea();
    JButton countButton=new JButton("Count Text");

    SimpleEngilshCounter(){
        //设置属性
        this.setSize(400,500);
        this.setLayout(null);
        wordLabel.setBounds(0,0,200,20);
        alphabetLabel.setBounds(200,0,200,20);
        textArea.setBounds(0,40,375,370);
        textArea.setLineWrap(true);
        textArea.setText("You are my gentle harbor; you are my sweet concern; you are my driving force for struggle; you are the brilliance of my life; you are the reason for my happiness.");
        countButton.setBounds(150,430,100,20);
        countButton.addActionListener(this);
        //添加属性
        this.add(wordLabel);
        this.add(alphabetLabel);
        this.add(textArea);
        this.add(countButton);
        //显示
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str=textArea.getText();
        String[] strs=str.split("\\s+");
        wordLabel.setText("Words: "+strs.length);
        alphabetLabel.setText("Alphabets: "+str.length());
    }

    public static void main(String[] args) {
        new SimpleEngilshCounter();
    }
}
