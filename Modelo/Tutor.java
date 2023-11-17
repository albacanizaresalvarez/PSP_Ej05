
package java05.pkg1;

import java.util.GregorianCalendar;

public class Tutor {
    int codTutor;
    String nombre;
    String apellidos;
    String fotoTutor;
    float sueldo;
    GregorianCalendar entradaCentro;

    public Tutor(int Codtutor, String nombre, String apellidos, String fototutor, float sueldo, int a, int m,int d) {
        this.codTutor = Codtutor;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fotoTutor = fototutor;
        this.sueldo = sueldo;
        this.entradaCentro = new GregorianCalendar(a,m,d);
    }
    
    public int getCodtutor() {
        return codTutor;
    }

    public void setCodtutor(int Codtutor) {
        this.codTutor = Codtutor;
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
        return fotoTutor;
    }

    public void setFototutor(String fototutor) {
        this.fotoTutor = fototutor;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public GregorianCalendar getEntradacentro() {
        return entradaCentro;
    }

    public void setEntradacentro(int a, int m, int d) {
        this.entradaCentro = new GregorianCalendar(a,m,d);
    }
    
    
}
