/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException;



//import java.sql.Statement;

import javax.swing.JOptionPane;

/**
 *
 * @author Laryssa
 */
public class ConnectionFactory {
    

            

    public Connection getConnection(){
	try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bellapizzabd", "root", "3366");
            return con;
        } catch (SQLException ex1) {
            JOptionPane.showMessageDialog(null, "Erro Comando SQL " + ex1.getMessage());
        } catch(ClassNotFoundException ex2)      {
            JOptionPane.showMessageDialog(null, "Driver não encontrado" + ex2.getMessage());       
        } 
        return null;
     }
    
}
