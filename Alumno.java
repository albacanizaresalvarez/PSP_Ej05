/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_05;

import java.util.GregorianCalendar;

/**
 *
 * @author albit
 */
public class Alumno {
    
    int codigoAlum;
    int edadAlum;
    String nombreAlum;
    String fotoAlum;
    float notaMediaAlum;
    GregorianCalendar fechaNacimiento;

    public Alumno(int codigoAlum, int edadAlum, String nombreAlum, String fotoAlum, float notaMediaAlum, int a, int m, int d) {
        this.codigoAlum = codigoAlum;
        this.edadAlum = edadAlum;
        this.nombreAlum = nombreAlum;
        this.fotoAlum = fotoAlum;
        this.notaMediaAlum = notaMediaAlum;
        this.fechaNacimiento = new GregorianCalendar (a,m,d);
    }

    public int getCodigoAlum() {
        return codigoAlum;
    }

    public void setCodigoAlum(int codigoAlum) {
        this.codigoAlum = codigoAlum;
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
        return "Alumno{" + "codigoAlum=" + codigoAlum + ", edadAlum=" + edadAlum + ", nombreAlum=" + nombreAlum + ", fotoAlum=" + fotoAlum + ", notaMediaAlum=" + notaMediaAlum + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

   
   

    
    
    
}
