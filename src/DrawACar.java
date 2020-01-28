import javax.swing.*;
import java.awt.*;

/**
 * This class will create an image of a car
 *
 * @author Kirk LaMaire
 * @version 1.0
 */

public class DrawACar extends JPanel{

    public static void main(String[] a) {
        JFrame f = new JFrame();
        f.setContentPane(new DrawACar());
        f.setSize(600, 400);
        f.setVisible(true);
    }

    public void paintComponent(Graphics g){
        // this statement required
        super.paintComponent(g);

        // optional: paint the background color (default is white)
        setBackground(Color.CYAN);

        // draw a solid rectangle representing a road
        g.setColor(Color.GRAY);
        g.fillRect(0, 250, 700, 150);

        // draw a pair of red rectangles to create car shape
        g.setColor(Color.RED);
        g.fillRect(100, 200, 300, 75);
        g.fillRect(150, 125, 200, 75);

        // draw a pair of white rectangles to create car windows
        g.setColor(Color.WHITE);
        g.fillRect(160, 135, 85, 65);
        g.fillRect(255, 135, 85, 65);

        // draw a pair of solid black circles for car tires
        g.setColor(Color.BLACK);
        g.fillOval(150, 245, 60, 60);
        g.fillOval(290, 245, 60, 60);

        // draw a single yellow circle to represent the sun
        g.setColor(Color.YELLOW);
        g.fillOval(400, 50, 75, 75);
    }
}
