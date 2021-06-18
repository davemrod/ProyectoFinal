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
import java.applet.AudioClip;

public class Galeria extends javax.swing.JFrame {

    AudioClip song;
     //colocacion de la cantidad de imagenes
    ImageIcon Imagen[]=new ImageIcon[37];
    // contador
    int contador=1;
    
    
    
    public Galeria() {
        initComponents();
        this.setLocationRelativeTo(this);
        for (int i = 1; i < 37; i++) {
            Imagen[i]=new ImageIcon(getClass().getResource("/imagenesgaleria/"+i+".jpg"));
        }
        visor1.setIcon(Imagen[1]);
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
        visor1 = new javax.swing.JLabel();
        jButtonIzq = new javax.swing.JButton();
        jButtonPresentacion = new javax.swing.JButton();
        jButtonDere = new javax.swing.JButton();
        jButtonPlay = new javax.swing.JButton();
        jButtonStop = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(21, 19, 19));

        visor1.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(157, 139, 5)));

        jButtonIzq.setBackground(new java.awt.Color(0, 0, 0));
        jButtonIzq.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jButtonIzq.setForeground(new java.awt.Color(157, 139, 5));
        jButtonIzq.setText("Izquierda");
        jButtonIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIzqActionPerformed(evt);
            }
        });

        jButtonPresentacion.setBackground(new java.awt.Color(0, 0, 0));
        jButtonPresentacion.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jButtonPresentacion.setForeground(new java.awt.Color(157, 139, 5));
        jButtonPresentacion.setText("Presentacion Automatica");
        jButtonPresentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPresentacionActionPerformed(evt);
            }
        });

        jButtonDere.setBackground(new java.awt.Color(0, 0, 0));
        jButtonDere.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jButtonDere.setForeground(new java.awt.Color(157, 139, 5));
        jButtonDere.setText("Derecha");
        jButtonDere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDereActionPerformed(evt);
            }
        });

        jButtonPlay.setBackground(new java.awt.Color(0, 0, 0));
        jButtonPlay.setFont(new java.awt.Font("Lucida Fax", 0, 10)); // NOI18N
        jButtonPlay.setForeground(new java.awt.Color(157, 139, 5));
        jButtonPlay.setText("PLAY");
        jButtonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlayActionPerformed(evt);
            }
        });

        jButtonStop.setBackground(new java.awt.Color(0, 0, 0));
        jButtonStop.setFont(new java.awt.Font("Lucida Fax", 0, 10)); // NOI18N
        jButtonStop.setForeground(new java.awt.Color(157, 139, 5));
        jButtonStop.setText("STOP");
        jButtonStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStopActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(157, 139, 5));
        jLabel1.setText("Music");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jButtonIzq)
                        .addGap(61, 61, 61)
                        .addComponent(jButtonPresentacion)
                        .addGap(66, 66, 66)
                        .addComponent(jButtonDere)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonPlay)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonStop))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(48, 48, 48))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(visor1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(visor1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonIzq)
                            .addComponent(jButtonPresentacion)
                            .addComponent(jButtonDere))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonPlay)
                            .addComponent(jButtonStop))
                        .addGap(16, 16, 16))))
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
         if(contador==36){
             contador=0;
         }
         contador++;
         visor1.setIcon(Imagen[contador]);
    }//GEN-LAST:event_jButtonDereActionPerformed

    private void jButtonIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIzqActionPerformed
        // TODO add your handling code here:
        if(contador==1){
            contador=37;
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
                if(contador==37) contador=1;
            }
            
        });
        timer.start();
    }//GEN-LAST:event_jButtonPresentacionActionPerformed

    private void jButtonPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlayActionPerformed
        // TODO add your handling code here:
        song=java.applet.Applet.newAudioClip(getClass().getResource("/misclases/rolita2.wav"));
        song.play();
    }//GEN-LAST:event_jButtonPlayActionPerformed

    private void jButtonStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStopActionPerformed
        // TODO add your handling code here:
        song.stop();
    }//GEN-LAST:event_jButtonStopActionPerformed

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
    private javax.swing.JButton jButtonPlay;
    private javax.swing.JButton jButtonPresentacion;
    private javax.swing.JButton jButtonStop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel visor1;
    // End of variables declaration//GEN-END:variables
}
