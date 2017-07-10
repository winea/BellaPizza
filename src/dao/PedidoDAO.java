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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Pedido;
import modelo.Pizza;
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
    
    public List<Pizza> getNome() throws SQLException {
        List<Pizza> listapizzas = new ArrayList<Pizza>();
        String sql = ("select * from cliente order by nome");
        PreparedStatement stmt = connection.prepareStatement(sql);
        Pizza pizza;
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            pizza = new Pizza();
            pizza.setNome(rs.getString("Nome"));
            pizza.setCodigo(rs.getInt("Codigo_Pizza"));
            
            listapizzas.add(pizza);
        }
        return listapizzas;   
    }
    
    public void Finalizar_Salvar(){
        
        String sql = "INSERT INTO pedido(Codigo_Cliente,Nome,Telefone,Rua,Numero,Bairro,Complemento)" + "VALUES(?,?,?,?,?,?,?)";
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
    
}
