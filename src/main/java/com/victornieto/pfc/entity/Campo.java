package com.victornieto.pfc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "vcampo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Campo.findAll", query = "SELECT c FROM Campo c"),
    @NamedQuery(name = "Campo.findById", query = "SELECT c FROM Campo c WHERE c.id = :id"),
    @NamedQuery(name = "Campo.findByDes", query = "SELECT c FROM Campo c WHERE c.des = :des"),
    @NamedQuery(name = "Campo.findByTipo", query = "SELECT c FROM Campo c WHERE c.tipo = :tipo"),
    @NamedQuery(name = "Campo.findByMulti", query = "SELECT c FROM Campo c WHERE c.multi = :multi"),
    @NamedQuery(name = "Campo.findByLista", query = "SELECT c FROM Campo c WHERE c.lista = :lista"),
    @NamedQuery(name = "Campo.findByUsuopera", query = "SELECT c FROM Campo c WHERE c.usuopera = :usuopera")})

public class Campo extends Base {

    @Size(max = 25)
    @Column(name = "des")
    private String des;
    @Column(name = "tipo")
    private char tipo;
    @Column(name = "multi")
    private Boolean multi;
    @Column(name = "lista")
    private Boolean lista;
    @Size(max = 12)
    @Column(name = "usuopera")
    private String usuopera;

    public Campo() {
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public Boolean getMulti() {
        return multi;
    }

    public void setMulti(Boolean multi) {
        this.multi = multi;
    }

    public Boolean getLista() {
        return lista;
    }

    public void setLista(Boolean lista) {
        this.lista = lista;
    }

    public String getUsuopera() {
        return usuopera;
    }

    public void setUsuopera(String usuopera) {
        this.usuopera = usuopera;
    }

}
