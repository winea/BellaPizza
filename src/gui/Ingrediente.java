/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package gui;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
/import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Winy
 */
/*@Entity
@Table(name = "ingrediente", catalog = "bellapizzabd", schema = "")
@NamedQueries({
    @NamedQuery(name = "Ingrediente.findAll", query = "SELECT i FROM Ingrediente i")
    , @NamedQuery(name = "Ingrediente.findByCodigoIngrediente", query = "SELECT i FROM Ingrediente i WHERE i.codigoIngrediente = :codigoIngrediente")
    , @NamedQuery(name = "Ingrediente.findByNome", query = "SELECT i FROM Ingrediente i WHERE i.nome = :nome")
    , @NamedQuery(name = "Ingrediente.findByQuantidade", query = "SELECT i FROM Ingrediente i WHERE i.quantidade = :quantidade")
    , @NamedQuery(name = "Ingrediente.findByPrecoUnitario", query = "SELECT i FROM Ingrediente i WHERE i.precoUnitario = :precoUnitario")})
public class Ingrediente implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Codigo_Ingrediente")
    private Integer codigoIngrediente;
    @Column(name = "Nome")
    private String nome;
    @Column(name = "Quantidade")
    private Integer quantidade;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Preco_Unitario")
    private BigDecimal precoUnitario;

    public Ingrediente() {
    }

    public Ingrediente(Integer codigoIngrediente) {
        this.codigoIngrediente = codigoIngrediente;
    }

    public Integer getCodigoIngrediente() {
        return codigoIngrediente;
    }

    public void setCodigoIngrediente(Integer codigoIngrediente) {
        Integer oldCodigoIngrediente = this.codigoIngrediente;
        this.codigoIngrediente = codigoIngrediente;
        changeSupport.firePropertyChange("codigoIngrediente", oldCodigoIngrediente, codigoIngrediente);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        Integer oldQuantidade = this.quantidade;
        this.quantidade = quantidade;
        changeSupport.firePropertyChange("quantidade", oldQuantidade, quantidade);
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(BigDecimal precoUnitario) {
        BigDecimal oldPrecoUnitario = this.precoUnitario;
        this.precoUnitario = precoUnitario;
        changeSupport.firePropertyChange("precoUnitario", oldPrecoUnitario, precoUnitario);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoIngrediente != null ? codigoIngrediente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ingrediente)) {
            return false;
        }
        Ingrediente other = (Ingrediente) object;
        if ((this.codigoIngrediente == null && other.codigoIngrediente != null) || (this.codigoIngrediente != null && !this.codigoIngrediente.equals(other.codigoIngrediente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gui.Ingrediente[ codigoIngrediente=" + codigoIngrediente + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}*/
