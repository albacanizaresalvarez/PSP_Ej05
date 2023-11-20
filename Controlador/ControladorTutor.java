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
import java.util.ArrayList;
import java.util.Collection;

public class ControladorTutor {

    private Statement statement;
    private ResultSet resultSet;

    // Constructor que recibe el Statement asociado al JPanel "resumen"
    public ControladorTutor(Statement statement) {
        this.statement = statement;
        this.resultSet = null; // Se inicializa como null, se establecerá más adelante
    }

    // Método para obtener una colección de objetos Tutor
    public Collection<Tutor> obtenerTutores() {
        Collection<Tutor> tutores = new ArrayList<>();

        try {
            if (resultSet != null) {
                // Iterar a través del ResultSet y construir objetos Tutor
                while (resultSet.next()) {
                    int Codtutor = resultSet.getInt("Codtutor");
                    String nombre = resultSet.getString("nombre");
                    String apellidos = resultSet.getString("apellidos");
                    String fototutor = resultSet.getString("fototutor");
                    float sueldo = resultSet.getFloat("sueldo");
                    int a = resultSet.getInt("a");
                    int m = resultSet.getInt("m");
                    int d = resultSet.getInt("d");

                    // Construir y agregar un objeto Tutor a la colección
                    tutores.add(new Tutor(Codtutor, nombre, apellidos, fototutor, sueldo, a, m, d));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tutores;
    }

    // Método para establecer el ResultSet asociado al JPanel "resumen"
    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    // Método para intercambiar dos objetos Tutor en la base de datos
    public void intercambiarTutores(Tutor tutor1, Tutor tutor2) {
//        try {
            if (resultSet != null) {
                // Implementa la lógica para intercambiar los datos de tutor1 y tutor2 en la base de datos
                // Puedes utilizar las sentencias SQL necesarias para realizar el intercambio.
            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    // Método para actualizar un objeto Tutor en la base de datos
    public void actualizarTutor(Tutor tutor) {
//        try {
            if (resultSet != null) {
                // Implementa la lógica para actualizar los datos del tutor en la base de datos
                // Puedes utilizar las sentencias SQL necesarias para realizar la actualización.
            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
}