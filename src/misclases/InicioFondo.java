

package misclases;

import controlMySql.MySqlConn;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class InicioFondo extends JFrame {
     
    private ImageIcon imagen;
    private Icon icono;
    private JLabel label;
     private JButton JButtonMenu;
    
    public InicioFondo() {
        initComponents(); 
        this.setLocationRelativeTo(this);
    }

    public void crearFondo() {
        this.imagen = new ImageIcon("src/imagenes/32017.jpg");
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        this.label.setIcon(this.icono);
        this.repaint();
    }
    
     private void initComponents(){
        super.setSize(1100, 669);
        
        super.setLayout(null);
        
        // Boton Ingresar
        JButtonMenu = new JButton("MENÚ");//boton local
        JButtonMenu.setBounds(940,545, 100, 30);
        
        this.add(JButtonMenu);
        
        JButtonMenu.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                new Hotel().setVisible(true);
            }
            
        });
                
        label = new JLabel();
        label.setBounds(0, 0, 1100, 629);
        add(label);
        crearFondo();
    }
     
    public static void main(String[] args) {
        new InicioFondo().setVisible(true);
        //new Hotel().setVisible(true);
    }
}
