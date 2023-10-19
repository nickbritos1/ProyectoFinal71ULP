package entidades;

public class tipoHabitacion {

    private int codigo;
    private int cantPersonas;
    private int cantCamas;
    private String tipoCamas;
    public int precio;

    public tipoHabitacion() {
    }

    public tipoHabitacion(int codigo, int cantPersonas, int cantCamas, String tipoCamas, int precio) {
        this.codigo = codigo;
        this.cantPersonas = cantPersonas;
        this.cantCamas = cantCamas;
        this.tipoCamas = tipoCamas;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public int getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(int cantCamas) {
        this.cantCamas = cantCamas;
    }

    public String getTipoCamas() {
        return tipoCamas;
    }

    public void setTipoCamas(String tipoCamas) {
        this.tipoCamas = tipoCamas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "tipoHabitacion{" +
                "codigo=" + codigo +
                ", cantPersonas=" + cantPersonas +
                ", cantCamas=" + cantCamas +
                ", tipoCamas='" + tipoCamas + '\'' +
                ", precio=" + precio +
                '}';
    }
}
