package _1BasicComponents._13JPopupMenu;

import javax.swing.*;
import java.awt.event.*;

/**
 * PopupMenu可以在组件内的特定位置动态弹出。它继承了JComponent类。
 *
 * 简单弹出菜单，右键单击会弹出菜单，选择选项后在标签显示对应选项
 */
public class SimplePopMenu extends JFrame {
    JFrame frame=this;
    JLabel label=new JLabel("单击右键弹出菜单");
    JPopupMenu popupMenu=new JPopupMenu();
    JMenuItem cut=new JMenuItem("cut");
    JMenuItem copy=new JMenuItem("copy");
    JMenu pasteMenu=new JMenu("paste");
    JMenuItem paste=new JMenuItem("paste");
    JMenuItem pasteFromHis=new JMenuItem("pasteFromHis");

    SimplePopMenu(){
        setSize(400,400);
        setLayout(null);

        label.setBounds(100,20,200,20);

        pasteMenu.add(paste);pasteMenu.add(pasteFromHis);
        popupMenu.add(cut);popupMenu.add(copy);popupMenu.add(pasteMenu);

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.isMetaDown()){
                    popupMenu.show(frame,e.getX(),e.getY());
                }
            }
        });

        cut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("选择的菜单项：cut");
            }
        });

        copy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("选择的菜单项：copy");
            }
        });

        paste.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("选择的菜单项：paste");
            }
        });

        pasteFromHis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("选择的菜单项：pasteFromHis");
            }
        });

        add(label);
        //多级弹出菜单时不需要将
        //add(pasteMenu);

        setVisible(true);
    }

    public static void main(String[] args) {
        new SimplePopMenu();
    }
}
