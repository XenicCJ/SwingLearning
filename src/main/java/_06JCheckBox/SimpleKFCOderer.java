package _06JCheckBox;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * 一个简单的点餐系统，根据选餐情况自动调整显示的金额，选餐完成后弹出提示窗进行确认
 */
public class SimpleKFCOderer extends JFrame implements ActionListener, ItemListener {
    //初始化元素
    int price=0;
    JLabel topicLabel=new JLabel("肯德基在线订餐系统");
    JCheckBox[] checkBoxes=new JCheckBox[6];
    JLabel priceLabel=new JLabel("已选商品总价：");
    JButton payButton=new JButton("支付");

    SimpleKFCOderer(){
        //初始化元素
        this.setSize(300,350);
        this.setLayout(null);
        topicLabel.setBounds(10,20,150,20);
        checkBoxes[0]=new JCheckBox("榴莲芝士鸡腿堡@￥24");
        checkBoxes[1]=new JCheckBox("香辣鸡枞菌菌菇鸡腿卷@￥18");
        checkBoxes[2]=new JCheckBox("香辣鸡枞菌菌菇鸡腿双层堡@￥20");
        checkBoxes[3]=new JCheckBox("日向夏柑橘冰淇淋花筒@￥9");
        checkBoxes[4]=new JCheckBox("榴莲爆浆鸡块@￥11");
        checkBoxes[5]=new JCheckBox("双层香烤鸡帕尼尼@￥15");
        checkBoxes[0].setBounds(10,50,300,20);
        checkBoxes[1].setBounds(10,80,300,20);
        checkBoxes[2].setBounds(10,110,300,20);
        checkBoxes[3].setBounds(10,140,300,20);
        checkBoxes[4].setBounds(10,170,300,20);
        checkBoxes[5].setBounds(10,200,300,20);
        checkBoxes[0].addItemListener(this);
        checkBoxes[1].addItemListener(this);
        checkBoxes[2].addItemListener(this);
        checkBoxes[3].addItemListener(this);
        checkBoxes[4].addItemListener(this);
        checkBoxes[5].addItemListener(this);
        priceLabel.setBounds(10,230,300,20);
        payButton.setBounds(10,260,100,20);
        payButton.addActionListener(this);
        //添加元素
        this.add(topicLabel);
        this.add(checkBoxes[0]);
        this.add(checkBoxes[1]);
        this.add(checkBoxes[2]);
        this.add(checkBoxes[3]);
        this.add(checkBoxes[4]);
        this.add(checkBoxes[5]);
        this.add(priceLabel);
        this.add(payButton);

        //显示
        this.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        price=0;
        if(checkBoxes[0].isSelected()){
            price+=24;
        }
        if(checkBoxes[1].isSelected()){
            price+=18;
        }
        if(checkBoxes[2].isSelected()){
            price+=20;
        }
        if(checkBoxes[3].isSelected()){
            price+=9;
        }
        if(checkBoxes[4].isSelected()){
            price+=11;
        }
        if(checkBoxes[5].isSelected()){
            price+=15;
        }
        priceLabel.setText("已选商品总价：￥"+price);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(price==0){
            JOptionPane.showMessageDialog(this,"您未选择任何餐品","提示框",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String confirmInfo="您选择的餐品有：";
        if(checkBoxes[0].isSelected()){
            confirmInfo+=" 榴莲芝士鸡腿堡 ";
        }
        if(checkBoxes[1].isSelected()){
            confirmInfo+=" 香辣鸡枞菌菌菇鸡腿卷";
        }
        if(checkBoxes[2].isSelected()){
            confirmInfo+=" 香辣鸡枞菌菌菇鸡腿双层堡";
        }
        if(checkBoxes[3].isSelected()){
            confirmInfo+=" 日向夏柑橘冰淇淋花筒";
        }
        if(checkBoxes[4].isSelected()){
            confirmInfo+=" 榴莲爆浆鸡块";
        }
        if(checkBoxes[5].isSelected()){
            confirmInfo+=" 双层香烤鸡帕尼尼";
        }
        confirmInfo+="\n确认结账￥"+price+"吗？";
        int option=JOptionPane.showConfirmDialog(this,confirmInfo,"确认信息",JOptionPane.YES_NO_OPTION);
        if(option==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(this,"点餐完成","提示框",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }else {
            return;
        }
    }

    public static void main(String[] args) {
        new SimpleKFCOderer();
    }
}
