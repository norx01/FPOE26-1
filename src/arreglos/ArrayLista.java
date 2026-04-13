package arreglos;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ArrayLista
{
    //crear un ArrayList
    List<Integer> numeros = new ArrayList<>();

    //metodo mostrar datos
    public void mostrarDatos()
    {
        for (int i = 0; i < numeros.size(); i++)
        {
            System.out.println(numeros.get(i));
        }

        for (int n:numeros)
        {
            System.out.println(n);
        }
    }

    //metodo agregar
    public void agregar()
    {
        int continuar = 0;

        do
        {
            int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor"));
            numeros.add(dato);
            continuar = JOptionPane.showConfirmDialog(null, "Desea continuar?");

        }while (continuar == 0);
    }

    //metodo eliminar
    public void eliminar()
    {
       int posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a eliminar"));
       numeros.remove(posicion);
    }

    //metodo editar
    public void editar()
    {
        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a editar"));
        int nuevoDato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo valor"));
        numeros.set(posicion, nuevoDato);

    }

    public static void main(String[] args)
    {
        ArrayLista array = new ArrayLista();
        array.agregar();
        array.mostrarDatos();
    }
}
