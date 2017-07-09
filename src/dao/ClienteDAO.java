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
import javax.swing.JOptionPane;
import gui.TelaCliente;

public class ClienteDAO {
    private Connection connection;
    ResultSet rs = null;
    String nome;
    Cliente cliente = new Cliente();
    
    public ClienteDAO(){ 
        this.connection = new ConnectionFactory().getConnection();
    } 
    public void cadastraCliente(Cliente cliente){ 
       
           String sql = "INSERT INTO cliente(Codigo_Cliente,Nome,Telefone,Rua,Numero,Bairro,Complemento)" + "VALUES(?,?,?,?,?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,cliente.getCodigo());
            stmt.setString(2,cliente.getNome());
            stmt.setString(3,cliente.getTelefone());
            stmt.setString(4,cliente.getRua());
            stmt.setString(5,cliente.getNumero());
            stmt.setString(6,cliente.getBairro());
            stmt.setString(7,cliente.getBairro());
            stmt.execute();
            stmt.close();
            
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        }
        
    }
    
    public void pesquisa(String nome){
           
    }
}