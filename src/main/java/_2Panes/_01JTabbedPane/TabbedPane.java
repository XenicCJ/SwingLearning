package _2Panes._01JTabbedPane;

import javax.swing.*;

/**
 * 简单的选项卡组件演示
 */
public class TabbedPane extends JFrame {
    JTabbedPane tabbedPane=new JTabbedPane();
    JPanel mainPanel=new JPanel();
    JPanel visitPanel=new JPanel();
    JPanel helpPanel=new JPanel();
    JTextArea textArea=new JTextArea("在此输入文字");

    TabbedPane(){
        this.setSize(400,400);
    }
}
