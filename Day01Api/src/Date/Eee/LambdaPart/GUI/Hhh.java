package Date.Eee.LambdaPart.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Hhh {
    public static void main(String[] args) {

        JFrame f = new JFrame("ttt");
        f.setSize(1000, 800);
        f.setLocation(0, 0);
        f.setLayout(null);

        final JLabel l = new JLabel();

        ImageIcon i = new ImageIcon("D:/IdeaProjects/basic-code/Day01Api/src/Date/Eee/LambdaPart/GUI/timg.jpg");
        l.setIcon(i);
        l.setBounds(50, 50, i.getIconWidth(), i.getIconHeight());
        f.add(l);
        f.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == 39) {
                    l.setLocation(l.getX() + 50,l.getY());
                }
                if(e.getKeyCode() == 38) {
                    l.setLocation(l.getX(),l.getY() - 50);
                }
                if(e.getKeyCode() == 40) {
                    l.setLocation(l.getX(),l.getY() + 50);
                }
                if(e.getKeyCode() == 37) {
                    l.setLocation(l.getX() - 50,l.getY());
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        JButton b = new JButton("隐藏图片");
        b.setBounds(200, 0, 100, 30);

        JButton open = new JButton("显示图片");
        open.setBounds(0, 0, 100, 30);

        // 给按钮 增加 监听
        // 当按钮被点击时，就会触发 ActionEvent事件
        // actionPerformed 方法就会被执行
        open.addActionListener(e -> l.setVisible(true));
        b.addActionListener(e -> l.setVisible(false));

        f.add(open);

        f.add(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
