/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.MotoboyDAO;
import javax.swing.JOptionPane;
import modelo.Motoboy;

/**
 *
 * @author Laryssa
 */
public class MotoboyGUI extends javax.swing.JFrame {

    /**
     * Creates new form MotoboyGUI
     */
    public MotoboyGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNomeMotoboy = new javax.swing.JTextField();
        btnSalvarMotoboy = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        btnRemoverMotoboy = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/telaP.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Cadastro de Motoboy");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 20, 160, 20);

        txtNomeMotoboy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeMotoboyActionPerformed(evt);
            }
        });
        getContentPane().add(txtNomeMotoboy);
        txtNomeMotoboy.setBounds(170, 70, 370, 20);

        btnSalvarMotoboy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalvarMotoboy.setText("Salvar");
        btnSalvarMotoboy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarMotoboyActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvarMotoboy);
        btnSalvarMotoboy.setBounds(190, 180, 90, 25);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Nome:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(110, 70, 50, 15);

        btnLimpar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar);
        btnLimpar.setBounds(320, 180, 90, 25);

        btnRemoverMotoboy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRemoverMotoboy.setText("Remover");
        btnRemoverMotoboy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverMotoboyActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemoverMotoboy);
        btnRemoverMotoboy.setBounds(450, 180, 100, 25);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/telaP.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 590, 230);

        setBounds(0, 0, 603, 263);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeMotoboyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeMotoboyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeMotoboyActionPerformed

    private void btnSalvarMotoboyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarMotoboyActionPerformed
        Motoboy motoboys = new Motoboy();
        motoboys.setNomeMotoboy(txtNomeMotoboy.getText());

        if ((txtNomeMotoboy.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Preencha o nome");
        } else {

            MotoboyDAO dao = new MotoboyDAO();
            dao.adiciona(motoboys);
            JOptionPane.showMessageDialog(null, "Motoboy " + txtNomeMotoboy.getText().toUpperCase() + " inserido com sucesso! ");
        }
        txtNomeMotoboy.setText("");       
    }//GEN-LAST:event_btnSalvarMotoboyActionPerformed

    private void btnRemoverMotoboyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverMotoboyActionPerformed
        String nomeMotoboy = txtNomeMotoboy.getText().toString();
        if ((txtNomeMotoboy.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Preencha o nome para ser excluido");
        } else {
            Motoboy motoboys = new Motoboy();
            MotoboyDAO dao = new MotoboyDAO(); 
            dao.remove(motoboys,nomeMotoboy);
            JOptionPane.showMessageDialog(null, "Motoboy " + txtNomeMotoboy.getText().toUpperCase() + " excluido com sucesso! ");
        }
        txtNomeMotoboy.setText("");      
    }//GEN-LAST:event_btnRemoverMotoboyActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtNomeMotoboy.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(MotoboyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MotoboyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MotoboyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MotoboyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MotoboyGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnRemoverMotoboy;
    private javax.swing.JButton btnSalvarMotoboy;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtNomeMotoboy;
    // End of variables declaration//GEN-END:variables
}
