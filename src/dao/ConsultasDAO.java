/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import factory.ConnectionFactory;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Pizza;


/**
 *
 * @author Laryssa
 */
public class ConsultasDAO {
    ConnectionFactory conex = new ConnectionFactory();
    
    public List<Cliente> getClientes() throws SQLException {
        List<Cliente> listaClientes = new ArrayList<Cliente>();
        Statement st = conex.getConnection().createStatement();
        Cliente cliente;
        ResultSet rs = st.executeQuery("select * from cliente order by nome");
        while (rs.next()) {
            cliente = new Cliente();
            cliente.setNome(rs.getString("nome"));
            cliente.setTelefone(rs.getInt("telefone"));
            cliente.setRua(rs.getString("rua"));
            cliente.setBairro(rs.getString("bairro"));
            cliente.setNumero(rs.getInt("numero"));
            cliente.setComplemento(rs.getString("complemento"));
            listaClientes.add(cliente);
        }
        return listaClientes;   
    }
    
    public List<Pizza> getPizzas() throws SQLException {
        List<Pizza> listaPizzas = new ArrayList<Pizza>();
        Statement st = conex.getConnection().createStatement();
        Pizza pizza;
        ResultSet rs = st.executeQuery("select * from pizza order by nome");
        while (rs.next()) {
            pizza = new Pizza();
            pizza.setNomePizza(rs.getString("nome"));
            pizza.setCodPizza(rs.getInt("codigo_pizza"));
            pizza.setQuantidadePizza(rs.getInt("quantidade"));
            pizza.setPrecoVendaPizza(rs.getFloat("preco_venda"));  
        }
        return listaPizzas;   
    }
    
    
    
    
     /*public List<Pedido> getPedidos() throws SQLException {
        List<Pedido> listaPedidos = new ArrayList<Cliente>();
        Statement st = conex.getConnection().createStatement();
        Pedido pedido;
        ResultSet rs = st.executeQuery("select * from pedido order by codigo_pedido");
        while (rs.next()) {
            pedido = new Pedido();
            cliente.setNome(rs.getString("nome"));
            cliente.setTelefone(rs.getInt("telefone"));
            cliente.setRua(rs.getString("rua"));
            cliente.setBairro(rs.getString("bairro"));
            cliente.setNumero(rs.getInt("numero"));
            cliente.setComplemento(rs.getString("complemento"));
            listaClientes.add(cliente);
        }
        return listaClientes;   
    }*/
    
  
    
}
