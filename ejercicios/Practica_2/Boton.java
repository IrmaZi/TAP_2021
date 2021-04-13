
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;

public class Boton extends JButton {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    boolean x = true;
    int x2 = 1;

    public Boton() {
        super("Irma");
        this.setVisible(true);
        this.setSize(200, 200);
        this.setBackground(Color.magenta);
    }

    public void paint(Graphics g) {
        if (x) {
            g.setColor(Color.BLACK);
            g.drawOval(0, 0, 100, 100);
            g.setColor(Color.GREEN);
            g.fillOval(0, 0, 100, 100);
        } else {
            g.setColor(Color.BLACK);
            g.drawOval(0, 0, 100, 100);
            g.setColor(Color.lightGray);
            g.fillOval(0, 0, 100, 100);
        }

    }

    public void Color() {
        if (x2 == 1) {
            x = false;
            x2++;
        } else {
            x = true;
            x2 = 1;
        }
    }

}
