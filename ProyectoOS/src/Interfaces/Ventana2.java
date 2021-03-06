/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import clases.ClasePrincipal;
import clases.Comunica;
import javax.swing.JOptionPane;

/**
 *
 * @author sralvaro
 */
public class Ventana2 extends javax.swing.JFrame {

    /**
     * Creates new form Ventana2
     */
    ClasePrincipal ejec = new ClasePrincipal();
    Comunica comu = new Comunica();

    int numGer = 1;
    int countdown = 3;
    int time = 1;
    boolean simulacion = true;
    int almacenPantalla = 40;
    int almacenBotones = 45;
    int almacenCamaras = 20;
    int almacenPin = 15;
    int lote = 0;
    int Telterminados = 0;
    int salaryPC = 0;
    int salaryPB = 0;
    int salaryPP = 0;
    int salaryPPin = 0;
    int salaryJefe = 0;
    int salaryGer = 0;
    int salaryEns = 0;
    
    public Ventana2() {
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

        Cambiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Campo5 = new javax.swing.JTextField();
        Campo4 = new javax.swing.JTextField();
        Campo1 = new javax.swing.JTextField();
        Campo2 = new javax.swing.JTextField();
        Campo3 = new javax.swing.JTextField();
        Terminar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Cambiar.setText("Cambiar");
        Cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiarActionPerformed(evt);
            }
        });

        jLabel1.setText("Recuerde solo 19 productores y por lo menos un ensamblador");

        jLabel2.setText("Productores de Pantalla");

        jLabel3.setText("Productores de Camaras");

        jLabel4.setText("Productores de Pin");

        jLabel5.setText("Productores de Botones");

        jLabel6.setText("Ensambladores");

        Campo5.setText("0");
        Campo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo5ActionPerformed(evt);
            }
        });

        Campo4.setText("0");
        Campo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo4ActionPerformed(evt);
            }
        });

        Campo1.setText("0");
        Campo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo1ActionPerformed(evt);
            }
        });

        Campo2.setText("0");
        Campo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo2ActionPerformed(evt);
            }
        });

        Campo3.setText("0");
        Campo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo3ActionPerformed(evt);
            }
        });

        Terminar2.setText("Terminar");
        Terminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Terminar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Campo1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(Campo2)
                    .addComponent(Campo3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Campo4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(28, 28, 28)
                                .addComponent(Campo5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Terminar2)
                            .addComponent(Cambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(Campo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Campo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(Campo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Campo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Campo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cambiar))
                .addGap(18, 18, 18)
                .addComponent(Terminar2)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiarActionPerformed
        // TODO add your handling code here:
        int numPP = Integer.parseInt(Campo1.getText());
        int numEns = Integer.parseInt(Campo5.getText());
        int numPPin = Integer.parseInt(Campo3.getText());
        int numPC = Integer.parseInt(Campo2.getText());
        int numPB = Integer.parseInt(Campo4.getText());
        if(numPC == 0 | numPB == 0 | numPPin == 0 | numPP == 0 | numEns == 0){
            JOptionPane.showMessageDialog(null, "Por lo menos 1 en cada campo");
        }
        else if(numPC + numPB + numPPin + numPP > 19){
            JOptionPane.showMessageDialog(null, "Maximo 19 productores");
        }else{
            System.out.println("\n" + "\n" + "\n" + "\n" + "\n" +"\n" + "\n" + "\n" + "\n" + "\n" +"\n" + "\n" + "\n" + "\n" + "\n" +"CAMBIO!!!!!!!!!!!!!!" + "\n" + "\n" + "\n" + "\n" + "\n");
            ejec.imprimir(time, numPC, numPPin, numPB, numPP, numGer, numEns, countdown, almacenPantalla, almacenBotones, almacenPin, almacenCamaras, lote, Telterminados, simulacion, comu);
        }
    }//GEN-LAST:event_CambiarActionPerformed

    private void Campo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campo5ActionPerformed

    private void Campo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campo1ActionPerformed

    private void Campo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campo2ActionPerformed

    private void Campo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campo3ActionPerformed

    private void Campo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo4ActionPerformed
        // TODO add your handling code here:    
    }//GEN-LAST:event_Campo4ActionPerformed

    private void Terminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Terminar2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_Terminar2ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cambiar;
    private javax.swing.JTextField Campo1;
    private javax.swing.JTextField Campo2;
    private javax.swing.JTextField Campo3;
    private javax.swing.JTextField Campo4;
    private javax.swing.JTextField Campo5;
    private javax.swing.JButton Terminar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
