package mvc.model;

public class Avion
{
    private String nombre;
    private String modelo;
    private int anio;
    private int cantPasajeros;
    private String tipo;

    public Avion(String nombre, String modelo, int anio, int cantPasajeros, String tipo) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.anio = anio;
        this.cantPasajeros = cantPasajeros;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
