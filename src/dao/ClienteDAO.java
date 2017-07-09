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

/**
 *
 * @author escol
 */
public class ClienteDAO {
    private Connection connection;
    
    PreparedStatement pst = null;
    ResultSet rs = null;
    private Object jtfcodigo;
    
    public ClienteDAO(){
        this.connection = new ConnectionFactory().getConnection();     
    }
    
    public void Pesquisa(Cliente cliente){
        
        String sql = "select * from cliente where Codigo_Cliente=?";
        try{
            pst = connection.prepareStatement(sql);  
            pst.setString(1,jtfcodigo.getText());
            rs = pst.executeQuery();
            
            if(rs.next()){
                
            }
            else{
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
 

}
