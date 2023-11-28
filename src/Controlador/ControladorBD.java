package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ControladorBD {

    private static ControladorBD ref = new ControladorBD();

    private ControladorBD() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("ERROR: exception loading driver class");
        }
    }

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
