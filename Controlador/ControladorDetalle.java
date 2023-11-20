/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ControladorDetalle {

    private Statement statement;
    private ResultSet resultSet;

    // Constructor que recibe el Statement asociado al JPanel "detalle"
    public ControladorDetalle(Statement statement) {
        this.statement = statement;
        this.resultSet = null; // Se inicializa como null, se establecerá más adelante
    }

    // Método para avanzar al siguiente registro en el ResultSet
    public boolean avanzar() {
        try {
            if (resultSet != null && resultSet.next()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Método para retroceder al registro anterior en el ResultSet
    public boolean retroceder() {
        try {
            if (resultSet != null && resultSet.previous()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Método para ir al primer registro en el ResultSet
    public boolean irAlInicio() {
        try {
            if (resultSet != null) {
                resultSet.beforeFirst();
                return resultSet.next();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Método para ir al último registro en el ResultSet
    public boolean irAlFinal() {
        try {
            if (resultSet != null) {
                resultSet.afterLast();
                return resultSet.previous();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Método para guardar o modificar un registro de alumno
    public void guardarModificarAlumno(Alumno alumno) {
//        try {
            if (resultSet != null) {
                // Implementa la lógica para guardar o modificar el registro en la base de datos
                // Puedes utilizar los métodos setXXX() en el PreparedStatement para establecer los valores
                // y luego ejecutar el update o insert según sea necesario.
            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    // Método para obtener un objeto Alumno basado en el registro actual del ResultSet
    public Alumno obtenerAlumnoActual() {
        try {
            if (resultSet != null) {
                // Implementa la lógica para construir un objeto Alumno basado en el registro actual
                // Puedes utilizar los métodos getXXX() en el ResultSet para obtener los valores de las columnas.
                int codigoAlum = resultSet.getInt("codigoAlum");
                int edadAlum = resultSet.getInt("edadAlum");
                String nombreAlum = resultSet.getString("nombreAlum");
                String fotoAlum = resultSet.getString("fotoAlum");
                float notaMediaAlum = resultSet.getFloat("notaMediaAlum");
                int a = resultSet.getInt("a");
                int m = resultSet.getInt("m");
                int d = resultSet.getInt("d");

                // Construir y devolver un objeto Alumno
                return new Alumno(codigoAlum, edadAlum, nombreAlum, fotoAlum, notaMediaAlum, a, m, d);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
