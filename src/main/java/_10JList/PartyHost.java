package _10JList;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 *  一个选择派对用品的小程序，从两个列表中分别选择一个食品和一个用品，点击确定后提示选择的用品列表
 */
public class PartyHost extends JFrame implements ActionListener {
    //创建元素
    JLabel label;
    JList foodList;
    JList utilityList;
    JButton button;

    PartyHost(){
        //设置属性
        setTitle("派对用品");
        setSize(500,400);
        setLayout(null);
        label=new JLabel("你需要什么食物和用品");
        label.setBounds(10,20,150,20);
        DefaultListModel<String> foods=new DefaultListModel<String>();
        foods.addElement("Apple");
        foods.addElement("Orange Pie");
        foods.addElement("Hamburger");
        foods.addElement("Fried Chicken");
        foods.addElement("Egg");
        foodList=new JList(foods);
        foodList.setBounds(10,50,200,150);
        DefaultListModel<String> utilities=new DefaultListModel<String>();
        utilities.addElement("Chair");
        utilities.addElement("Party Hat");
        utilities.addElement("Table Game");
        utilities.addElement("Goblet");
        utilities.addElement("Banners");
        utilityList=new JList(utilities);
        utilityList.setBounds(290,50,200,150);
        button=new JButton("确定");
        button.setBounds(200,210,100,20);
        button.addActionListener(this);
        //添加元素
        add(label);
        add(foodList);
        add(utilityList);
        add(button);
        //显示
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //获取两个表中选择的内容
        List foods=foodList.getSelectedValuesList();
        List utilities=utilityList.getSelectedValuesList();
        //弹出提示框，显示选择的信息
        String message="你选择的食物有：";
        for (Object str: foods) {
            String temp=(String)str;
            message+=(" "+temp+", ");
        }
        message+="\n你选择的用品有：";
        for (Object str: utilities) {
            String temp=(String)str;
            message+=(" "+temp+", ");
        }
        JOptionPane.showMessageDialog(this,message);
        //退出
        System.exit(0);
    }

    public static void main(String[] args) {
        new PartyHost();
    }
}
