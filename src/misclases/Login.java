/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misclases;

import controlMySql.MySqlConn;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import org.apache.commons.codec.digest.DigestUtils;
import java.applet.AudioClip;
import java.awt.Color;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Login extends JFrame {

    AudioClip cancion;
    private MySqlConn conn;
    
    // Atributos
    private ImageIcon imagen;
    private Icon icono;
    private JLabel label;
    private JButton JButtonIngresar;
    private JTextField JTextFieldUsuario;
    private JPasswordField JPasswordFieldContra;
    private JButton JButtonPlay;
    private JButton JButtonStop;

    public Login() {
        this.conn= new MySqlConn();
        initComponents(); 
        this.setLocationRelativeTo(this);
    }

    public void crearFondo() {
        this.imagen = new ImageIcon("src/imagenes/loginportada.jpg");
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        this.label.setIcon(this.icono);
        this.repaint();
    }

    private void initComponents() {
        super.setSize(1100, 669);
//            try
//		{
//			URL url = this.getClass().getResource("/misclases/rolita.wav");
//			AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
//			Clip clip = AudioSystem.getClip();
//			clip.open(audioIn);
//			clip.start(); 
//            
//            //cancion=java.applet.Applet.newAudioClip(getClass().getResource("/misclases/rolita.wav"));
//            //cancion.play();
//        }
//        catch(Exception e) {
//        e.printStackTrace();
//        }
        
        super.setLayout(null);
  
        // Boton Ingresar
        JButtonIngresar = new JButton("INGRESAR");//boton local
        JButtonIngresar.setBounds(790,480, 100, 30);
        JButtonIngresar.setBackground(Color.black);
        JButtonIngresar.setForeground(new java.awt.Color(184, 148, 79));
        JButtonIngresar.setFocusable(false);
        
        // TextField Usuario
        JTextFieldUsuario = new JTextField();
        JTextFieldUsuario.setBounds(750,320,200,40);
        JTextFieldUsuario.setBackground(Color.black);
        JTextFieldUsuario.setForeground(Color.white);
        JTextFieldUsuario.setCaretColor(Color.white);
 
        // Password
        JPasswordFieldContra = new JPasswordField();
        JPasswordFieldContra.setBounds(750,415,200,40);
        JPasswordFieldContra.setBackground(Color.black);
        JPasswordFieldContra.setForeground(Color.white);
        JPasswordFieldContra.setCaretColor(Color.white);
        
        //750,320,200,40
        //Botones de play y pausa
        JButtonPlay = new JButton("PLAY");
        JButtonPlay.setBounds(760, 530, 70, 30);
        JButtonPlay.setBackground(Color.black);
        JButtonPlay.setForeground(new java.awt.Color(184, 148, 79));
        JButtonPlay.setFocusable(false);
        
        JButtonStop = new JButton("STOP");
        JButtonStop.setBounds(850, 530, 70, 30);
        JButtonStop.setBackground(Color.black);
        JButtonStop.setForeground(new java.awt.Color(184, 148, 79));
        JButtonStop.setFocusable(false);
        
        
        this.add(JButtonIngresar);
        this.add(JTextFieldUsuario);
        this.add(JPasswordFieldContra);
        this.add(JButtonPlay);
        this.add(JButtonStop);    
        
        // Botoncitos
        JButtonPlay.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                cancion=java.applet.Applet.newAudioClip(getClass().getResource("/misclases/Amor mio.wav"));
                cancion.play(); 
            }
        });
        
        JButtonStop.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               cancion.stop();
            }
        }); 
        
        JButtonIngresar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //Imprimimos en consola
                
                String cuenta, contrase??a, query;
                cuenta = JTextFieldUsuario.getText().trim();
                query = "select * from cuentas where usuario = " + "'" + cuenta + "'";
                conn.Consult(query);
                try {
                    String contrase??aMySql = conn.rs.getString(2);
                    char[] passw = JPasswordFieldContra.getPassword();
                    contrase??a = new String(passw);
                    String contrase??aencriptada = DigestUtils.md5Hex(contrase??a);
                    if (contrase??aMySql.equals(contrase??aencriptada)) {
                        JOptionPane.showMessageDialog(null, "Bienvenido " + conn.rs.getString(1)+" al sistema");
                        new InicioFondo().setVisible(true);
                        dispose();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Usuario o contrase??a incorrectos");
                }
                catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "No existe la cuenta");
                    System.out.println("No existe la cuenta");
                }          
            }            
        });

        label = new JLabel();
        label.setBounds(0, 0, 1100, 629);
        add(label);
        crearFondo();
    } 

    public static void main(String[] args) {
        new Login().setVisible(true);
    }
}
