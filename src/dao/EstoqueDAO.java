package dao;


import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.EstoqueModelo;


/**
 *
 * @author Winy
 */

public class EstoqueDAO {
    private Connection connection;
    String nome;
    
    public EstoqueDAO (){
     this.connection = new ConnectionFactory().getConnection();
    }
    
    public void salvar (EstoqueModelo model){
     String sql = "INSERT INTO ingrediente(Nome,Quantidade,Preco_Unitario)" + "VALUES(?,?,?)";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,model.getNome());
            stmt.setInt(2,model.getQuant());
            stmt.setDouble(3,model.getPreco());
            stmt.execute();
            stmt.close();
            } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao inserir dados\nErro:"+ex);
        }
           
    }
    
    public void remove(EstoqueModelo model, String nome){
            String sql = ("DELETE FROM ingrediente WHERE Nome = " +"'"+ model.getNome()+"'");
            System.out.println(sql);
            PreparedStatement stmt;
       try {
            stmt = connection.prepareStatement(sql);
            System.out.println(stmt.toString());
            stmt.executeUpdate();
            stmt.close();
            } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao remover produto\nErro:"+e);
        }
    }
    
    
    public void alterar (EstoqueModelo model){
            String sql = ("update ingrediente WHERE Nome = " +"'"+ model.getNome()+"'");
            PreparedStatement stmt;
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1,model.getQuant());
            stmt.setDouble(2,model.getPreco());
            stmt.execute();
            stmt.close();
            
            } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao alterar dados\nErro:"+ex);
        }
           
    }
    
    /*public EstoqueModelo buscar (EstoqueModelo model){
            public ResultSet rs;
            String sql = ("select * from ingrediente WHERE Nome like '%"+ model.getPesquisa()+"%'");
            PreparedStatement stmt;
        try {
            stmt = connection.prepareStatement(sql);
            model.setCodigo(stmt.rs.getInt("Codigo_Ingrediente"));
            model.setNome(stmt.rs.getString("Nome"));
            model.setQuant(stmt.rs.getInt("Quantidade"));
            model.setPreco(stmt.rs.getDouble("Preco_Unitario"));
            stmt.execute();
            stmt.close();
            
            } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Nao Encontrado\nErro:"+ex);
        }
            return model;
    }
       */    
}
    

