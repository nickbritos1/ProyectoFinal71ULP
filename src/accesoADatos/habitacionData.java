package accesoADatos;

import java.sql.Connection;

public class habitacionData {
        private Connection con = null;
        private Object habitaciones;

        public habitacionData() {

            con=conexion.getConexion();

        }
}
