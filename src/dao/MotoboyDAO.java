/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import factory.ConnectionFactory;
import modelo.Motoboy;
import java.sql.*;
import java.sql.PreparedStatement;
import java.Util;
/**
 *
 * @author Laryssa
 */
public class MotoboyDAO {
    private Connection connection;
    String nome;
    String ola;
    
    public MotoboyDAO(){ 
        this.connection = new ConnectionFactory().getConnection();
    } 
    public void adiciona(Motoboy motoboy){ 
        String sql = "INSERT INTO motoboy(Nome) VALUES(?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, motoboy.getNomeMotoboy());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        }      
    }   
}
