package _1BasicComponents._14JCeckBoxMenuItem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * JCheckBoxMenuItem类表示可以包含在菜单中的复选框。CheckBoxMenuItem可以具有与之关联的文本或图形图标，或两者都有。可以选择或取消选择MenuItem。MenuItem可以通过操作进行配置和控制。
 *
 * 菜单中包含可选的项，并在标签中显示情况
 */
public class WXLBoy extends JFrame {
    JLabel label=new JLabel("你不是王心凌男孩");
    JMenuBar bar=new JMenuBar();
    JMenu menu=new JMenu("菜单");
    JMenuItem create=new JMenu("新建");
    JCheckBoxMenuItem wxl=new JCheckBoxMenuItem("王心凌男孩？");

    WXLBoy(){
        //设置属性
        setSize(400,400);
        setLayout(null);
        label.setBounds(100,100,200,100);
        bar.add(menu);
        menu.add(create);menu.add(wxl);
        wxl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AbstractButton aButton = (AbstractButton) e.getSource();
                boolean selected = aButton.getModel().isSelected();
                String newLabel;
                if (selected) {
                    newLabel = "原来你是王心凌男孩！";
                } else {
                    newLabel = "你居然不是王心凌男孩！";
                }
                label.setText(newLabel);
            }
        });
        //设置快捷键
        wxl.setMnemonic(KeyEvent.VK_F);

        //添加元素
        add(label);
        setJMenuBar(bar);

        //显示
        setVisible(true);
    }

    public static void main(String[] args) {
        new WXLBoy();
    }
}
