
package modelo;

/**
 *
 * @author Winy
 */
public class EstoqueModelo {

   
    private String nome;
    private int codigo;
    private int quant;
    private int preco;
    private String pesquisa;
    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public int getCodigo() {
        return codigo;
    }

    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

   
    public int getQuant() {
        return quant;
    }

   
    public void setQuant(int quant) {
        this.quant = quant;
    }

    
    public int getPreco() {
        return preco;
    }

   
    public void setPreco(int preco) {
        this.preco = preco;
    }
     
    public String getPesquisa() {
        return pesquisa;
    }

    
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
}
