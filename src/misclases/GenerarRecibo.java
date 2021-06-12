
package misclases;

//import controlMySql.MySqlConn;
import java.awt.Color;
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
    private JLabel label, jLabelHuesped, jLabelCiudad, jLabelFechas, jLabelFechal, jLabelNum, jLabelTipo, jLabelOcu;
    private JButton JButtonIngresar;
    private JTextField JTextFieldUsuario;
    
    String huesped="Hola";
    String ciudad="Aguascalientes";
    String costo="450000$";
    String habi="234";
    String fechas="23-05-2021";
    String fechal="15-05-2021";
    String tipo="Sencilla";
    String ocupa="5";
    
    private ArrayList <Constructores>lista;
    
    public GenerarRecibo() {
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
        
        jLabelHuesped = new JLabel(huesped);     
        jLabelHuesped.setBounds(175,610,300,80);
        jLabelHuesped.setForeground(Color.RED);
        add(jLabelHuesped);
        
        jLabelCiudad = new JLabel(ciudad);     
        jLabelCiudad.setBounds(175,630,300,80);
        jLabelCiudad.setForeground(Color.RED);
        add(jLabelCiudad);
        
        jLabelFechal = new JLabel(fechal);     
        jLabelFechal.setBounds(217,658,300,80);
        jLabelFechal.setForeground(Color.RED);
        add(jLabelFechal);
        
        jLabelFechas = new JLabel(fechas);     
        jLabelFechas.setBounds(217,680,300,80);
        jLabelFechas.setForeground(Color.RED);
        add(jLabelFechas);
        
        jLabelNum = new JLabel(habi);     
        jLabelNum .setBounds(227,707,300,80);
        jLabelNum .setForeground(Color.RED);
        add(jLabelNum);
        
        jLabelTipo = new JLabel(tipo);     
        jLabelTipo .setBounds(227,732,300,80);
        jLabelTipo .setForeground(Color.RED);
        add(jLabelTipo);
        
        jLabelOcu = new JLabel(ocupa);     
        jLabelOcu .setBounds(235,753,300,80);
        jLabelOcu .setForeground(Color.RED);
        add(jLabelOcu);

        
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
    
    public static void main(String[] args) {
        new GenerarRecibo().setVisible(true);
    }
}
