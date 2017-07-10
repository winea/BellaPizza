/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import factory.ConnectionFactory;
import modelo.Cliente;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Pedido;
/**
 *
 * @author escol
 */
public class PedidoDAO {
    private Connection connection;
    Cliente cliente = new Cliente();
   
    public PedidoDAO(){
         this.connection = new ConnectionFactory().getConnection();
    }
    
    public Cliente pesquisa(Cliente cliente,Pedido pedido){ 
        
        String sql = ("select * from cliente WHERE Telefone like'%" + pedido.getPesquisa()+"%'");
        
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            rs.first();
            cliente.setNome(rs.getString("Nome"));
            cliente.setTelefone(rs.getInt("Telefone"));
            cliente.setRua(rs.getString("Rua"));
            cliente.setBairro(rs.getString("Bairro"));
            cliente.setNumero(rs.getInt("Numero"));
            cliente.setComplemento(rs.getString("Complemento"));  
        }
        catch(SQLException ex){
          JOptionPane.showMessageDialog(null,"Erro ao buscar cliente"+ex);  
        }
        return cliente;
    }
    
    
}
