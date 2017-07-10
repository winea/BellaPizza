/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.EstoqueDAO;
import factory.ConexaoBD;
import modelo.EstoqueModelo;

/**
 *
 * @author Winy
 */
public class Estoque extends javax.swing.JFrame {

    EstoqueModelo mod = new EstoqueModelo();
    EstoqueDAO control = new EstoqueDAO();
    ConexaoBD conex = new ConexaoBD();
    
    public Estoque() {
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

        jLabel2Estoque = new javax.swing.JLabel();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelValor = new javax.swing.JLabel();
        jTextFieldValor = new javax.swing.JTextField();
        jLabelQuantidade = new javax.swing.JLabel();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEstoque = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2Estoque.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2Estoque.setText("Controle Estoque");
        getContentPane().add(jLabel2Estoque);
        jLabel2Estoque.setBounds(270, 10, 210, 40);

        jLabelCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCodigo.setText("Codigo:");
        getContentPane().add(jLabelCodigo);
        jLabelCodigo.setBounds(70, 80, 60, 20);

        jLabelNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNome.setText("Nome:");
        getContentPane().add(jLabelNome);
        jLabelNome.setBounds(250, 80, 50, 17);

        jTextFieldCodigo.setEnabled(false);
        getContentPane().add(jTextFieldCodigo);
        jTextFieldCodigo.setBounds(70, 110, 160, 30);

        jTextFieldNome.setEnabled(false);
        getContentPane().add(jTextFieldNome);
        jTextFieldNome.setBounds(250, 110, 300, 30);

        jLabelValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelValor.setText("Valor:");
        getContentPane().add(jLabelValor);
        jLabelValor.setBounds(570, 80, 70, 14);

        jTextFieldValor.setEnabled(false);
        jTextFieldValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldValor);
        jTextFieldValor.setBounds(570, 110, 140, 30);

        jLabelQuantidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelQuantidade.setText("Quantidade (gramas):");
        getContentPane().add(jLabelQuantidade);
        jLabelQuantidade.setBounds(70, 150, 150, 17);

        jTextFieldQuantidade.setEnabled(false);
        jTextFieldQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQuantidade);
        jTextFieldQuantidade.setBounds(70, 180, 160, 30);

        jTextFieldPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPesquisar);
        jTextFieldPesquisar.setBounds(70, 230, 470, 30);

        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/buscar.png"))); // NOI18N
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPesquisar);
        jButtonPesquisar.setBounds(590, 230, 120, 30);

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancel.png"))); // NOI18N
        jButtonCancelar.setText(" Cancelar");
        jButtonCancelar.setToolTipText("Cancelar");
        jButtonCancelar.setEnabled(false);
        getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(60, 460, 120, 30);

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair_1.png"))); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setToolTipText("Excluir");
        jButtonExcluir.setEnabled(false);
        getContentPane().add(jButtonExcluir);
        jButtonExcluir.setBounds(200, 460, 100, 30);

        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setToolTipText("Alterar");
        jButtonAlterar.setEnabled(false);
        getContentPane().add(jButtonAlterar);
        jButtonAlterar.setBounds(320, 460, 100, 30);

        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/novo.png"))); // NOI18N
        jButtonNovo.setText("Adicionar");
        jButtonNovo.setToolTipText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNovo);
        jButtonNovo.setBounds(440, 460, 110, 30);

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setToolTipText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalvar);
        jButtonSalvar.setBounds(570, 460, 110, 30);

        jTableEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Quantidade (g)", "Preço"
            }
        ));
        jScrollPane1.setViewportView(jTableEstoque);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 290, 600, 140);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 290, 640, 130);

        jLabelFundo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabelFundo);
        jLabelFundo.setBounds(30, 60, 710, 450);

        setSize(new java.awt.Dimension(801, 577));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldValorActionPerformed

    private void jTextFieldPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
       mod.setPesquisa(jTextFieldPesquisar.getText());
       EstoqueModelo model = control.Pesquisar(mod);
       jTextFieldCodigo.setText(String.valueOf(model.getCodigo()));
       jTextFieldNome.setText(model.getNome());
       jTextFieldQuantidade.setText(String.valueOf(model.getQuant()));
       jTextFieldValor.setText(String.valueOf(model.getPreco()));
       jButtonAlterar.setEnabled(true);
       jButtonExcluir.setEnabled(true);
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        mod.setNome(jTextFieldNome.getText());
        mod.setQuant(Integer.parseInt(jTextFieldQuantidade.getText()));
        mod.setPreco((int) Double.parseDouble(jTextFieldValor.getText()));
        control.Salvar(mod);
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTextFieldQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQuantidadeActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        //libera os demais campos para inserir dados
        jTextFieldNome.setEnabled(true);
        jTextFieldQuantidade.setEnabled(true);
        jTextFieldValor.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        
    }//GEN-LAST:event_jButtonNovoActionPerformed

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
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2Estoque;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelQuantidade;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEstoque;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTextField jTextFieldQuantidade;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
}
