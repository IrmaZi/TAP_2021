
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Dibujo extends Canvas {

    private static final long serialVersionUID = 1L;
    int x, y, w, h, v;

    public Dibujo() {
        this.setVisible(true);
        this.setSize(100, 100);
        x = 10;
        y = 255;
        w = h = 350;
      
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);

        g.fillRect(x, y, w, h);

        g.setColor(Color.BLACK);
        
        //x               x
        g.drawLine(395, 510, 480, 375);
        g.drawLine(395, 510, 480, 625);
        g.drawLine(595, 510, 480, 375);
        g.drawLine(595, 510, 480, 625);

    }
}
