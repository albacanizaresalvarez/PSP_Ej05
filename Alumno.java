package Modelo;

import java.util.GregorianCalendar;

/**
 *
 * @author albit
 */
public class Alumno {
    
    int codAlum;
    int edadAlum;
    String nombreAlum;
    String fotoAlum;
    float notaMediaAlum;
    GregorianCalendar fechaNacimiento;

    public Alumno(int codAlum, int edadAlum, String nombreAlum, String fotoAlum, float notaMediaAlum, int a, int m, int d) {
        this.codAlum = codAlum;
        this.edadAlum = edadAlum;
        this.nombreAlum = nombreAlum;
        this.fotoAlum = fotoAlum;
        this.notaMediaAlum = notaMediaAlum;
        this.fechaNacimiento = new GregorianCalendar (a,m,d);
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

    public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Alumno{" + "codigoAlum=" + codAlum + ", edadAlum=" + edadAlum + ", nombreAlum=" + nombreAlum + ", fotoAlum=" + fotoAlum + ", notaMediaAlum=" + notaMediaAlum + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

}
