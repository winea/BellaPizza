/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author escol
 */
public class Pizza {

    private Integer codPizza=0;
    private String nomePizza;
    private Integer quantidadePizza=0;
    private float precoVendaPizza;

    public Integer getCodPizza() {
        return codPizza;
    }

    public void setCodPizza(Integer codPizza) {
        this.codPizza = codPizza;
    }

    public String getNomePizza() {
        return nomePizza;
    }

    public void setNomePizza(String nomePizza) {
        this.nomePizza = nomePizza;
    }

    public Integer getQuantidadePizza() {
        return quantidadePizza;
    }

    public void setQuantidadePizza(Integer quantidadePizza) {
        this.quantidadePizza = quantidadePizza;
    }

    public float getPrecoVendaPizza() {
        return precoVendaPizza;
    }

    public void setPrecoVendaPizza(float precoVendaPizza) {
        this.precoVendaPizza = precoVendaPizza;
    }
    
    

}
