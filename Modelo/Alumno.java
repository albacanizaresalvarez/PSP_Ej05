
package Modelo;

import java.util.GregorianCalendar;

public class Alumno {
    
    int codAlum;
    int edadAlum;
    String nombreAlum;
    String fotoAlum;
    float notaMediaAlum;
    GregorianCalendar fechaNacimiento;
    int codTutor;

    public Alumno(int codAlum, int edadAlum, String nombreAlum, String fotoAlum, float notaMediaAlum, int a, int m, int d, int codTutor) {
        this.codAlum = codAlum;
        this.edadAlum = edadAlum;
        this.nombreAlum = nombreAlum;
        this.fotoAlum = fotoAlum;
        this.notaMediaAlum = notaMediaAlum;
        this.fechaNacimiento = new GregorianCalendar (a, m, d);
        this.codTutor = codTutor;
    }
    
    public int getCodigoAlum() {
        return codAlum;
    }

    public void setCodigoAlum(int codigoAlum) {
        this.codAlum = codigoAlum;
    }

    public int getEdadAlum() {
        return edadAlum;
    }

    public void setEdadAlum(int edadAlum) {
        this.edadAlum = edadAlum;
    }

    public String getNombreAlum() {
        return nombreAlum;
    }

    public void setNombreAlum(String nombreAlum) {
        this.nombreAlum = nombreAlum;
    }

    public String getFotoAlum() {
        return fotoAlum;
    }

    public void setFotoAlum(String fotoAlum) {
        this.fotoAlum = fotoAlum;
    }

    public float getNotaMediaAlum() {
        return notaMediaAlum;
    }

    public void setNotaMediaAlum(float notaMediaAlum) {
        this.notaMediaAlum = notaMediaAlum;
    }

    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int a, int m, int d) {
        this.fechaNacimiento = new GregorianCalendar (a,m,d);
    }

    public int getCodTutor() {
        return codTutor;
    }

    public void setCodTutor(int codTutor) {
        this.codTutor = codTutor;
    }
}
