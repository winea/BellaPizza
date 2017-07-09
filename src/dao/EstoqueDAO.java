
package dao;
import factory.ConnectionFactory;
import java.sql.*;
import java.sql.PreparedStatement;
import modelo.EstoqueModelo;

/**
 *
 * @author Winy
 */

public class EstoqueDAO {
    ConnectionFactory conexao = new ConnectionFactory();
     EstoqueModelo estoque = new EstoqueModelo();
    
     public EstoqueDAO (){
         ConnectionFactory conexao = new ConnectionFactory();
    } 
    
     public void Salvar (EstoqueModelo estoque){ 
         
        PreparedStatement pst = 
                 Statement st = conex.getConnection().createStatement();
         
    }

}