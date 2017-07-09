/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
//oi
/**
 *
 * @author escol
 */
public class Cliente {
    
    private String codigo;
    private String nome;
    private String telefone;
    private String rua;
    private String bairro;
    private String numero;
    private String complemento;

    public String getCodigo(){
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

    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getRua(){
        return rua;
    }
    public void setRua(String rua){
        this.rua = rua;
    }
    public String getNumero(){
        return numero;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }
    public String getBairro(){
        return bairro;
    }
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    public String getComplemento(){
        return complemento;
    }
    public void setComplemento(String complemento){
        this.complemento = complemento;
    }
}
