package mvc.controller;

import mvc.model.Avion;

import java.util.ArrayList;
import java.util.List;

public class AvionController
{
    List<Avion> aviones = new ArrayList<>();

    public void agregarAvion(Avion avion)
    {
        aviones.add(avion);
    }

    public String mostrarAviones()
    {
        StringBuffer sb = new StringBuffer();

        for (Avion avion:aviones)
        {
            sb.append("nombre: "+avion.getNombre()
            +"\n modelo: "+avion.getModelo() +"\n anio: "+avion.getAnio()
            +"\n tipo: "+avion.getTipo() +"\n\n");
        }
        return sb.toString();
    }
}
