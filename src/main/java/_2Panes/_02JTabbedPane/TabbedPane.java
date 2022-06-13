package _2Panes._02JTabbedPane;

import javax.swing.*;

/**
 * 简单的选项卡组件演示
 */
public class TabbedPane extends JFrame {
    JTabbedPane tabbedPane=new JTabbedPane();
    JPanel mainPanel=new JPanel();
    JPanel visitPanel=new JPanel();
    JPanel helpPanel=new JPanel();
    JTextArea textArea=new JTextArea("什么要失望，藏眼泪到心脏，往事不会说谎别跟它为难，我们两人之间不需要这样，我想修炼爱情的心酸，学会放好以前的渴望，我们那些信仰要忘记多难，远距离的欣赏近距离的迷惘，别人有的爱我们不可能模仿，修炼爱情的悲欢，我们这些努力不简单，快乐炼成泪水是一种勇敢，几年前的幻想几年后的原谅，为一张脸去养一身伤，别讲想念我我会受不了这样。");

    TabbedPane(){
        //设置属性
        setTitle("修炼");
        setSize(400,400);
        setLayout(null);
        tabbedPane.setBounds(10,10,350,300);
        textArea.setSize(340,300);
        textArea.setLineWrap(true);
        //组装元素
        tabbedPane.add("main",mainPanel);
        tabbedPane.add("visit",visitPanel);
        tabbedPane.add("help",helpPanel);
        mainPanel.add(textArea);
        add(tabbedPane);
        //展示
        setVisible(true);
    }

    public static void main(String[] args) {
        new TabbedPane();
    }
}
