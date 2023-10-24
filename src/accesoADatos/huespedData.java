package accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class huespedData {

    private Connection con = null;
    private Object huespedes;

    public huespedData() {

        con=conexion.getConexion();

    }
    public void insertarHuesped(Huesped huesped) throws SQLException {
        PreparedStatement statement;
        try {
            String sql = "INSERT INTO huesped( nombre, documento,dni, domicilio, correo) VALUES(?; ?; ?)";
            statement = con.prepareStatement(sql);
            String nombre = null;
            statement.setString(1, nombre);
            String documento = null;
            statement.setString(2, documento);
            String dni = null;
            statement.setString(3, dni);
            String domicilio = null;
            statement.setString(4, domicilio);
            String correo = null;
            statement.setString(5, correo);

            int filasAfectadas = statement.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Inserción exitosa");
            } else {
                System.err.println("La inserción no tuvo éxito");
            }
            statement.close();
            con.close();
        } finally {

        }

        }
         statement.close();
        con.close();

        statement.close();
catch(SQLException e){
        e.printStackTrace();
    }
}
