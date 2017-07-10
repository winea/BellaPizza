
package factory;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Winy
 */
public class ConexaoBD {
    public Statement stm; //pesquisa BD
    public ResultSet rs; //Resultado pesquisa
    private String driver = "com.mysql.jdbc.Driver"; //identifica BD
    private String caminho = "jdbc:mysql://localhost:3306/bellapizza";
    private String usuario = "root";
    private String senha = "seliormu6";
    public Connection con;
    
    public void conexao (){
        
        try {
          System.setProperty ("jdbc.Drivers", driver);
            con = DriverManager.getConnection(caminho, usuario, senha);
            JOptionPane.showMessageDialog(null, "Conexao Efetuada com Sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar com o Banco de Dados!\n"+ex.getMessage());
            }
        
        }
    
    public void desconecta (){
        
        try {
            con.close();
            JOptionPane.showMessageDialog(null, "Desconectado com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro para desconectar com o Banco de Dados!"+ex.getMessage());
            }
        }
    }
