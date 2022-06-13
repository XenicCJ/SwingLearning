package _05JPasswordField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 一个登陆界面，包含用户名和密码，仅当用户名和密码正确时登陆成功并退出窗口
 */
public class LoginPanel extends JFrame implements ActionListener {
    //初始化
    JLabel userLabel=new JLabel("Username: ");
    JLabel passwordLabel=new JLabel("Password: ");
    JTextField userTextField=new JTextField();
    JPasswordField passwordTextField=new JPasswordField();
    JButton loginButton=new JButton("Login");

    LoginPanel(){
        //属性
        this.setSize(350,180);
        this.setLayout(null);
        userLabel.setBounds(10,20,150,20);
        userTextField.setBounds(100,20,220,20);
        passwordLabel.setBounds(10,60,150,20);
        passwordTextField.setBounds(100,60,220,20);
        loginButton.setBounds(100,100,100,20);
        loginButton.addActionListener(this);
        //添加
        this.add(userLabel);
        this.add(userTextField);
        this.add(passwordLabel);
        this.add(passwordTextField);
        this.add(loginButton);
        //显示
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //直接匹配用户名和密码，用户名为ChadwinSean，密码为123456
        String username=userTextField.getText();
        String password=passwordTextField.getText();
        if(username.compareTo("ChadwinSean")==0&&password.compareTo("123456")==0){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this,"Login success!","提示框",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }else{
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this,"Wrong username or password!","提示框",JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new LoginPanel();
    }
}
