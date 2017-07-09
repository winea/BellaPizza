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
    
    public ClienteDAO(){ 
        this.connection = new ConnectionFactory().getConnection();
    } 
    public void pesquisa(Cliente cliente){ 
        
        String sql = "select from * where Codigo_Cliente=?";
        try{
           PreparedStatement stmt = connection.prepareStatement(sql);
           stmt.setString(1,cliente.getCodigo());
           stmt.setString(2,cliente.getNome());
           stmt.setString(3,cliente.getTelefone());
           stmt.setString(4,cliente.getRua());
           stmt.setString(5,cliente.getNumero());
           stmt.setString(6,cliente.getBairro());
           stmt.setString(7,cliente.getBairro());
           rs = stmt.executeQuery();
           
           if(rs.next()){
               jtfnome.setText(rs.getString(2));
               jtftelefone.setText(rs.getString(3));
               jtfendereco.setText(rs.getString(4));
               jtfnumero.setText(rs.getString(5));
               jtfbairro.setText(rs.getString(6));
               jtfcomplemento.setText(rs.getString(7));
               
           }else{
               JOptionPane.showMessageDialog(null,"Cliente não cadastrado");
               jtfnome.setText(null);
               jtftelefone.setText(null);
               jtfendereco.setText(null);
               jtfbairro.setText(null);
               jtfnumero.setText(null);
               jtfcomplemento.setText(null);
   
           } 
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
    }   
}
