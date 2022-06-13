package _2Panes._01JOptionPane;

import javax.swing.*;

/**
 * 展现一些提示框
 */
public class WTF extends JFrame {
    WTF(){
        //简单的提示信息窗口
        JOptionPane.showMessageDialog(this,"欢迎来到东京");
        //简单的警告窗口
        JOptionPane.showMessageDialog(this,"千年以来最闪亮的流星来了！","提示窗",JOptionPane.WARNING_MESSAGE);
        //简单的确定窗口
        int flag=JOptionPane.showConfirmDialog(this,"确定要喝下口嚼酒吗？");
        if(flag!=0){
            System.out.println("故事结束，你无法知道他的名字了");
            System.exit(0);
        }
        //简单的输入提示窗口，将输入值输出控制台
        String name=JOptionPane.showInputDialog("你的名字是？");
        System.out.println("你的名字原来是："+name);
        //故事结尾
        System.out.println("你们将在5年后再见,故事完结。");
        System.exit(0);
    }

    public static void main(String[] args) {
        new WTF();
    }
}
