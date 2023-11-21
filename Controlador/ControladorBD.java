package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ControladorBD {

    private static Connection conexion;

    // Método estático para abrir la conexión a la base de datos
    public static void abrirConexion() {
        try {
            // Cargar el controlador JDBC
            Class.forName("org.apache.derby.jdbc.ClientDriver");

            // Establecer la conexión a la base de datos
            conexion = DriverManager.getConnection("jdbc:derby://localhost:1527/tutoralumno;user=tutoralumno;password=tutoralumno;create=true");

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
