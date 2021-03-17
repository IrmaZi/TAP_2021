import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Menu_4p1 extends Frame implements ActionListener{

    Label lbl_msg;
    TextArea txt_out;
    Button btn_clear;
    Button btn_aceptar;
    TextField txt_ini;

    Panel panel_superior;
    Panel panel_central;
    Panel panel_inferior;

    public Menu_4p1 () {
        initComponents();
    }

    public void initComponents() {
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        /*panel_superior = new Panel(); //Los panel funcionan como frame
        panel_central = new Panel();//Son contenedores que pueden ir
        panel_inferior = new Panel();// en otros contenedores

        panel_central.setLayout(new BorderLayout());
        panel_superior.setLayout(new BorderLayout());
        panel_inferior.setLayout(new BorderLayout());*/

        txt_ini = new TextField();
        btn_aceptar = new Button("Aceptar");
        btn_clear = new Button("Limpiar");
        txt_out = new TextArea();
        lbl_msg = new Label("Introduzca El Texto: ");

        btn_aceptar.addActionListener(this);
        btn_clear.addActionListener(this);

        this.setLayout(new GridLayout(3,3));//Nos permite meter los win mientras van llegando
        this.add(lbl_msg, 0, 0);
        this.add(txt_ini, 0, 1);
        this.add(btn_aceptar, 0, 2);
        this.add(txt_out, 1, 1);
        this.add(btn_clear, 2, 2);
        
        
        /*panel_superior.add(btn_aceptar, BorderLayout.EAST);
        panel_superior.add(txt_ini, BorderLayout.CENTER);
        panel_superior.add(lbl_msg, BorderLayout.WEST);
        panel_central.add(txt_out, BorderLayout.CENTER);
        panel_inferior.add(btn_clear, BorderLayout.EAST);*/

        /*this.add(panel_superior, BorderLayout.NORTH);
        this.add(panel_inferior, BorderLayout.SOUTH);
        this.add(panel_central, BorderLayout.CENTER);*/

        this.setSize(400, 300);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {

    }

    public static void main(String[] args) {
        Menu_4p1 m = new Menu_4p1();

    }
}
