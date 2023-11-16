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
    
    int edad;
    float notaMedia;
    GregorianCalendar fechaNacimiento;
    String nombreAlum;

    public Alumno(int edad, float notaMedia, GregorianCalendar fechaNacimiento, String nombreAlum) {
        this.edad = edad;
        this.notaMedia = notaMedia;
        this.fechaNacimiento = fechaNacimiento;
        this.nombreAlum = nombreAlum;
    }

    
    
    @Override
    public String toString() {
        return "Alumno{" + "edad=" + edad + ", notaMedia=" + notaMedia + ", fechaNacimiento=" + fechaNacimiento + ", nombreAlum=" + nombreAlum + '}';
    }

    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }

    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombreAlum() {
        return nombreAlum;
    }

    public void setNombreAlum(String nombreAlum) {
        this.nombreAlum = nombreAlum;
    }
    
    
    
    
}
