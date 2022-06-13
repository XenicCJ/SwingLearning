package _1BasicComponents._02JLabel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * JLabel类的对象是用于将文本放置在容器中的组件。它用于显示一行只读文本。文本可以由应用程序更改，但用户无法直接编辑。它继承了JComponent类。
 *
 * 包含一个输入框，一个标签和一个按钮
 * 按下按钮后在标签显示输入框中url的ip地址
 */
public class IPLooter extends JFrame implements ActionListener {
    //初始化元素
    JTextField jTextField=new JTextField("");
    JLabel jLabel=new JLabel("请在输入框中输入url地址",JLabel.CENTER);
    JButton jButton=new JButton("查询IP");

    public IPLooter(){
        //设置元素属性
        this.setSize(400,400);
        this.setLayout(null);
        jTextField.setBounds(100,40,200,20);
        jLabel.setBounds(100,100,200,60);
        jButton.setBounds(150,250,100,20);

        //设置元素动作
        jButton.addActionListener(this);

        //添加元素
        this.add(jTextField);
        this.add(jLabel);
        this.add(jButton);

        //设置可见性
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            //获取IP地址
            String ipStr= InetAddress.getByName(jTextField.getText()).getHostAddress();
            //显示在标签上
            String showStr="<html>URL："+jTextField.getText()+"，查询IP地址的结果为："+ipStr+"<html>";
            jLabel.setText(showStr);
        } catch (UnknownHostException ex) {
            jLabel.setText("查询出错，请输入要查询的URL地址");
            throw new RuntimeException(ex);
        }
    }

    public static void main(String[] args) {
        new IPLooter();
    }
}
