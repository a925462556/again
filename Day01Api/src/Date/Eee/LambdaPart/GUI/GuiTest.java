package Date.Eee.LambdaPart.GUI;

import javax.swing.*;

public class GuiTest {
    public static void main(String[] args) {
        //1.主窗体
        JFrame a = new JFrame("工票计算器v1.0");
        //2.设置窗体大小
        a.setSize(400,400);
        //3.设置位置
        a.setLocation(200,200);
        //4.主窗体中组件设为绝对定位
        a.setLayout(null);
        //5.按钮组件
        JButton b = new JButton("计算");
        //6.同时设置组件的大小和位置
        b.setBounds(100,100,100,30);
        //7.加入主窗体
        a.add(b);


        final JFrame k = new JFrame();
        /*ImageIcon i = new ImageIcon("e:/project/j2se/shana.png");
        a.setIcon(i);
        a.setBounds(50, 50, i.getIconWidth(), i.getIconHeight());*/
        ImageIcon i = new ImageIcon("D:/IdeaProjects/basic-code/Day01Api/src/Date/Eee/LambdaPart/GUI/timg.jpg");
        //k.setIcon();

        //8.关闭窗体的时候，退出程序
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //9.让窗体变得可见
        a.setVisible(true);
    }
}
