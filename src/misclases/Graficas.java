
package misclases;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;


public class Graficas extends javax.swing.JFrame {

    JFreeChart Grafica1;
    JFreeChart Grafica2;
    
    DefaultCategoryDataset datos1=new DefaultCategoryDataset();
    DefaultPieDataset datos2=new DefaultPieDataset();
    
    int hab[]=new int[3];
     
    
    public Graficas() {
        initComponents();
        
        for (int i = 0; i < 3; i++) {
            hab[i]=33;
            
        }
        
        //***************PRODUCCIONES DE GRAFICA DE BARRAS
        datos1.addValue(hab[0],"Sencilla", "Sencilla");
        datos1.addValue(hab[1],"Doble", "Doble");
        datos1.addValue(hab[2],"Triple", "Triple");

        //****************PRODUCCIONES DE GRAFICA CIRCULAR
        datos2.setValue("Sencilla",hab[0]);
        datos2.setValue("Doble",hab[1]);
        datos2.setValue("Triple",hab[2]);
        
        //GRAFICA DE BARRAS
        Grafica1=ChartFactory.createBarChart("TIPO DE HABITACION", "Tipo", "Habitaciones Disponibles", datos1, PlotOrientation.VERTICAL, true, true, false);
        
        //GRAFICA CIRCULAR
        Grafica2=ChartFactory.createPieChart("TIPO DE HABITACION", datos2,true,true,false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonCircula = new javax.swing.JButton();
        jButtonBarras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(21, 19, 19));

        jButtonCircula.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCircula.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jButtonCircula.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCircula.setText("GRAFICA CIRCULAR");
        jButtonCircula.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(157, 139, 5)));
        jButtonCircula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCirculaActionPerformed(evt);
            }
        });

        jButtonBarras.setBackground(new java.awt.Color(0, 0, 0));
        jButtonBarras.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jButtonBarras.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBarras.setText("GRAFICA BARRAS");
        jButtonBarras.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(157, 139, 5)));
        jButtonBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBarrasActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(157, 139, 5));
        jLabel2.setText("CONSULTAS DE GRAFICAS");

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(157, 139, 5));
        jLabel1.setText("Selecciona la opcion de tu preferencia");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jButtonCircula, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(jButtonBarras)
                .addGap(104, 104, 104))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(158, 158, 158))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonBarras, jButtonCircula});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCircula, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBarras))
                .addGap(84, 84, 84))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonBarras, jButtonCircula});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCirculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCirculaActionPerformed
        // TODO add your handling code here:
        //GRAFICA CIRCULAR
        ChartPanel panel1=new ChartPanel(Grafica2);
        JFrame Ventanados=new JFrame("Grafica Circular");
        Ventanados.getContentPane().add(panel1);
        Ventanados.setVisible(true);
        Ventanados.pack();
        Ventanados.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButtonCirculaActionPerformed

    private void jButtonBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBarrasActionPerformed
        // TODO add your handling code here:
        //GRAFICA DE BARRAS
        ChartPanel panel1=new ChartPanel(Grafica1);
        JFrame Ventanauno=new JFrame("Grafica de Barras");
        Ventanauno.getContentPane().add(panel1);
        Ventanauno.setVisible(true);
        Ventanauno.pack();
        Ventanauno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }//GEN-LAST:event_jButtonBarrasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Graficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graficas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBarras;
    private javax.swing.JButton jButtonCircula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
