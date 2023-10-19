package accesoADatos;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

    private static final String URL="jdbc:mariadb://localhost/";
    private static final String DB="hotel71";
    private static final String USUARIO="root";
    private static final String CONTRASENA="";
    private static Connection conexion;

    public conexion() {}


    public static Connection getConexion(){

        if (conexion==null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                conexion = DriverManager.getConnection(URL+DB, USUARIO, CONTRASENA);

                JOptionPane.showMessageDialog(null, "Conectado");

            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar Driver");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexión");
            }
        } return conexion;
    }
}


