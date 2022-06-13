package _04JTextArea;

import javax.swing.*;

/**
 *
 */
public class LoverTalk extends JFrame {
    //初始化元素
    JTextArea textArea=new JTextArea();

    LoverTalk(){
        //设置部件属性
        this.setSize(400,300);
        this.setLayout(null);
        textArea.setText("我喜欢的样子，你都有。（《甜甜的》周杰伦）\n" +
                "\n" +
                "\n" +
                "年年月月逝去越是觉得深爱你。（《谁愿放手》陈慧琳）\n" +
                "\n" +
                "\n" +
                "后海有树的院子，夏代有工的玉。此时此刻的云，二十来岁的你。（冯唐）\n" +
                "\n" +
                "\n" +
                "我叫张士豪，天蝎座o型，游泳队吉他社，我还不错啊。（《蓝色大门》）");
        textArea.setLineWrap(true);
        textArea.setBounds(0,0,375,250);
        //添加元素
        this.add(textArea);
        //显示
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new LoverTalk();
    }
}
