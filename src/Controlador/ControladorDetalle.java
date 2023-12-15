/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import Vista.*;
import java.sql.SQLException;
import java.sql.*;
import java.time.LocalDate;
import java.util.GregorianCalendar;

public class ControladorDetalle {

    private Statement statementDetalle;
    private ResultSet resultSet;
    private Connection conexion;
    private Statement statementResumen;
    
    private static int codAlum;
    public static String nombreAlum;
    private static int edadAlum;  
    private static String fotoAlum;
    private static float notaAlum;
    private static int codTutor;
    
    //nos conectamos a la base de datos y configuramos el statement para
    //obtener un resultset que nos permita navegar hacia alante y hacia atras.
    public ControladorDetalle() {
        try {
            conexion = ControladorBD.getConnection();
            statementDetalle = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, 
                                  ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    //obtenemos los datos en el resultset
    public ResultSet inicializarResultSet(String consulta) throws SQLException{
        resultSet = statementDetalle.executeQuery(consulta);
        return resultSet;
    }

    //pasamos los datos del resultset creando objetos de la clase Alumno
    public Alumno cargarDatosAlumno() throws SQLException {
        int codAlum = resultSet.getInt(1);
        String nombreAlum = resultSet.getString(2);
        int edadAlum = resultSet.getInt(3);
        String fotoAlum = resultSet.getString(4);
        float notaMediaAlum = resultSet.getInt(5);
        Date fechaNacimiento = resultSet.getDate(6);
        GregorianCalendar date = new GregorianCalendar();
        date.setTime(fechaNacimiento);

        Alumno a = new Alumno(codAlum, nombreAlum, edadAlum, fotoAlum, notaMediaAlum, fechaNacimiento);
        return a;
    }

    //metodos para navegar entre los registros obtenidos
     public void avanzar() throws SQLException {
        resultSet.next();
    }

    public void retroceder() throws SQLException {
        resultSet.previous();
    }

    public void irAlPrincipio() throws SQLException {
        resultSet.first();
    }

    public void irAlFinal() throws SQLException {
        resultSet.last();
    }

    public boolean esUltimo() throws SQLException {
        return resultSet.isLast();
    }

    public boolean esPrimero() throws SQLException {
        return resultSet.isFirst();
    }

    public void guardarDatosAlumno(String nuevoNombre, int nuevaEdad, Date nuevaFechaNacimiento, float nuevaNotaMedia, int codCentro) throws SQLException {
        resultSet.updateString(2, nuevoNombre);
        resultSet.updateInt(3, nuevaEdad);
        //resultSet.updateString(4, nuevoFoto);
        resultSet.updateFloat(5, nuevaNotaMedia);
        resultSet.updateDate(6, new java.sql.Date(nuevaFechaNacimiento.getTime()));
        resultSet.updateRow();
    }

    public void cerrarConexion() {
        try {
            if (statementDetalle != null) {
                statementDetalle.close();
            }
            if (statementResumen != null) {
                statementResumen.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

   

}
