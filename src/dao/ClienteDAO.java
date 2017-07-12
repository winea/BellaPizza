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
    
    
    
    public void edita(Cliente cliente){
        String sql = ("Update clinte set Nome=?,Telefone=?,Rua=?,Bairro=?,Numero=?complemento=? where ");
        
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
          JOptionPane.showMessageDialog(null,"Erro ao alterar os dados"+ex);  
        }
        
    }
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
        
  }
