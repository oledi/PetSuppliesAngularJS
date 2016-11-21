/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.angulardemobackend;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author RERANA
 */
@Entity
@Table(name = "klanten")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Klanten.findAll", query = "SELECT k FROM Klanten k"),
    @NamedQuery(name = "Klanten.findById", query = "SELECT k FROM Klanten k WHERE k.id = :id")})
public class Klanten implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Lob
    @Size(max = 65535)
    @Column(name = "naam")
    private String naam;
    @Lob
    @Size(max = 65535)
    @Column(name = "adres")
    private String adres;
    @Lob
    @Size(max = 65535)
    @Column(name = "postcode")
    private String postcode;

    public Klanten() {
    }

    public Klanten(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Klanten)) {
            return false;
        }
        Klanten other = (Klanten) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.angulardemobackend.Klanten[ id=" + id + " ]";
    }
    
}
