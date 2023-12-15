package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ControladorBD {

    //Creamos una unica instancia de esta clase para toda la app
    private static ControladorBD ref = new ControladorBD();

    //intentamos cargar el controlador jdbc, lo necesitamos para interactuar con la base de datos
    private ControladorBD() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("ERROR: exception loading driver class");
        }
    }

    //establecemos la conexion con la base de datos con la url y nombre de usuario mas contraseña
    public static Connection getConnection() throws SQLException {
        Connection conexion = null;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("ERROR: exception loading driver class");
        }
        try {
            String url = "jdbc:derby://localhost:1527/tutoralumno";
            conexion = DriverManager.getConnection(url, "tutoralumno", "tutoralumno");
            System.out.println("Se ha conectado");

        } catch (SQLException e) {
            System.out.println("Error, no se ha conectado");
        }

        return conexion;
    }

    //estos metodos cierran los recursos de resultset, statement y conection
    public static void close(ResultSet rs) {
        try {
            rs.close();
        } catch (Exception ignored) {
        }
    }

    public static void close(Statement stmt) {
        try {
            stmt.close();
        } catch (Exception ignored) {
        }
    }

    public static void close(Connection conn) {
        try {
            conn.close();
        } catch (Exception ignored) {
        }
    }
}
