package entidades;

public class huesped {

    private String nombre;
    private int dni;
    private String domicilio;
    private String correo;
    private int celular;

    public huesped() {
    }

    public huesped(String nombre, int dni, String domicilio, String correo, int celular) {
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.correo = correo;
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "huesped{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", domicilio='" + domicilio + '\'' +
                ", correo='" + correo + '\'' +
                ", celular=" + celular +
                '}';
    }
}
