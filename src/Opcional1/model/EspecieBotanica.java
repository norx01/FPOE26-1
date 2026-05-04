package Opcional1.model;

public class EspecieBotanica
{
    private String codigo;
    private String nombreComun;
    private String nombreCientifico;
    private String familiaBotanica;
    private String tipoPlanta;
    private String habitat;
    private int alturaPromedio;
    private String estadoConservacion;
    private int nivelHumedad;
    private int nivelLuz;
    private String estadoBiologico;

    public EspecieBotanica(String codigo, String nombreComun, String nombreCientifico, String familiaBotanica, String tipoPlanta, String habitat, int alturaPromedio, String estadoConservacion, int nivelHumedad, int nivelLuz, String estadoBiologico) {
        this.codigo = codigo;
        this.nombreComun = nombreComun;
        this.nombreCientifico = nombreCientifico;
        this.familiaBotanica = familiaBotanica;
        this.tipoPlanta = tipoPlanta;
        this.habitat = habitat;
        this.alturaPromedio = alturaPromedio;
        this.estadoConservacion = estadoConservacion;
        this.nivelHumedad = nivelHumedad;
        this.nivelLuz = nivelLuz;
        this.estadoBiologico = estadoBiologico;
    }

    public EspecieBotanica() {

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getFamiliaBotanica() {
        return familiaBotanica;
    }

    public void setFamiliaBotanica(String familiaBotanica) {
        this.familiaBotanica = familiaBotanica;
    }

    public String getTipoPlanta() {
        return tipoPlanta;
    }

    public void setTipoPlanta(String tipoPlanta) {
        this.tipoPlanta = tipoPlanta;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getAlturaPromedio() {
        return alturaPromedio;
    }

    public void setAlturaPromedio(int alturaPromedio) {
        this.alturaPromedio = alturaPromedio;
    }

    public String getEstadoConservacion() {
        return estadoConservacion;
    }

    public void setEstadoConservacion(String estadoConservacion) {
        this.estadoConservacion = estadoConservacion;
    }

    public int getNivelHumedad() {
        return nivelHumedad;
    }

    public void setNivelHumedad(int nivelHumedad) {
        this.nivelHumedad = nivelHumedad;
    }

    public int getNivelLuz() {
        return nivelLuz;
    }

    public void setNivelLuz(int nivelLuz) {
        this.nivelLuz = nivelLuz;
    }

    public String getEstadoBiologico() {
        return estadoBiologico;
    }

    public void setEstadoBiologico(String estadoBiologico) {
        this.estadoBiologico = estadoBiologico;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("EspecieBotanica{");
        sb.append("alturaPromedio=").append(alturaPromedio);
        sb.append(", codigo='").append(codigo).append('\'');
        sb.append(", nombreComun='").append(nombreComun).append('\'');
        sb.append(", nombreCientifico='").append(nombreCientifico).append('\'');
        sb.append(", familiaBotanica='").append(familiaBotanica).append('\'');
        sb.append(", tipoPlanta='").append(tipoPlanta).append('\'');
        sb.append(", habitat='").append(habitat).append('\'');
        sb.append(", estadoConservacion='").append(estadoConservacion).append('\'');
        sb.append(", nivelHumedad=").append(nivelHumedad);
        sb.append(", nivelLuz=").append(nivelLuz);
        sb.append(", estadoBiologico=").append(estadoBiologico);
        sb.append('}');
        return sb.toString();
    }

    public void mostrar()
    {
        System.out.println(this.toString());
    }

}
