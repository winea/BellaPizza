
package dao;

import factory.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.EstoqueModelo;


/**
 *
 * @author Winy
 */

public class EstoqueDAO {
    
    ConexaoBD conex = new ConexaoBD();
    EstoqueModelo mod = new EstoqueModelo();
    
    public void Salvar(EstoqueModelo mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into ingredientes (Nome, Quantidade, Preco_Unitario) values (?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setInt(2, mod.getQuant());
            pst.setDouble(3, mod.getPreco());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados\nErro:"+ex);
        }
        conex.desconecta();
    }
    
    public EstoqueModelo Pesquisar (EstoqueModelo mod){
        conex.conexao();
        conex.executaSql("select *from ingredientes where Nome like '%"+ mod.getPesquisa() +"%'");
        
        try {
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("Codigo_Ingrediente"));
            mod.setNome(conex.rs.getString("Nome"));
            mod.setQuant(conex.rs.getInt("Quantidade"));
            mod.setPreco((int) conex.rs.getDouble("Preco_Unitario"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Produto nao encontrado\nErro:"+ex);
        }
        
        conex.desconecta();
        return mod;
    }
            
}