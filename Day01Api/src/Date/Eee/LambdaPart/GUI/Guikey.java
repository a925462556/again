package Date.Eee.LambdaPart.GUI;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Guikey {
    public static void main(String[] args) {
        JFrame f = new JFrame("LoL");
        f.setSize(1000, 1000);
        f.setLocation(50, 50);
        f.setLayout(null);

        final JLabel l = new JLabel();

        ImageIcon i = new ImageIcon("D:/IdeaProjects/basic-code/Day01Api/src/Date/Eee/LambdaPart/GUI/timg.jpg");
        l.setIcon(i);
        l.setBounds(50, 50, i.getIconWidth(), i.getIconHeight());

        // 增加键盘监听
        f.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                l.setLocation(50,50);
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
        f.add(l);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
