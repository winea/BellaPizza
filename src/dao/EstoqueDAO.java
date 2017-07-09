/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Winy
 */
public class EstoqueDAO {
     private Connection connection;
     int cod,quant, preco;
     String nome;
     Estoque estoque = new Estoque();
     
     
     public EstoqueDAO(){ 
        this.connection = new ConnectionFactory().getConnection();
    } 
     
    public void adiciona(Estoque estoque){ 
         String sql = "INSERT INTO ingrediente(Codigo_Ingrediente,Nome,Quantidade,Preco_Unitario)" + "VALUES(?,?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,ingrediente.getCodigo());
            stmt.setString(2,ingrediente.getNome());
            stmt.setString(3,ingrediente.getTelefone());
            stmt.setString(4,ingrediente.getRua());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        }      
    }   
     
}