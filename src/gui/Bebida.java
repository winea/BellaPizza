/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

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
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author escol
 */
@Entity
@Table(name = "bebida", catalog = "bellapizzabd", schema = "")
@NamedQueries({
    @NamedQuery(name = "Bebida.findAll", query = "SELECT b FROM Bebida b")
    , @NamedQuery(name = "Bebida.findByCodigoBebida", query = "SELECT b FROM Bebida b WHERE b.codigoBebida = :codigoBebida")
    , @NamedQuery(name = "Bebida.findByNome", query = "SELECT b FROM Bebida b WHERE b.nome = :nome")
    , @NamedQuery(name = "Bebida.findByPrecoVenda", query = "SELECT b FROM Bebida b WHERE b.precoVenda = :precoVenda")
    , @NamedQuery(name = "Bebida.findByPrecoCompra", query = "SELECT b FROM Bebida b WHERE b.precoCompra = :precoCompra")})
public class Bebida implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Codigo_Bebida")
    private Integer codigoBebida;
    @Basic(optional = false)
    @Column(name = "Nome")
    private String nome;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Preco_Venda")
    private BigDecimal precoVenda;
    @Column(name = "Preco_Compra")
    private BigDecimal precoCompra;

    public Bebida() {
    }

    public Bebida(Integer codigoBebida) {
        this.codigoBebida = codigoBebida;
    }

    public Bebida(Integer codigoBebida, String nome) {
        this.codigoBebida = codigoBebida;
        this.nome = nome;
    }

    public Integer getCodigoBebida() {
        return codigoBebida;
    }

    public void setCodigoBebida(Integer codigoBebida) {
        Integer oldCodigoBebida = this.codigoBebida;
        this.codigoBebida = codigoBebida;
        changeSupport.firePropertyChange("codigoBebida", oldCodigoBebida, codigoBebida);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public BigDecimal getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(BigDecimal precoVenda) {
        BigDecimal oldPrecoVenda = this.precoVenda;
        this.precoVenda = precoVenda;
        changeSupport.firePropertyChange("precoVenda", oldPrecoVenda, precoVenda);
    }

    public BigDecimal getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(BigDecimal precoCompra) {
        BigDecimal oldPrecoCompra = this.precoCompra;
        this.precoCompra = precoCompra;
        changeSupport.firePropertyChange("precoCompra", oldPrecoCompra, precoCompra);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoBebida != null ? codigoBebida.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bebida)) {
            return false;
        }
        Bebida other = (Bebida) object;
        if ((this.codigoBebida == null && other.codigoBebida != null) || (this.codigoBebida != null && !this.codigoBebida.equals(other.codigoBebida))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gui.Bebida[ codigoBebida=" + codigoBebida + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
