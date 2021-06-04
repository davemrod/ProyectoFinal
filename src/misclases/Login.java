/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misclases;


import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Login extends JFrame {

    // Atributos
    private ImageIcon imagen;
    private Icon icono;
    private JLabel label;
    private JButton JButtonIngresar;
    private JTextField JTextFieldUsuario;
    private JPasswordField JPasswordFieldContra;

    public Login() {

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
        
        /*    botoncito.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //Imprimimos en consola
                JOptionPane.showMessageDialog(label, "Rammstein 2019, Opción 2");
            }            
        }); */

        label = new JLabel();
        label.setBounds(0, 0, 1200, 800);
        add(label);
        crearFondo();
    } 

    public static void main(String[] args) {
        new Login().setVisible(true);
    }
}
