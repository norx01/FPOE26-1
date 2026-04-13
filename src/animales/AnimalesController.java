package animales;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class AnimalesController
{

    List<Animales> animales = new ArrayList<>();


    public void agregarAnimal(String nombre, String color)
    {
        animales.add(new Animales(nombre, color));
        JOptionPane.showMessageDialog(null, "Animal agregado");
    }


    public String mostrarAnimales()
    {
        StringBuilder sb = new StringBuilder();
        for (Animales animal : animales)
        {
            sb.append(animal.getNombre()).append(" - ").append(animal.getColor()).append("\n");
        }
        return sb.toString();
    }
}
