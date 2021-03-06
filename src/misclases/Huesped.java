/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misclases;

import controlMySql.MySqlConn;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TheRickbro
 */
public class Huesped extends javax.swing.JFrame {

    /**
     * Creates new form Huesped
     */
    
    private MySqlConn conn;
    
    public Huesped() {
        this.conn = new MySqlConn();
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jTextFieldBuscarHuesped = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHuesped = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(21, 19, 19));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(157, 139, 5));
        jLabel1.setText("Ingresar nombre de huesped:");

        jTextFieldBuscarHuesped.setBackground(new java.awt.Color(21, 19, 19));
        jTextFieldBuscarHuesped.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jTextFieldBuscarHuesped.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldBuscarHuesped.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(157, 139, 5)));
        jTextFieldBuscarHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscarHuespedActionPerformed(evt);
            }
        });

        jTableHuesped.setBackground(new java.awt.Color(21, 19, 19));
        jTableHuesped.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(157, 139, 5)));
        jTableHuesped.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableHuesped);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldBuscarHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldBuscarHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldBuscarHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscarHuespedActionPerformed
        // TODO add your handling code here:
        
        String query = "select * from huespedes where nombre = "+"'"+this.jTextFieldBuscarHuesped.getText().trim() + "'";
        this.conn.Consult(query);
        int n = 0;
        try {
            this.conn.rs.last(); //se posiciona en el ultimo registro de la tabla
            n = this.conn.rs.getRow(); //regresa el numero actual del registro
            this.conn.rs.first();
        }
        catch (Exception e) {
            System.out.println("Error#1 ...");
        }
        if (n !=0 ) {
            System.out.println("n "+n);
            Object datos[][] = new Object[n][9];
            for(int i=0; i<n; i++) { //n total de registros
                try {
                    datos[i][0] = this.conn.rs.getString(1);
                    //datos[i][1] = this.conn.rs.getString(2);
                    //datos[i][2] = this.conn.rs.getString(3);
                    //datos[i][3] = this.conn.rs.getString(4);
                    datos[i][1] = this.conn.rs.getInt(5);
                    datos[i][2] = this.conn.rs.getInt(6);
                    //datos[i][6] = this.conn.rs.getString(7);
                    //datos[i][7] = this.conn.rs.getInt(8);
                    //datos[i][8] = this.conn.rs.getInt(9);
                    //datos[i][9] = this.conn.rs.getInt(10);
                    //String medico = this.conn.rs.getString(4); //no se usa
                    
                    this.conn.rs.next(); // avanzamos un registro
                }
                catch (Exception e) {
                    System.out.println("Error#2 ..."+e.getMessage());
                }
                //String aux = datos[i][3];
                //this.jLabelMostrarDiaSalida.setText(aux);
            }//fin for
            String columnas[] = {"Huesped", "Habitaci??n", "Piso"};
            jTableHuesped.setModel(new DefaultTableModel(datos, columnas));
            
            //String totalsincargos = String.valueOf(datos[0][8]);
            //int totalSC = Integer.parseInt (totalsincargos);
            //int totalFINAL = cuentaTotal + totalSC;
            //String totalMostrar = String.valueOf(totalFINAL); 
            //this.jLabelMostrarTotalPago.setText(totalMostrar);
                    
        } // fin if
        else {
            JOptionPane.showMessageDialog(this, "No hay datos ...");
        }
    }//GEN-LAST:event_jTextFieldBuscarHuespedActionPerformed

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
            java.util.logging.Logger.getLogger(Huesped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Huesped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Huesped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Huesped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Huesped().setVisible(true);
                ///Esto es una prueba
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableHuesped;
    private javax.swing.JTextField jTextFieldBuscarHuesped;
    // End of variables declaration//GEN-END:variables
}
