/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



/*   // Abrir la conexión
        ControladorBD.abrirConexion();

        // Obtener los Statement según tus necesidades
        Statement statementVisualizarDetalle = ControladorBD.obtenerStatementVisualizarDetalle();
        Statement statementResumen = ControladorBD.obtenerStatementResumen();

        // Realizar operaciones con los Statement

        // Cerrar la conexión al finalizar
        ControladorBD.cerrarConexion();*/

public class ControladorBD {

    private static Connection conexion;

    // Método estático para abrir la conexión a la base de datos
    public static void abrirConexion() {
        try {
            // Cargar el controlador JDBC
            Class.forName("org.sqlite.JDBC");

            // Establecer la conexión a la base de datos
            conexion = DriverManager.getConnection("jdbc:sqlite:mi_base_datos.db");

            System.out.println("Conexión establecida correctamente.");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    // Método estático para cerrar la conexión a la base de datos
    public static void cerrarConexion() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                System.out.println("Conexión cerrada correctamente.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método estático para obtener un Statement para el panel "visualizar/detalle"
    public static Statement obtenerStatementVisualizarDetalle() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                // Crear un Statement para el panel "visualizar/detalle"
                return conexion.createStatement();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Método estático para obtener un Statement para el panel "resumen"
    public static Statement obtenerStatementResumen() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                // Crear un Statement para el panel "resumen"
                return conexion.createStatement();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
