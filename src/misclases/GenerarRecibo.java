
package misclases;

//import controlMySql.MySqlConn;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GenerarRecibo extends JFrame {
    private ImageIcon imagen;
    private Icon icono;
    private JLabel label;
    private JButton JButtonIngresar;
    private JTextField JTextFieldUsuario;
    
    public GenerarRecibo() {
        //this.conn= new MySqlConn();
        initComponents(); 
        this.setLocationRelativeTo(this);
    }
    
    public void crearFondo() {
        this.imagen = new ImageIcon("src/imagenes/loginportada.jpg");
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        this.label.setIcon(this.icono);
        this.repaint();
    }
    
    private void initComponents(){
        super.setSize(1100, 669);
        
         // Boton Ingresar
        //JButtonIngresar = new JButton("INGRESAR");//boton local
        //JButtonIngresar.setBounds(780,494, 100, 30);
        
        // TextField Usuario
        this.JTextFieldUsuario = new JTextField();
        this.JTextFieldUsuario.setBounds(750,320,200,40);
        
        this.add(JButtonIngresar);
        this.add(JTextFieldUsuario);
        
        
        
        
        
        
        label = new JLabel();
        label.setBounds(0, 0, 1100, 629);
        add(label);
        crearFondo();
    }
    
    public static void main(String[] args) {
        new Login().setVisible(true);
    }
}
