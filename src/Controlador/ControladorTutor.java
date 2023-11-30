/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.sql.PreparedStatement;

public class ControladorTutor {

    private static int codTutor;
    public static String nombre;
    private static String apellidos;      
    private static String fototutor;
    private static float sueldo;
    //private Date fecha;

    public void modificarTutor(String nuevoNombre, String nuevaContasena, String nuevaImagen) {
        Statement statement = null;
        ResultSet resultSet = null;
        Connection conexion = null;

        try {
            conexion = (Connection) ControladorBD.getConnection();
            statement = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);

            String sql = "Select * from Tutor Where codTutor = " + codTutor;
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                resultSet.updateString("nombre", nuevoNombre);
                resultSet.updateString("contrasena", nuevaContasena);
                resultSet.updateString("fototutor", nuevaImagen);

                resultSet.updateRow();
                System.out.println("Fila" + resultSet.getRow());
                System.out.println("codTutor: " + resultSet.getInt("codTutor")
                        + ", nombre: " + resultSet.getString("nombre")
                        + ", contrasena: " + resultSet.getString("contrasena")
                        + ", fototutor: " + resultSet.getString("fototutor"));
                setFoto(resultSet.getString("fototutor"));
            }
            conexion.commit();

        } catch (SQLException Ex) {
        } finally {
            ControladorBD.close(resultSet);
            ControladorBD.close(statement);
            ControladorBD.close(conexion);
        }
    }

    public void setFoto(String x) {
        fototutor = x;
    }

    public String getFoto() {
        return fototutor;
    }

    public boolean entrar(String Usuario, String Contrasena) {
        Connection conexion = null;
        PreparedStatement pstatement;
        ResultSet resultSet = null;
        boolean ENTRA = false;
        System.out.println(Usuario);
        System.out.println(Contrasena);
        try {
            conexion = (Connection) ControladorBD.getConnection();
            System.out.println("1");

            pstatement = conexion.prepareStatement("SELECT CODTUTOR, NOMBRE , APELLIDOS,SUELDO FROM TUTOR WHERE NOMBRE = ? AND CONTRASENA =?");
            System.out.println(pstatement);
            pstatement.setString(1, Usuario);
            pstatement.setString(2, Contrasena);

            resultSet = pstatement.executeQuery();
            System.out.println("1");
            if (resultSet.next()) {
                ENTRA = true;
                nombre=resultSet.getString("NOMBRE");
                apellidos=resultSet.getString("APELLIDOS");
                sueldo=resultSet.getInt("SUELDO");
                codTutor = resultSet.getInt("CODTUTOR");
            }
            System.out.println("3");

            

        } catch (SQLException Ex) {
        } finally {
            ControladorBD.close(resultSet);
            ControladorBD.close(conexion);
        }
        return ENTRA;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public float getSueldo() {
        return sueldo;
    }

    public int getCodtutor() {
        return codTutor;
    }

   
}
