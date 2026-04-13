package Parcial1;

public class Registros
{
    private int codigoEstudiante;
    private int codigoMateria;

    public Registros(int codigoEstudiante, int codigoMateria) {
        this.codigoEstudiante = codigoEstudiante;
        this.codigoMateria = codigoMateria;
    }

    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }
    public int getCodigoMateria() {
        return codigoMateria;
    }
    public void setCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }
    public void setCodigoMateria(int codigoMateria) {
        this.codigoMateria = codigoMateria;
    }
}
