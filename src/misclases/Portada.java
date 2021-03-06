
package misclases;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Portada extends JFrame {

    // Atributos
    private ImageIcon imagen;
    private Icon icono;
    private JLabel label;
    private JButton JButtonLogin;

    public Portada() {

        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void crearFondo() {
        this.imagen = new ImageIcon("src/imagenes/porta.png");
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        this.label.setIcon(this.icono);
        this.repaint();
    }

    private void initComponents() {
        super.setSize(800, 800);
        super.setLayout(null);

        JButtonLogin = new JButton("LOG IN");//boton local
        JButtonLogin.setBounds(650, 700, 100, 30);
        JButtonLogin.setBackground(Color.black);
        JButtonLogin.setForeground(new java.awt.Color(184, 148, 79));
        JButtonLogin.setFocusable(false);
        this.add(JButtonLogin);
        
        JButtonLogin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //Imprimimos en consola
                //JOptionPane.showMessageDialog(label, "Rammstein 2019, Opción 2");
                new Login().setVisible(true);
                dispose();
            }            
        });

        label = new JLabel();
        label.setBounds(0, 0, 800, 800);
        add(label);

        crearFondo();
    } 

    public static void main(String[] args) {
        new Portada().setVisible(true);
    }
}
