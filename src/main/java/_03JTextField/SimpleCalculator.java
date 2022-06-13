package _03JTextField;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 包含三个单行输入栏和四个按钮，模拟一个简单计算器
 */
public class SimpleCalculator extends JFrame implements ActionListener {
    //创建元素
    JTextField tf1=new JTextField();
    JTextField tf2=new JTextField();
    JTextField tf3=new JTextField();
    JButton addButton=new JButton("+");
    JButton minusButton=new JButton("-");
    JButton multiButton=new JButton("*");
    JButton divideButton=new JButton("/");

    SimpleCalculator(){
        //设置元素属性
        this.setSize(400,400);
        this.setLayout(null);
        tf1.setBounds(50,40,300,20);
        tf2.setBounds(50,110,300,20);
        tf3.setBounds(50,180,300,20);
        tf3.setEditable(false);
        addButton.setBounds(50,260,50,40);
        addButton.addActionListener(this);
        minusButton.setBounds(133,260,50,40);
        minusButton.addActionListener(this);
        multiButton.setBounds(217,260,50,40);
        multiButton.addActionListener(this);
        divideButton.setBounds(300,260,50,40);
        divideButton.addActionListener(this);
        //添加元素
        this.add(tf1);
        this.add(tf2);
        this.add(tf3);
        this.add(addButton);
        this.add(minusButton);
        this.add(multiButton);
        this.add(divideButton);
        //显示
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            double num1=Double.parseDouble(tf1.getText());
            double num2=Double.parseDouble(tf2.getText());
            if(e.getSource()==addButton){
                tf3.setText((num1+num2)+"");
            }else if(e.getSource()==minusButton){
                tf3.setText((num1-num2)+"");
            }else if(e.getSource()==multiButton){
                tf3.setText((num1*num2)+"");
            }else if(e.getSource()==divideButton){
                tf3.setText((num1/num2)+"");
            }
        }catch (Exception exc){
            exc.printStackTrace();
            tf3.setText("");
            System.out.println("程序出错");
        }

    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }

}
