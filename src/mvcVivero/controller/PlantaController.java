package mvcVivero.controller;

import mvcVivero.model.Planta;

import java.util.ArrayList;
import java.util.List;

public class PlantaController
{
    List<Planta> plantas = new ArrayList<>();

    public void agregarPlanta(Planta planta)
    {
        plantas.add(planta);
    }

    public String mostrarPlantas()
    {
        StringBuffer sb = new StringBuffer();

        for (Planta planta : plantas)
        {
            sb.append(planta.toString() + "\n \n");
        }

        return sb.toString();
    }
}
