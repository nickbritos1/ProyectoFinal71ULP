package accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class habitacionData<Habitacion> {
    private Connection con = null;
    private Object habitaciones;

    public habitacionData() {

        con = conexion.getConexion();

    }

    public void insertarHabitacion(Habitacion habitacion) {
        // Código para insertar una habitación en la base de datos
        // Puedes usar PreparedStatement para ejecutar consultas SQL
        try {
            // Crear una instancia de Connection (asegúrate de haber establecido la conexión a la base de datos previamente)
            Connection con = conexion.getConexion();

            // Crear una sentencia SQL para la inserción
            String sql = "INSERT INTO habitaciones (id, tipoDeCamas, precioDeHabitacion, cantidadDeCamas, cantidadDePersonas) VALUES (?, ?, ?, ?, ?)";

            // Crear una instancia de PreparedStatement para ejecutar la consulta
            PreparedStatement statement = con.prepareStatement(sql);

            // Asignar valores a los parámetros de la consulta
            String id = null;
            String tipoDeCamas = null;
            double precioDeHabitacion = 0;
            int CantidadDeCamas = 0;
            int CantidadDePersonas = 0;
            statement.setString(1, id);
            statement.setString(2, tipoDeCamas);
            statement.setDouble(3, precioDeHabitacion);
            statement.setInt(4, CantidadDeCamas);
            statement.setInt(5, CantidadDePersonas);

            // Ejecutar la consulta de inserción
            int filasAfectadas = statement.executeUpdate();

            // Verificar si la inserción fue exitosa
            if (filasAfectadas > 0) {
                System.out.println("Inserción exitosa");
            } else {
                System.err.println("La inserción no tuvo éxito");
            }

            // Cerrar la conexión y el statement
            statement.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

