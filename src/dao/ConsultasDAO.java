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
    
    /*public List<Pedido> getClientes() throws SQLException {
        List<Pedido> listaPedidos = new ArrayList<Pedido>();
        Statement st = conex.getConnection().createStatement();
        Pedido pedido;
        ResultSet rs = st.executeQuery("select * from pedido order by codigo_pedido");
        while (rs.next()) {
            pedido = new Pedido();
            pedido.setnome(rs.getString("nome"));
            pedido.settelefone(rs.getInt("telefone"));
            pedido.setrua(rs.getString("rua"));
            pedido.setbairro(rs.getString("bairro"));
            pedido.setnumero(rs.getInt("numero"));
            pedido.setcomplemento(rs.getString("complemento"));
            listaPedidos.add(pedido);
        }
        return listaPedidos;   
    }*/
    
}
