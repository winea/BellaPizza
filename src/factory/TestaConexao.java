/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;
import gui.MotoboyGUI;
import gui.TelaLogin;
import gui.TelaRelatorioGUI;
import java.sql.Connection; 
import java.sql.SQLException; 
/**
 *
 * @author Laryssa
 */
public class TestaConexao {
    public static void main(String[] args) throws SQLException{
        Connection connection = new ConnectionFactory().getConnection();
      TelaLogin tela = new TelaLogin();
     TelaRelatorioGUI combos = new TelaRelatorioGUI();
     combos.carregaComboClientes();
     combos.carregeaComboPizza();
     combos.setVisible(true);
      //tela.setVisible(true);
        //connection.close();
        //System.out.println("Conexão aberta!");
        
    }
}
