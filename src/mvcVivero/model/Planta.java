package mvcVivero.model;

public class Planta
{
    String nombre;
    String tipo;
    double altura;
    int precio;
    String color;
    boolean necesitaSolDirecto;
    boolean disponibilidad;
    boolean medicinal;
    boolean ornamental;

    public Planta(String nombre, String tipo, double altura, int precio, String color, boolean necesitaSolDirecto, boolean disponibilidad, boolean medicinal, boolean ornamental)
    {
        this.nombre = nombre;
        this.tipo = tipo;
        this.altura = altura;
        this.precio = precio;
        this.color = color;
        this.necesitaSolDirecto = necesitaSolDirecto;
        this.disponibilidad = disponibilidad;
        this.medicinal = medicinal;
        this.ornamental = ornamental;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isNecesitaSolDirecto() {
        return necesitaSolDirecto;
    }

    public void setNecesitaSolDirecto(boolean necesitaSolDirecto) {
        this.necesitaSolDirecto = necesitaSolDirecto;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public boolean isMedicinal() {
        return medicinal;
    }

    public void setMedicinal(boolean medicinal) {
        this.medicinal = medicinal;
    }

    public boolean isOrnamental() {
        return ornamental;
    }

    public void setOrnamental(boolean ornamental) {
        this.ornamental = ornamental;
    }

    @Override
    public String toString() {
        return "Planta" +
                "\nnombre='" + nombre + '\'' +
                "\ntipo='" + tipo + '\'' +
                "\naltura=" + altura +
                "\nprecio=" + precio +
                "\ncolor='" + color + '\'' +
                "\nnecesitaSolDirecto=" + necesitaSolDirecto +
                "\ndisponibilidad=" + disponibilidad +
                "\nmedicinal=" + medicinal +
                "\nornamental=" + ornamental;
    }
}
