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
public class Cliente {
    
    int id;
    String nome;
    int telefone;
    String rua;
    String bairro;
    int numero;
    String complemento;

    public int getid(){
        return id;
    }
    public void setid(int id){
        this.id = id;
    }

    public String getnome(){
        return nome;
    }
    public void setnome(String nome){
        this.nome = nome;
    }

    public int gettelefone(){
        return telefone;
    }
    public void settelefone(int telefone){
        this.telefone = telefone;
    }
    public String getrua(){
        return rua;
    }
    public void setrua(String rua){
        this.rua = rua;
    }
    public int getnumero(){
        return numero;
    }
    public void setnumero(int numero){
        this.numero = numero;
    }
    public String getbairro(){
        return bairro;
    }
    public void setbairro(String bairro){
        this.bairro = bairro;
    }
    public String getcomplemento(){
        return complemento;
    }
    public void setcomplemento(String complemento){
        this.complemento = complemento;
    }
}
