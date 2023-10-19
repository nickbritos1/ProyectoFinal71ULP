package entidades;

import java.time.LocalDate;

public class reserva {

    private huesped datosHuesped;
    private tipoHabitacion tipoHabitaciones;
    private int cantPersonas;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;

    public reserva() {
    }

    public reserva(huesped datosHuesped, tipoHabitacion tipoHabitaciones, int cantPersonas, LocalDate fechaEntrada, LocalDate fechaSalida) {
        this.datosHuesped = datosHuesped;
        this.tipoHabitaciones = tipoHabitaciones;
        this.cantPersonas = cantPersonas;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public huesped getDatosHuesped() {
        return datosHuesped;
    }

    public void setDatosHuesped(huesped datosHuesped) {
        this.datosHuesped = datosHuesped;
    }

    public tipoHabitacion getTipoHabitaciones() {
        return tipoHabitaciones;
    }

    public void setTipoHabitaciones(tipoHabitacion tipoHabitaciones) {
        this.tipoHabitaciones = tipoHabitaciones;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    @Override
    public String toString() {
        return "reserva{" +
                "datosHuesped=" + datosHuesped +
                ", tipoHabitaciones=" + tipoHabitaciones +
                ", cantPersonas=" + cantPersonas +
                ", fechaEntrada=" + fechaEntrada +
                ", fechaSalida=" + fechaSalida +
                '}';
    }
}
