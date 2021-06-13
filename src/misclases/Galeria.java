/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misclases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class Galeria extends javax.swing.JFrame {

     //colocacion de la cantidad de imagenes
    ImageIcon Imagen[]=new ImageIcon[5];
    // contador
    int contador=1;
    
    
    public Galeria() {
        initComponents();
        for (int i = 1; i < 5; i++) {
            Imagen[i]=new ImageIcon(getClass().getResource("/imagenesgaleria/"+i+".jpg"));
        }
        visor1.setIcon(Imagen[1]);
    }

    //hola 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        visor1 = new javax.swing.JLabel();
        jButtonIzq = new javax.swing.JButton();
        jButtonPresentacion = new javax.swing.JButton();
        jButtonDere = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(21, 19, 19));

        visor1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonIzq.setText("Izquierda");
        jButtonIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIzqActionPerformed(evt);
            }
        });

        jButtonPresentacion.setText("Presentacion Automatica");
        jButtonPresentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPresentacionActionPerformed(evt);
            }
        });

        jButtonDere.setText("Derecha");
        jButtonDere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDereActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(visor1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jButtonIzq)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonPresentacion)
                .addGap(127, 127, 127)
                .addComponent(jButtonDere)
                .addGap(96, 96, 96))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(visor1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIzq)
                    .addComponent(jButtonPresentacion)
                    .addComponent(jButtonDere))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDereActionPerformed
        // TODO add your handling code here:
         if(contador==4){
             contador=0;
         }
         contador++;
         visor1.setIcon(Imagen[contador]);
    }//GEN-LAST:event_jButtonDereActionPerformed

    private void jButtonIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIzqActionPerformed
        // TODO add your handling code here:
        if(contador==1){
            contador=5;
        }
        contador--; 
        visor1.setIcon(Imagen[contador]);
    }//GEN-LAST:event_jButtonIzqActionPerformed

    private void jButtonPresentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPresentacionActionPerformed
        // TODO add your handling code here:
        Timer timer=new Timer(600,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                visor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesgaleria/"+contador+".jpg")));
                contador++;
                if(contador==5) contador=1;
            }
            
        });
        timer.start();
    }//GEN-LAST:event_jButtonPresentacionActionPerformed

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
            java.util.logging.Logger.getLogger(Galeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Galeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Galeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Galeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Galeria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDere;
    private javax.swing.JButton jButtonIzq;
    private javax.swing.JButton jButtonPresentacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel visor1;
    // End of variables declaration//GEN-END:variables
}
