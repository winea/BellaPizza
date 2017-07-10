package dao;


import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.EstoqueModelo;


/**
 *
 * @author Winy
 */

public class EstoqueDAO {
    private Connection connection;
 
    
    public EstoqueDAO (){
     this.connection = new ConnectionFactory().getConnection();
    }
    
    public void salvar (EstoqueModelo model){
     String sql = "INSERT INTO ingrediente(Nome,Quantidade,Preco_Unitario)" + "VALUES(?,?,?)";
        
            PreparedStatement stmt;
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1,model.getNome());
            stmt.setInt(2,model.getQuant());
            stmt.setDouble(3,model.getPreco());
            stmt.execute();
            stmt.close();
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao inserir dados\nErro:"+ex);
        }
           
    }
    
    public void remove(){
    
    }
    
    public void alterar (){
    
    }
    

           
    }
    

