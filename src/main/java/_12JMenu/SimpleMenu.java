package _12JMenu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 简单的菜单，包含idea文件和编辑中的部分菜单项，选择对应选项会在框中显示对应文字
 */
public class SimpleMenu extends JFrame implements ActionListener{
    JMenuBar menuBar=new JMenuBar();
    JMenu fileMenu=new JMenu("文件");
    JMenu editMenu=new JMenu("编辑");
    JMenu pasteMenu=new JMenu("粘贴");
    JMenuItem create=new JMenuItem("新建");
    JMenuItem open=new JMenuItem("打开");
    JMenuItem close=new JMenuItem("关闭");
    JMenuItem copy=new JMenuItem("复制");
    JMenuItem paste=new JMenuItem("粘贴");
    JMenuItem pasteFromHis=new JMenuItem("从历史记录粘贴");
    JLabel label=new JLabel();

    SimpleMenu(){
        //配置属性
        setTitle("简单菜单");
        setSize(400,200);
        setLayout(null);
        label.setBounds(300,100,100,20);
        create.addActionListener(this);
        open.addActionListener(this);
        close.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        pasteFromHis.addActionListener(this);
        //组装元素
        pasteMenu.add(paste);pasteMenu.add(pasteFromHis);

        fileMenu.add(create);fileMenu.add(open);fileMenu.add(close);

        editMenu.add(copy);editMenu.add(pasteMenu);

        menuBar.add(fileMenu);menuBar.add(editMenu);
        setJMenuBar(menuBar);
        add(label);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==create){
            label.setText("create");
        }
        if(e.getSource()==open){
            label.setText("open");
        }
        if(e.getSource()==close){
            label.setText("close");
        }
        if(e.getSource()==copy){
            label.setText("copy");
        }
        if(e.getSource()==paste){
            label.setText("paste");
        }
        if(e.getSource()==pasteFromHis){
            label.setText("pasteFromHis");
        }
    }

    public static void main(String[] args) {
        new SimpleMenu();
    }
}
