import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;

public class Ventana extends Frame implements ActionListener, MouseMotionListener, MouseListener {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    Dibujo dibujo;
    JButton btn_1;
    JButton btn_2;
    JButton btn_3;
    JButton btn_4;
    JButton btn_5;
    Boton button;

    public Ventana() {
        dibujo = new Dibujo();
        button = new Boton();
        btn_1 = new JButton("1");
        btn_2 = new JButton("2");
        btn_3 = new JButton("3");
        btn_4 = new JButton("4");
        btn_5 = new JButton("5");

        this.setTitle("JUEGO");
        this.setVisible(true);
        this.setSize(600, 700);
        setLocationRelativeTo(null);
        this.setLayout(null);

        dibujo.setBounds(0, 0, this.getWidth(), this.getHeight());
        button.setBounds(250, 50, 200, 200);
        btn_1.setBounds(425, 475, 50, 50);
        btn_2.setBounds(475, 525, 50, 50);
        btn_3.setBounds(525, 475, 50, 50);
        btn_4.setBounds(475, 425, 50, 50);
        btn_5.setBounds(475, 475, 50, 50);

        button.addActionListener(this);
        button.addMouseListener(this);

        btn_1.addMouseMotionListener(this);
        btn_2.addMouseMotionListener(this);
        btn_3.addMouseMotionListener(this);
        btn_4.addMouseMotionListener(this);
        btn_5.addMouseMotionListener(this);

        btn_1.addMouseListener(this);
        btn_2.addMouseListener(this);
        btn_3.addMouseListener(this);
        btn_4.addMouseListener(this);
        btn_5.addMouseListener(this);

        this.add(button);
        this.add(btn_1);
        this.add(btn_2);
        this.add(btn_3);
        this.add(btn_4);
        this.add(btn_5);
        this.add(dibujo);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    private void mover(MouseEvent e, JButton btn) {
        btn.setLocation(
                btn.getX() + e.getX() - btn.getWidth() / 2,
                btn.getY() + e.getY() - btn.getHeight() / 2
        );
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == btn_1) {
            mover(e, btn_1);
        }
        if (e.getSource() == btn_2) {
            mover(e, btn_2);
        }
        if (e.getSource() == btn_3) {
            mover(e, btn_3);
        }
        if (e.getSource() == btn_4) {
            mover(e, btn_4);
        }
        if (e.getSource() == btn_5) {
            mover(e, btn_5);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
       

    }

    @Override
    public void mouseClicked(MouseEvent arg0) {
      

    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
        
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
      
    }

    @Override
    public void mousePressed(MouseEvent e) {
     
        if (e.getSource() == button) {
            button.Color();
        }
    }

    /*     x = 10;
        y = 255;
        w = h = 350;*/
    @Override
    public void mouseReleased(MouseEvent e) {
       
        if (e.getSource() == button) {
            button.Color();
        }
        if (e.getSource() == btn_1) {
            if (btn_1.getX() > 10 && btn_1.getX() < 360 && btn_1.getY() > 255 && btn_1.getY() < 600) {
            } else {
                btn_1.setLocation(420, 475);
            }
        }
        if (e.getSource() == btn_2) {
            if (btn_2.getX() > 10 && btn_2.getX() < 360 && btn_2.getY() > 255 && btn_2.getY() < 600) {
            } else {
                btn_2.setLocation(475, 530);
            }
        }
        if (e.getSource() == btn_3) {
            if (btn_3.getX() > 10 && btn_3.getX() < 360 && btn_3.getY() > 255 && btn_3.getY() < 600) {
            } else {
                btn_3.setLocation(530, 475);
            }
        }
        if (e.getSource() == btn_4) {
            if (btn_4.getX() > 10 && btn_4.getX() < 360 && btn_4.getY() > 255 && btn_4.getY() < 600) {
            } else {
                btn_4.setLocation(475, 420);
            }
        }
        if (e.getSource() == btn_5) {
            if (btn_5.getX() > 10 && btn_5.getX() < 360 && btn_5.getY() > 255 && btn_5.getY() < 600) {
            } else {
                btn_5.setLocation(475, 475);
            }
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if (e.getSource() == button) {
            btn_1.setBounds(425, 475, 50, 50);
            btn_2.setBounds(475, 525, 50, 50);
            btn_3.setBounds(525, 475, 50, 50);
            btn_4.setBounds(475, 425, 50, 50);
            btn_5.setBounds(475, 475, 50, 50);
        }

    }
}
