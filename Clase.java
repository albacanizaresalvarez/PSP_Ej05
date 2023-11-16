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
public class Clase {
    
    int aforo; //cuantos alumnos caben
    float ubicacion; //planta1,aula3= 1,3
    GregorianCalendar fechaInauguracion;
    String nombreClase;

    public Clase(int aforo, float ubicacion, GregorianCalendar fechaInauguracion, String nombreClase) {
        this.aforo = aforo;
        this.ubicacion = ubicacion;
        this.fechaInauguracion = fechaInauguracion;
        this.nombreClase = nombreClase;
    }

    @Override
    public String toString() {
        return "Clase{" + "aforo=" + aforo + ", ubicacion=" + ubicacion + ", fechaInauguracion=" + fechaInauguracion + ", nombreClase=" + nombreClase + '}';
    }
    
    
    
    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public float getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(float ubicacion) {
        this.ubicacion = ubicacion;
    }

    public GregorianCalendar getFechaInauguracion() {
        return fechaInauguracion;
    }

    public void setFechaInauguracion(GregorianCalendar fechaInauguracion) {
        this.fechaInauguracion = fechaInauguracion;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }
    
    
    
    
}
