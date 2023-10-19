package accesoADatos;

import java.sql.Connection;

public class reservaData {

    private Connection con = null;
    private  huespedData md = new huespedData();
    private habitacionData ad = new habitacionData();

    public reservaData() {

        this.con=conexion.getConexion();

    }
}
