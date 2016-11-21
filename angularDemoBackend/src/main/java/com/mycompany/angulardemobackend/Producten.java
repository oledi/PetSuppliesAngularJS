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
 * @author rerana
 */
@Entity
@Table(name = "producten")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producten.findAll", query = "SELECT p FROM Producten p"),
    @NamedQuery(name = "Producten.findById", query = "SELECT p FROM Producten p WHERE p.id = :id"),
    @NamedQuery(name = "Producten.findByPrijs", query = "SELECT p FROM Producten p WHERE p.prijs = :prijs")})
public class Producten implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Lob
    @Size(max = 65535)
    @Column(name = "Naam")
    private String naam;
    @Lob
    @Size(max = 65535)
    @Column(name = "Beschrijving")
    private String beschrijving;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Prijs")
    private Double prijs;
    @Lob
    @Size(max = 65535)
    @Column(name = "PlaatleURL")
    private String plaatleURL;

    public Producten() {
    }

    public Producten(Integer id) {
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

    public String getBeschrijving() {
        return beschrijving;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public Double getPrijs() {
        return prijs;
    }

    public void setPrijs(Double prijs) {
        this.prijs = prijs;
    }

    public String getPlaatleURL() {
        return plaatleURL;
    }

    public void setPlaatleURL(String plaatleURL) {
        this.plaatleURL = plaatleURL;
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
        if (!(object instanceof Producten)) {
            return false;
        }
        Producten other = (Producten) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.angulardemobackend.Producten[ id=" + id + " ]";
    }
    
}
