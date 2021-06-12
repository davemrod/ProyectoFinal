
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
    private JLabel label, jLabelHuesped, jLabelCiudad, jLabelFechas, jLabelFechal, jLabelNum, jLabelTipo, jLabelOcu, jLabelPiso, jLabelLimi, jLabelTipoG, jLabelHabiG, jLabelPrecioG;
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
    String piso1="1";
    String piso2="2";
    String limi="3";
    String sencillaG = "Habitación sencilla";
    String dobleG = "Habitación doble";
    String tripleG = "Habitación triple";
    String p400 = "400€";
    String p500 = "500€";
    String p700 = "700€";
    String habiG = "201";
    String simbo = "€";
    
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
    
    private void initComponents(){
        super.setSize(750, 950);
        
        jLabelHuesped = new JLabel(lista.get(0).getHuesped());     
        jLabelHuesped.setBounds(175,610,300,80);
        jLabelHuesped.setForeground(Color.RED);
        add(jLabelHuesped);
        
        jLabelCiudad = new JLabel(lista.get(0).getCiudad());     
        jLabelCiudad.setBounds(175,630,300,80);
        jLabelCiudad.setForeground(Color.RED);
        add(jLabelCiudad);
        
        jLabelFechal = new JLabel(lista.get(0).getDiaLlegada());     
        jLabelFechal.setBounds(217,658,300,80);
        jLabelFechal.setForeground(Color.RED);
        add(jLabelFechal);
        
        jLabelFechas = new JLabel(lista.get(0).getDiaSalida2());     
        jLabelFechas.setBounds(217,680,300,80);
        jLabelFechas.setForeground(Color.RED);
        add(jLabelFechas);
        
        int pisoEn = lista.get(0).getPiso(); 
        String aux = Integer.toString(pisoEn);
        jLabelPiso = new JLabel(aux);     
        jLabelPiso.setBounds(227,707,300,80);
        jLabelPiso.setForeground(Color.RED);
        add(jLabelPiso );
        
        jLabelTipo = new JLabel(lista.get(0).getTipoHabitacion());     
        jLabelTipo.setBounds(227,732,300,80);
        jLabelTipo.setForeground(Color.RED);
        add(jLabelTipo);
        
        int ocupantes = lista.get(0).getTotalPersonas(); 
        String aux2 = Integer.toString(ocupantes);  
        jLabelOcu = new JLabel(aux2);     
        jLabelOcu.setBounds(235,753,300,80);
        jLabelOcu.setForeground(Color.RED);
        add(jLabelOcu);
     
    if(lista.get(0).getPiso()>115) {
        jLabelNum = new JLabel(piso2);     
        jLabelNum.setBounds(340,707,300,80);
        jLabelNum.setForeground(Color.RED);
        add(jLabelNum);
    }
    else {
        jLabelNum = new JLabel(piso1);     
        jLabelNum.setBounds(340,707,300,80);
        jLabelNum.setForeground(Color.RED);
        add(jLabelNum);
    }
        jLabelLimi = new JLabel(limi);     
        jLabelLimi.setBounds(350,732,300,80);
        jLabelLimi.setForeground(Color.RED);
        add(jLabelLimi);
        
        if(lista.get(0).getTipoHabitacion()=="Sencilla") {
            jLabelTipoG = new JLabel(sencillaG);     
            jLabelTipoG.setBounds(120, 450,300,80);
            jLabelTipoG.setForeground(Color.RED);
            jLabelTipoG.setFont(new java.awt.Font("Lucida Fax", 1, 16));
            add(jLabelTipoG);
            
            jLabelPrecioG = new JLabel(p400);     
            jLabelPrecioG.setBounds(440,450,300,80);
            jLabelPrecioG.setForeground(Color.RED);
            jLabelPrecioG.setFont(new java.awt.Font("Lucida Fax", 1, 16));
            add(jLabelPrecioG);  
        }
        else if(lista.get(0).getTipoHabitacion()=="Doble") {
            jLabelTipoG = new JLabel(dobleG);     
            jLabelTipoG.setBounds(120, 450,300,80);
            jLabelTipoG.setForeground(Color.RED);
            jLabelTipoG.setFont(new java.awt.Font("Lucida Fax", 1, 16));
            add(jLabelTipoG);
            
            jLabelPrecioG = new JLabel(p500);     
            jLabelPrecioG.setBounds(440,450,300,80);
            jLabelPrecioG.setForeground(Color.RED);
            jLabelPrecioG.setFont(new java.awt.Font("Lucida Fax", 1, 16));
            add(jLabelPrecioG);  
        }
        else if(lista.get(0).getTipoHabitacion()=="Triple") {
            jLabelTipoG = new JLabel(tripleG);     
            jLabelTipoG.setBounds(120, 450,300,80);
            jLabelTipoG.setForeground(Color.RED);
            jLabelTipoG.setFont(new java.awt.Font("Lucida Fax", 1, 16));
            add(jLabelTipoG);
            
            jLabelPrecioG = new JLabel(p700);     
            jLabelPrecioG.setBounds(440,450,300,80);
            jLabelPrecioG.setForeground(Color.RED);
            jLabelPrecioG.setFont(new java.awt.Font("Lucida Fax", 1, 16));
            add(jLabelPrecioG); 
        }
        
            jLabelHabiG = new JLabel(habiG);     
            jLabelHabiG.setBounds(345,450,300,80);
            jLabelHabiG.setForeground(Color.RED);
            jLabelHabiG.setFont(new java.awt.Font("Lucida Fax", 1, 16));
            add(jLabelHabiG);
            
            
        
        
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
