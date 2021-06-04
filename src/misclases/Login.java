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
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Login extends JFrame {

    // Atributos
    private ImageIcon imagen;
    private Icon icono;
    private JLabel label;
    private JButton botoncito;
    private JTextField usuario;

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

        botoncito = new JButton("INGRESAR");//boton local
        botoncito.setBounds(550, 720, 100, 30);
        
        this.add(botoncito);
        
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
