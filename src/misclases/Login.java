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

public class Login extends JFrame {

    private MySqlConn conn;
    
    // Atributos
    private ImageIcon imagen;
    private Icon icono;
    private JLabel label;
    private JButton JButtonIngresar;
    private JTextField JTextFieldUsuario;
    private JPasswordField JPasswordFieldContra;

    public Login() {
        this.conn= new MySqlConn();
        initComponents(); 
        this.setLocationRelativeTo(this);
    }

    public void crearFondo() {
        this.imagen = new ImageIcon("src/imagenes/login.jpg");
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        this.label.setIcon(this.icono);
        this.repaint();
    }

    private void initComponents() {
        super.setSize(1200, 800);
        super.setLayout(null);
  
        // Boton Ingresar
        JButtonIngresar = new JButton("INGRESAR");//boton local
        JButtonIngresar.setBounds(550, 720, 100, 30);
        
        // TextField Usuario
        this.JTextFieldUsuario = new JTextField();
        this.JTextFieldUsuario.setBounds(500,490,300,40);
        //this.panelJtext.add(this.JTextFieldUsuario);
        
        // Password
        this.JPasswordFieldContra = new JPasswordField();
        this.JPasswordFieldContra.setBounds(500,630,300,40);
        
        this.add(JButtonIngresar);
        this.add(JTextFieldUsuario);
        this.add(JPasswordFieldContra);
        
        JButtonIngresar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //Imprimimos en consola
                
                String cuenta, contraseña, query;
                cuenta = JTextFieldUsuario.getText().trim();
                query = "select * from cuentas where cuenta = " + "'" + cuenta + "'";
                conn.Consult(query);
                try {
                    String contraseñaMySql = conn.rs.getString(2);
                    char[] passw = JPasswordFieldContra.getPassword();
                    contraseña = new String(passw);
                    String contraseñaencriptada = DigestUtils.md5Hex(contraseña);
                    if (contraseñaMySql.equals(contraseñaencriptada)) {
                        JOptionPane.showMessageDialog(null, "Bienvenido " + conn.rs.getString(1)+" al sistema");
                        new Hotel().setVisible(true);
                        dispose();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                }
                catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "No existe la cuenta");
                    System.out.println("No existe la cuenta");
                }          
            }            
        });

        label = new JLabel();
        label.setBounds(0, 0, 1200, 800);
        add(label);
        crearFondo();
    } 

    public static void main(String[] args) {
        new Login().setVisible(true);
    }
}
