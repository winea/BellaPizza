/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import factory.ConexaoBD;
import factory.ConnectionFactory;
import modelo.Cliente;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClienteDAO {
    private Connection connection;
    
    Cliente cliente = new Cliente();
    
    
   public ClienteDAO(){
       this.connection = new ConnectionFactory().getConnection();
   }
    public void cadastraCliente(Cliente cliente){ 
            
           String sql = "INSERT INTO cliente(Codigo_Cliente,Nome,Telefone,Rua,Numero,Bairro,Complemento)" + "VALUES(?,?,?,?,?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1,cliente.getCodigo());
            stmt.setString(2,cliente.getNome());
            stmt.setInt(3,cliente.getTelefone());
            stmt.setString(4,cliente.getRua());
            stmt.setInt(5,cliente.getNumero());
            stmt.setString(6,cliente.getBairro());
            stmt.setString(7,cliente.getBairro());
            stmt.execute();
        } 
        catch (SQLException u) { 
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar tente novamente"+u);
        }  
    }
    /**
     *
     * @param cliente
     */
    public void remove(Cliente cliente,int telefone){
        
            String sql = ("DELETE FROM cliente WHERE Telefone=" +"'"+ telefone+"'");
            System.out.println(sql);
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            System.out.println(stmt.toString());
            stmt.executeUpdate();
            stmt.close();
            JOptionPane.showMessageDialog(null,"Dados removidos com sucesso!");
        }
        catch(SQLException ex){
             throw new RuntimeException(ex);
        }catch(Exception i){
          System.out.println("Erro ao excluir :"+ i.getMessage());
        }
    }
        
    public Cliente pesquisa(Cliente cliente){
        return null;
       
//        try {
//            PreparedStatement stmt = connection.prepareStatement("select * from cliente where Telefone like '%"+cliente.getPesquisa()+"%'");
//            connection.rs.first();
//            cliente.setCodigo(connection.rs.getInt("Codigo_Cliente"));
//            cliente.setNome(connection.rs.getString("Nome"));
//            cliente.setTelefone(connection.rs.getInt("Telefone"));
//            cliente.setRua(connection.rs.getString("Rua"));
//            cliente.setNumero(connection.rs.getInt("Numero"));
//            cliente.setBairro(connection.rs.getString("Bairro"));
//            cliente.setComplemento(connection.rs.getString("Complemento")); 
//            
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null,"Cliente não cadastrado"+ex);
//        }  
//        return cliente;
//    }
    
  }
}