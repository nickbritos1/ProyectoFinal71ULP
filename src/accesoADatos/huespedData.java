package accesoADatos;

import java.sql.Connection;

public class huespedData {

    private Connection con = null;
    private Object huespedes;

    public huespedData() {

        con=conexion.getConexion();

    }
}
