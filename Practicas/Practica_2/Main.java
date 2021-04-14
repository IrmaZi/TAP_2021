import java.awt.Color;
import javafx.scene.layout.Background;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
        } catch (ClassNotFoundException ex) {
            // Logger.getLogger(Ventana_Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            // Logger.getLogger(Ventana_Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            // Logger.getLogger(Ventana_Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            //  Logger.getLogger(Ventana_Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        Ventana v = new Ventana();
        //this.setBackground(Color.BLACK);
    }
}
