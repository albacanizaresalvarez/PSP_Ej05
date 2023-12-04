/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author alumno
 */
@Entity
@Table(name = "TUTOR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tutor_1.findAll", query = "SELECT t FROM Tutor_1 t")
    , @NamedQuery(name = "Tutor_1.findByCodtutor", query = "SELECT t FROM Tutor_1 t WHERE t.codtutor = :codtutor")
    , @NamedQuery(name = "Tutor_1.findByNombre", query = "SELECT t FROM Tutor_1 t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "Tutor_1.findByApellidos", query = "SELECT t FROM Tutor_1 t WHERE t.apellidos = :apellidos")
    , @NamedQuery(name = "Tutor_1.findByFototutor", query = "SELECT t FROM Tutor_1 t WHERE t.fototutor = :fototutor")
    , @NamedQuery(name = "Tutor_1.findBySueldo", query = "SELECT t FROM Tutor_1 t WHERE t.sueldo = :sueldo")
    , @NamedQuery(name = "Tutor_1.findByEntradacentro", query = "SELECT t FROM Tutor_1 t WHERE t.entradacentro = :entradacentro")
    , @NamedQuery(name = "Tutor_1.findByContrasena", query = "SELECT t FROM Tutor_1 t WHERE t.contrasena = :contrasena")})
public class Tutor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODTUTOR")
    private Integer codtutor;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Column(name = "FOTOTUTOR")
    private String fototutor;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SUELDO")
    private Float sueldo;
    @Column(name = "ENTRADACENTRO")
    @Temporal(TemporalType.DATE)
    private Date entradacentro;
    @Column(name = "CONTRASENA")
    private String contrasena;
    @OneToMany(mappedBy = "codtutor")
    private Collection<Alumno> alumnoCollection;

    public Tutor() {
    }

    public Tutor(Integer codtutor, String nombre, String apellidos, String fototutor, Float sueldo, Date entradacentro) {
        this.codtutor = codtutor;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fototutor = fototutor;
        this.sueldo = sueldo;
        this.entradacentro = entradacentro;
    }

    public Tutor(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    
    
    public Tutor(Integer codtutor) {
        this.codtutor = codtutor;
    }

    public Integer getCodtutor() {
        return codtutor;
    }

    public void setCodtutor(Integer codtutor) {
        this.codtutor = codtutor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFototutor() {
        return fototutor;
    }

    public void setFototutor(String fototutor) {
        this.fototutor = fototutor;
    }

    public Float getSueldo() {
        return sueldo;
    }

    public void setSueldo(Float sueldo) {
        this.sueldo = sueldo;
    }

    public Date getEntradacentro() {
        return entradacentro;
    }

    public void setEntradacentro(Date entradacentro) {
        this.entradacentro = entradacentro;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @XmlTransient
    public Collection<Alumno> getAlumnoCollection() {
        return alumnoCollection;
    }

    public void setAlumnoCollection(Collection<Alumno> alumnoCollection) {
        this.alumnoCollection = alumnoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codtutor != null ? codtutor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tutor)) {
            return false;
        }
        Tutor other = (Tutor) object;
        if ((this.codtutor == null && other.codtutor != null) || (this.codtutor != null && !this.codtutor.equals(other.codtutor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Tutor_1[ codtutor=" + codtutor + " ]";
    }
    
}