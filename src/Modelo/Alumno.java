/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author alumno
 */
@Entity
@Table(name = "ALUMNO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Alumno_1.findAll", query = "SELECT a FROM Alumno_1 a")
    , @NamedQuery(name = "Alumno_1.findByCodalum", query = "SELECT a FROM Alumno_1 a WHERE a.codalum = :codalum")
    , @NamedQuery(name = "Alumno_1.findByNombrealum", query = "SELECT a FROM Alumno_1 a WHERE a.nombrealum = :nombrealum")
    , @NamedQuery(name = "Alumno_1.findByEdadalum", query = "SELECT a FROM Alumno_1 a WHERE a.edadalum = :edadalum")
    , @NamedQuery(name = "Alumno_1.findByFotoalum", query = "SELECT a FROM Alumno_1 a WHERE a.fotoalum = :fotoalum")
    , @NamedQuery(name = "Alumno_1.findByNotamediaalum", query = "SELECT a FROM Alumno_1 a WHERE a.notamediaalum = :notamediaalum")
    , @NamedQuery(name = "Alumno_1.findByFechanacimiento", query = "SELECT a FROM Alumno_1 a WHERE a.fechanacimiento = :fechanacimiento")})
public class Alumno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODALUM")
    private Integer codalum;
    @Column(name = "NOMBREALUM")
    private String nombrealum;
    @Column(name = "EDADALUM")
    private Integer edadalum;
    @Column(name = "FOTOALUM")
    private String fotoalum;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "NOTAMEDIAALUM")
    private Float notamediaalum;
    @Column(name = "FECHANACIMIENTO")
    @Temporal(TemporalType.DATE)
    private Date fechanacimiento;
    @JoinColumn(name = "CODTUTOR", referencedColumnName = "CODTUTOR")
    @ManyToOne
    private Tutor codtutor;

    public Alumno() {
    }

    public Alumno(Integer codalum, String nombrealum, Integer edadalum, String fotoalum, Float notamediaalum, Date fechanacimiento) {
        this.codalum = codalum;
        this.nombrealum = nombrealum;
        this.edadalum = edadalum;
        this.fotoalum = fotoalum;
        this.notamediaalum = notamediaalum;
        this.fechanacimiento = fechanacimiento;
    }
    
    

    public Alumno(Integer codalum) {
        this.codalum = codalum;
    }

    public Integer getCodalum() {
        return codalum;
    }

    public void setCodalum(Integer codalum) {
        this.codalum = codalum;
    }

    public String getNombrealum() {
        return nombrealum;
    }

    public void setNombrealum(String nombrealum) {
        this.nombrealum = nombrealum;
    }

    public Integer getEdadalum() {
        return edadalum;
    }

    public void setEdadalum(Integer edadalum) {
        this.edadalum = edadalum;
    }

    public String getFotoalum() {
        return fotoalum;
    }

    public void setFotoalum(String fotoalum) {
        this.fotoalum = fotoalum;
    }

    public Float getNotamediaalum() {
        return notamediaalum;
    }

    public void setNotamediaalum(Float notamediaalum) {
        this.notamediaalum = notamediaalum;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public Tutor getCodtutor() {
        return codtutor;
    }

    public void setCodtutor(Tutor codtutor) {
        this.codtutor = codtutor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codalum != null ? codalum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alumno)) {
            return false;
        }
        Alumno other = (Alumno) object;
        if ((this.codalum == null && other.codalum != null) || (this.codalum != null && !this.codalum.equals(other.codalum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Alumno_1[ codalum=" + codalum + " ]";
    }
    
}
