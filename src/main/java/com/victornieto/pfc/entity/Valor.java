package com.victornieto.pfc.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author victor
 */
@Entity
@Table(name = "vvalor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Valor.findAll", query = "SELECT v FROM Valor v"),
    @NamedQuery(name = "Valor.findById", query = "SELECT v FROM Valor v WHERE v.id = :id"),
    @NamedQuery(name = "Valor.findByValor", query = "SELECT v FROM Valor v WHERE v.valor = :valor"),
    @NamedQuery(name = "Valor.findByUsuopera", query = "SELECT v FROM Valor v WHERE v.usuopera = :usuopera")})
public class Valor extends Base {
    private static final long serialVersionUID = 1L;
    @Size(max = 50)
    @Column(name = "valor")
    private String valor;
    @ManyToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name = "id_campo", referencedColumnName = "id")
    private Campo campo;
    @Size(max = 12)
    @Column(name = "usuopera")
    private String usuopera;

    public Valor() {
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Campo getCampo() {
        return campo;
    }

    public void setCampo(Campo campo) {
        this.campo = campo;
    }

    public String getUsuopera() {
        return usuopera;
    }

    public void setUsuopera(String usuopera) {
        this.usuopera = usuopera;
    }
    
}
