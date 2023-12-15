/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class ControladorCollection {

    public static ArrayList<Alumno> Alumnos = new ArrayList();
    public static int vuelta = 0;

    // Constructor que recibe el Statement asociado al JPanel "resumen"
    public ControladorCollection() {
    }

    // Método para obtener una colección de objetos Tutor
    public ArrayList<Alumno> obteneralumnos() {
        if (vuelta == 0) {
            vuelta++;

            Connection conexion = null;
            PreparedStatement st; //lo usamos para ejecutar la consulta con parámetro (cod tutor)
            ResultSet rs = null; // aqui recogeremos todos los datos que la consulta nos proporcione
            try {
                conexion = (Connection) ControladorBD.getConnection();
                
                ControladorTutor CT = new ControladorTutor();
                int CodTutor = CT.getCodtutor();
                String sql = "SELECT CODALUM, NOMBREALUM, EDADALUM, NOTAMEDIAALUM, FECHANACIMIENTO, FOTOALUM FROM ALUMNO WHERE CODTUTOR = " + CodTutor;
                st = conexion.prepareStatement(sql);
                rs = st.executeQuery();

                //mientras siga habiendo resultados por leer, sigo almacenando en el array
                while (rs.next()) {
                    int CodAlum = rs.getInt("CODALUM");
                    String nombre = rs.getString("NOMBREALUM");
                    int edadalum = rs.getInt("EDADALUM");
                    float notamedia = rs.getFloat("NOTAMEDIAALUM");
                    Date fecha = rs.getDate("FECHANACIMIENTO");
                    String foto = rs.getString("FOTOALUM");

                    Alumno nuevo = new Alumno(CodAlum, nombre, edadalum, notamedia, fecha, foto);
                    Alumnos.add(nuevo);
                }
                
            } catch (SQLException Ex) {
            } finally {
                ControladorBD.close(rs);
                ControladorBD.close(conexion);
            }
        }
        return Alumnos;
    }

    public ArrayList<Alumno> insertarAlumnos() {
        Connection conexion = null;
        PreparedStatement st;
        ResultSet rs = null;
        try {
            conexion = (Connection) ControladorBD.getConnection();

            ControladorTutor CT = new ControladorTutor();
            int CodTutor = CT.getCodtutor();
            String sql = "insert into alumno WHERE CODTUTOR = " + CodTutor;
            st = conexion.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {
                int CodAlum = rs.getInt("CodAlum");
                String nombre = rs.getString("nombrealum");
                int edadalum = rs.getInt("edadalum");
                float notamedia = rs.getFloat("notamediaalum");
                Date fecha = rs.getDate("fechanacimiento");

                Alumno nuevo = new Alumno(CodAlum, nombre, edadalum, notamedia, fecha);
                Alumnos.add(nuevo);

            }

        } catch (SQLException Ex) {
        } finally {
            ControladorBD.close(rs);
            ControladorBD.close(conexion);
        }
        return Alumnos;
    }
}
