
package java05.pkg1;

import java.util.GregorianCalendar;

public class Tutor {
    int Codtutor;
    String nombre;
    String apellidos;
    String fototutor;
    float sueldo;
    GregorianCalendar Entradacentro;

    public Tutor(int Codtutor, String nombre, String apellidos, String fototutor, float sueldo, int a, int m,int d) {
        this.Codtutor = Codtutor;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fototutor = fototutor;
        this.sueldo = sueldo;
        this.Entradacentro = new GregorianCalendar(a,m,d);
    }
    
    public int getCodtutor() {
        return Codtutor;
    }

    public void setCodtutor(int Codtutor) {
        this.Codtutor = Codtutor;
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

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public GregorianCalendar getEntradacentro() {
        return Entradacentro;
    }

    public void setEntradacentro(GregorianCalendar Entradacentro) {
        this.Entradacentro = Entradacentro;
    }
    
    
}
