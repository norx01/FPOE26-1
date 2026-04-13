package Parcial1;

public class Materias
{
    private int codigo;
    private String nombre;
    private int creditos;
    private String descripcion;

    public Materias(int codigo, String nombre, int creditos, String descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
