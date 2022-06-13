package _17JTree;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 * 展示一个简单的目录结构
 */
public class WhatIsDir extends JFrame {
    WhatIsDir(){
        setSize(300,300);
        DefaultMutableTreeNode java=new DefaultMutableTreeNode("java");
        DefaultMutableTreeNode multi=new DefaultMutableTreeNode("multi");
        DefaultMutableTreeNode basic=new DefaultMutableTreeNode("basic");
        java.add(multi);java.add(basic);
        DefaultMutableTreeNode variable=new DefaultMutableTreeNode("variable");
        DefaultMutableTreeNode classes=new DefaultMutableTreeNode("classes");
        DefaultMutableTreeNode list=new DefaultMutableTreeNode("list");
        basic.add(variable);basic.add(classes);basic.add(list);
        JTree tree=new JTree(java);
        add(tree);
        setVisible(true);
    }

    public static void main(String[] args) {
        new WhatIsDir();
    }
}
