package Controlador;

import Modelo.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.sql.PreparedStatement;
import java.util.Date;

public class ControladorTutor {

    private static int codTutor;
    public static String nombre;
    private static String apellidos;      
    private static String imagen;
    private static float sueldo;
    private static Date fecha;
    

    //intentamos iniciar sesion en la base de datos con los datos del tutor, usuario y contraseña
    public boolean entrar(String Usuario, String Contrasena) {
        Connection conexion = null;
        PreparedStatement pstatement;
        ResultSet resultSet = null;
        boolean ENTRA = false;
        System.out.println(Usuario);
        System.out.println(Contrasena);
        try {
            conexion = (Connection) ControladorBD.getConnection();

            pstatement = conexion.prepareStatement("SELECT CODTUTOR, NOMBRE , APELLIDOS, FOTOTUTOR,SUELDO, ENTRADACENTRO FROM TUTOR WHERE NOMBRE = ? AND CONTRASENA =?");
       
            pstatement.setString(1, Usuario);
            pstatement.setString(2, Contrasena);

            resultSet = pstatement.executeQuery();
           
            if (resultSet.next()) {
                ENTRA = true;
                nombre=resultSet.getString("NOMBRE");
                apellidos=resultSet.getString("APELLIDOS");
                sueldo=resultSet.getInt("SUELDO");
                codTutor = resultSet.getInt("CODTUTOR");
                imagen = resultSet.getString("FOTOTUTOR");
                fecha= resultSet.getDate("ENTRADACENTRO");
            }
           
        } catch (SQLException Ex) {
        } finally {
            ControladorBD.close(resultSet);
            ControladorBD.close(conexion);
        }
        return ENTRA;
    }

    
    //metodos necesarios para visualizar los datos en la vista
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
    
     public String getFoto() {
        return imagen;
    }
    
    public Date getFecha() {
        return fecha;
    }
}
