import javax.swing.*;
import java.awt.event.*;
    public class Exer7_JLeftOrRight extends JFrame implements MouseListener
    {
        JLabel label = new JLabel("Click on JFrame to see numeric value");
        public Exer7_JLeftOrRight()
        {
            setTitle("Left Or Right");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            getContentPane().add(label);
            addMouseListener(this);
        }
        public static void main(String [ ] args)
        {
            Exer7_JLeftOrRight lor = new Exer7_JLeftOrRight();
            lor.setSize(300,200);
            lor.setVisible(true);
        }
        @Override
        public void mousePressed(MouseEvent e)
        {
        }
        @Override
        public void mouseClicked(MouseEvent e)
        {
        }
        @Override
        public void mouseEntered(MouseEvent e)
        {
        }
        @Override
        public void mouseExited(MouseEvent e)
        {
        }
        @Override
        public void mouseReleased(MouseEvent e)
        {
            label.setText("Left or Right value: " + e.getModifiers());
        }
    }
