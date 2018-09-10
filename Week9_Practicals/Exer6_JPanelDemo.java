import javax.swing.*;
import java.awt.*;
import java.awt.Color;


public class Exer6_JPanelDemo extends JFrame
{
    Container con = null;
    Exer6_JFlexiblePanel p1 = new Exer6_JFlexiblePanel(Color.GRAY, Color.RED,
            new Font("Courier", Font.BOLD, 11), "Test 1");
    Exer6_JFlexiblePanel p2 = new Exer6_JFlexiblePanel(Color.YELLOW, Color.GREEN,
            new Font("Helvetica", Font.ITALIC, 18), "Test 2");
    Exer6_JFlexiblePanel p3 = new Exer6_JFlexiblePanel(Color.BLUE, Color.WHITE,
            new Font("Algerian", Font.PLAIN, 24), "Test 3");

    public Exer6_JPanelDemo()
    {
        con = this.getContentPane();
        con.setLayout(new GridLayout(2,2));
        con.add(p1);
        con.add(p2);
        con.add(p3);
        setSize(250, 250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
    {
        Exer6_JPanelDemo app = new Exer6_JPanelDemo();
        app.setVisible(true);
        app.setSize(240, 240);
    }
}

