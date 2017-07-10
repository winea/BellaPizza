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
/**
 *
 * @author escol
 */
public class PedidoDAO {
    ConexaoBD conex = new ConexaoBD();
    Cliente cliente = new Cliente();
}
