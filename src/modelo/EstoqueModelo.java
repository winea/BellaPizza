/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Winy
 */
public class EstoqueModelo {
     private String nome;
    private String codigo;
    private String quant;
    private String preco;
    

    public String getCodigo_Ingrediente(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getQuantidade(){
        return quant;
    }
    public void setQuantidade(String quant){
        this.quant = quant;
    }
    public String getPreco_Unitario(){
        return preco;
    }
    public void setPreco_Unitario(String preco){
        this.preco = preco;
    }
    
}
