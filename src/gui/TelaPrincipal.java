/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Winy
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        jLabelCaixa = new javax.swing.JLabel();
        jButtonControle = new javax.swing.JButton();
        jLabelCardapio = new javax.swing.JLabel();
        jButtonCardapio = new javax.swing.JButton();
        jLabelPedidos = new javax.swing.JLabel();
        jButtonPedidos = new javax.swing.JButton();
        jLabelCadastro = new javax.swing.JLabel();
        jLabelApresentacao = new javax.swing.JLabel();
        jButtonCadMotoboys = new javax.swing.JButton();
        jButtonCadClientes = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
        jButtonFecharBemVindo = new javax.swing.JButton();
        jButtonCaixa = new javax.swing.JButton();
        jButtonEstoque = new javax.swing.JButton();
        jLabelEstoque = new javax.swing.JLabel();
        jLabelFundoTelaPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCadClientes = new javax.swing.JMenuItem();
        jMenuItemCadFuncionarios = new javax.swing.JMenuItem();
        jMenuPedidos = new javax.swing.JMenu();
        jMenuCardapio = new javax.swing.JMenu();
        jMenuItemCardapioPizza = new javax.swing.JMenuItem();
        jMenuItemcardapioRefri = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuItemRelatorioCaixa = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabelCaixa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelCaixa.setText("Relatorios");
        getContentPane().add(jLabelCaixa);
        jLabelCaixa.setBounds(350, 320, 100, 30);

        jButtonControle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/controle.png"))); // NOI18N
        jButtonControle.setToolTipText("Caixa");
        jButtonControle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonControleActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonControle);
        jButtonControle.setBounds(450, 360, 80, 80);

        jLabelCardapio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelCardapio.setText("Cardapio");
        getContentPane().add(jLabelCardapio);
        jLabelCardapio.setBounds(60, 330, 110, 20);

        jButtonCardapio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cardapio.png"))); // NOI18N
        jButtonCardapio.setToolTipText("Cardapio Pizzas");
        jButtonCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCardapioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCardapio);
        jButtonCardapio.setBounds(60, 360, 70, 80);

        jLabelPedidos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelPedidos.setText("Pedidos");
        getContentPane().add(jLabelPedidos);
        jLabelPedidos.setBounds(340, 140, 90, 20);

        jButtonPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pizzap.png"))); // NOI18N
        jButtonPedidos.setToolTipText("Pedidos Clientes");
        getContentPane().add(jButtonPedidos);
        jButtonPedidos.setBounds(340, 170, 80, 80);

        jLabelCadastro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelCadastro.setText("Cadastros");
        getContentPane().add(jLabelCadastro);
        jLabelCadastro.setBounds(30, 130, 90, 30);

        jLabelApresentacao.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelApresentacao.setText("Sistema de Gerenciamento de:");
        getContentPane().add(jLabelApresentacao);
        jLabelApresentacao.setBounds(20, 40, 370, 30);

        jButtonCadMotoboys.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/motoboy.png"))); // NOI18N
        jButtonCadMotoboys.setToolTipText("Motoboy");
        jButtonCadMotoboys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadMotoboysActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadMotoboys);
        jButtonCadMotoboys.setBounds(140, 170, 90, 80);

        jButtonCadClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/clientes.png"))); // NOI18N
        jButtonCadClientes.setToolTipText("Clientes");
        jButtonCadClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadClientesActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadClientes);
        jButtonCadClientes.setBounds(30, 170, 90, 80);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.jpg"))); // NOI18N
        getContentPane().add(jLabelLogo);
        jLabelLogo.setBounds(630, 80, 240, 180);

        jButtonFecharBemVindo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        jButtonFecharBemVindo.setToolTipText("Fechar Tela Bem Vindo");
        jButtonFecharBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharBemVindoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFecharBemVindo);
        jButtonFecharBemVindo.setBounds(940, 10, 60, 50);

        jButtonCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/caixa.png"))); // NOI18N
        jButtonCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCaixaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCaixa);
        jButtonCaixa.setBounds(350, 360, 80, 80);

        jButtonEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Ingredients.png"))); // NOI18N
        jButtonEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEstoqueActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEstoque);
        jButtonEstoque.setBounds(660, 360, 80, 80);

        jLabelEstoque.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelEstoque.setText("Estoque");
        getContentPane().add(jLabelEstoque);
        jLabelEstoque.setBounds(660, 320, 90, 30);

        jLabelFundoTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/telaP.png"))); // NOI18N
        getContentPane().add(jLabelFundoTelaPrincipal);
        jLabelFundoTelaPrincipal.setBounds(0, 0, 1020, 550);

        jMenuCadastro.setText("Cadastro");

        jMenuItemCadClientes.setText("Clientes");
        jMenuCadastro.add(jMenuItemCadClientes);

        jMenuItemCadFuncionarios.setText("Funcionarios");
        jMenuCadastro.add(jMenuItemCadFuncionarios);

        jMenuBar1.add(jMenuCadastro);

        jMenuPedidos.setText("Pedidos");
        jMenuBar1.add(jMenuPedidos);

        jMenuCardapio.setText("Cardapio");

        jMenuItemCardapioPizza.setText("Pizzas");
        jMenuCardapio.add(jMenuItemCardapioPizza);

        jMenuItemcardapioRefri.setText("Refrigerante");
        jMenuCardapio.add(jMenuItemcardapioRefri);

        jMenuBar1.add(jMenuCardapio);

        jMenuRelatorios.setText("Relatorios");

        jMenuItemRelatorioCaixa.setText("Caixa");
        jMenuRelatorios.add(jMenuItemRelatorioCaixa);

        jMenuBar1.add(jMenuRelatorios);

        jMenuSair.setText("Sair");

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1032, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFecharBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharBemVindoActionPerformed
      System.exit(0);
    }//GEN-LAST:event_jButtonFecharBemVindoActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed


    private void jButtonCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCardapioActionPerformed
        Cardapio c = new Cardapio();
        c.setVisible(true);
    }//GEN-LAST:event_jButtonCardapioActionPerformed

    private void jButtonCadClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadClientesActionPerformed
        // TODO add your handling code here:
        TelaCliente cliente = new TelaCliente();
        cliente.setVisible(true);
        
    }//GEN-LAST:event_jButtonCadClientesActionPerformed

    private void jButtonCadMotoboysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadMotoboysActionPerformed
        MotoboyGUI moto = new MotoboyGUI();
        moto.setVisible(true);
    }//GEN-LAST:event_jButtonCadMotoboysActionPerformed

    private void jButtonControleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonControleActionPerformed
        TelaRelatorioGUI r = new TelaRelatorioGUI();
        r.setVisible(true);
    }//GEN-LAST:event_jButtonControleActionPerformed

    private void jButtonCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCaixaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCaixaActionPerformed

    private void jButtonEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEstoqueActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadClientes;
    private javax.swing.JButton jButtonCadMotoboys;
    private javax.swing.JButton jButtonCaixa;
    private javax.swing.JButton jButtonCardapio;
    private javax.swing.JButton jButtonControle;
    private javax.swing.JButton jButtonEstoque;
    private javax.swing.JButton jButtonFecharBemVindo;
    private javax.swing.JButton jButtonPedidos;
    private javax.swing.JLabel jLabelApresentacao;
    private javax.swing.JLabel jLabelCadastro;
    private javax.swing.JLabel jLabelCaixa;
    private javax.swing.JLabel jLabelCardapio;
    private javax.swing.JLabel jLabelEstoque;
    private javax.swing.JLabel jLabelFundoTelaPrincipal;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelPedidos;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuCardapio;
    private javax.swing.JMenuItem jMenuItemCadClientes;
    private javax.swing.JMenuItem jMenuItemCadFuncionarios;
    private javax.swing.JMenuItem jMenuItemCardapioPizza;
    private javax.swing.JMenuItem jMenuItemRelatorioCaixa;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemcardapioRefri;
    private javax.swing.JMenu jMenuPedidos;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JMenu jMenuSair;
    // End of variables declaration//GEN-END:variables
}
