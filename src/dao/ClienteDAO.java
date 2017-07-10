/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import factory.ConexaoBD;
import modelo.Cliente;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClienteDAO {
    ConexaoBD conex = new ConexaoBD();
    Cliente cliente = new Cliente();
    
    
   
    public void cadastraCliente(Cliente cliente){ 
            
           String sql = "INSERT INTO cliente(Codigo_Cliente,Nome,Telefone,Rua,Numero,Bairro,Complemento)" + "VALUES(?,?,?,?,?,?,?)";
        try { 
            PreparedStatement stmt = conex.con.prepareStatement(sql);
            stmt.setInt(1,cliente.getCodigo());
            stmt.setString(2,cliente.getNome());
            stmt.setInt(3,cliente.getTelefone());
            stmt.setString(4,cliente.getRua());
            stmt.setInt(5,cliente.getNumero());
            stmt.setString(6,cliente.getBairro());
            stmt.setString(7,cliente.getBairro());
            stmt.execute();
            JOptionPane.showMessageDialog(null,"Cadastro do cliente foi realizado com sucesso");
        } 
        catch (SQLException u) { 
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar tente novamente"+u);
        }
        conex.desconecta();
        
    }
    
    /**
     *
     * @param cliente
     */
    public void remove(Cliente cliente){
        
        conex.conexao();
        try{
            PreparedStatement stmt = conex.con.prepareStatement("delete from cliente where Telefone=?");
            stmt.setInt(1,cliente.getCodigo());
            stmt.setString(2,cliente.getNome());
            stmt.setInt(3,cliente.getTelefone());
            stmt.setString(4,cliente.getRua());
            stmt.setInt(5,cliente.getNumero());
            stmt.setString(6,cliente.getBairro());
            stmt.setString(7,cliente.getComplemento());
            stmt.execute();
            JOptionPane.showMessageDialog(null,"Dados removidos com sucesso!");
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro ao excluir os dados, tente novamente"+ex);
        }
        
        conex.desconecta();
        
    }
    public Cliente pesquisa(Cliente cliente){
        conex.conexao();
        try {
            PreparedStatement stmt = conex.con.prepareStatement("select * from cliente where Telefone like '%"+cliente.getPesquisa()+"%'");
            conex.rs.first();
            cliente.setCodigo(conex.rs.getInt("Codigo_Cliente"));
            cliente.setNome(conex.rs.getString("Nome"));
            cliente.setTelefone(conex.rs.getInt("Telefone"));
            cliente.setRua(conex.rs.getString("Rua"));
            cliente.setNumero(conex.rs.getInt("Numero"));
            cliente.setBairro(conex.rs.getString("Bairro"));
            cliente.setComplemento(conex.rs.getString("Complemento")); 
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cliente não cadastrado"+ex);
        }  
        conex.desconecta();
        return cliente;
    }
}