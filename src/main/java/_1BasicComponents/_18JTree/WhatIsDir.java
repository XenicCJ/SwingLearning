package _18JTree;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 * JTree类用于显示树结构数据或层次结构数据。JTree是一个复杂的组件。它的最顶部有一个“根节点”，它是树中所有节点的父节点。它继承了JComponent类。
 *
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
