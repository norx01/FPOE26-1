package Parcial1;

public class Estudiantes
{
    private int codigo;
    private String nombre;
    private int edad;
    private String programaAcademico;

    public Estudiantes(int codigo, String nombre, int edad, String programaAcademico) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.programaAcademico = programaAcademico;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProgramaAcademico() {
        return programaAcademico;
    }

    public void setProgramaAcademico(String programaAcademico) {
        this.programaAcademico = programaAcademico;
    }
}
