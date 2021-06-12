
package misclases;

//import controlMySql.MySqlConn;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import misclases.Hotel;
import misclases.Constructores;

public class GenerarRecibo extends JFrame {
    private ImageIcon imagen;
    private Icon icono;
    private JLabel label, jLabelHuesped;
    private JButton JButtonIngresar;
    private JTextField JTextFieldUsuario;
    
    String huesped;
    
    private ArrayList <Constructores>lista;
    
    public GenerarRecibo(ArrayList lista) {
        this.lista = lista;
        initComponents(); 
        this.setLocationRelativeTo(this);
    }
    
    public void crearFondo() {
        this.imagen = new ImageIcon("src/imagenes/Recibo Atlantis Resort.jpg");
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        this.label.setIcon(this.icono);
        this.repaint();
    }
    
    /*public void RecibirDatos(String huesped)
    {
       this.huesped = huesped;
    }*/
    
    private void initComponents(){
        super.setSize(750, 950);
        
        jLabelHuesped = new JLabel(lista.get(0).getHuesped());     
        jLabelHuesped.setBounds(10,120,300,80);
        add(jLabelHuesped);
        
  

        
         // Boton Ingresar
        //JButtonIngresar = new JButton("INGRESAR");//boton local
        //JButtonIngresar.setBounds(780,494, 100, 30);
        
        // TextField Usuario
        //this.JTextFieldUsuario = new JTextField();
        //this.JTextFieldUsuario.setBounds(750,320,200,40);
        
        //this.add(JButtonIngresar);
        //this.add(JTextFieldUsuario);
        
        label = new JLabel();
        label.setBounds(0, 0, 750, 950);
        add(label);
        crearFondo();       
    }
    
    /*public static void main(String[] args) {
        new GenerarRecibo().setVisible(true);
    }*/
}
