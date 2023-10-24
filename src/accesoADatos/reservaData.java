package accesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class reservaData<Reserva> {

    private Connection con = null;
    private huespedData huespedDataInstance = new huespedData();



    private habitacionData habitacionDataInstance =new habitacionData();



    public reservaData() {

        this.con = conexion.getConexion();


        huespedData md = new huespedData();
        habitacionData ad = new habitacionData();

    }

    public void insertarReserva(Reserva reserva) {
        try {
            // Crear una instancia de Connection (asegúrate de haber establecido la conexión a la base de datos previamente)
            Connection con = conexion.getConexion();

            // Crear una sentencia SQL para la inserción en la tabla de reservas
            String sql = "INSERT INTO reservas (fechaInicio, fechaFin, huespedID, habitacionID, cantPersonas) VALUES (?, ?, ?, ?, ?)";

            // Crear una instancia de PreparedStatement para ejecutar la consulta
            PreparedStatement statement = con.prepareStatement(sql);

            // Asignar valores a los parámetros de la consulta
            Date fechaInicio = null;
            statement.setDate(1, fechaInicio);
            Date fechaFin = null;
            statement.setDate(2, fechaFin);
            int huespedID = 0;
            statement.setInt(3, huespedID); // El ID del huésped que viene de la tabla de huéspedes
            int habitacionID = 0;
            statement.setInt(4, habitacionID); // El ID de la habitación que viene de la tabla de habitaciones
            int cantPersonas = 0;
            statement.setInt(5, cantPersonas);

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
