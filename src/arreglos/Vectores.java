package arreglos;

import javax.swing.*;

public class Vectores
{
    //Crear un vector
    int[] numeros = new int[5];

    //mostrar datos
    public void mostrarDatos()
    {
        for (int i = 0; i < numeros.length; i++)
        {
            System.out.println(numeros[i]);
        }
    }

    //Agregar Datos
    public void agregarDatos()
    {
        for (int i = 0; i < numeros.length; i++)
        {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero ["+i+"]"));
        }
        JOptionPane.showMessageDialog(null,"Datos registrados con exito");
    }

    //Eliminar Datos
    public void eliminarDatos()
    {
        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a eliminar"));
        numeros[posicion] = 0;
    }

    //Editar Datos
    public void editarDatos()
    {
        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a editar"));
        int nuevoValor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo valor"));
        numeros[posicion] = nuevoValor;
    }

    public void buscarDato()
    {
        int buscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato a buscar"));
        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++)
        {
            if (numeros[i] == buscar)
            {
                JOptionPane.showMessageDialog(null,"Dato encontrado en la posicion: "+i);
                encontrado = true;
            }
        }
        if (!encontrado)
        {
            JOptionPane.showMessageDialog(null,"Dato no encontrado");
        }
    }

    public void menu()
    {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("1.Agregar datos\n2.Mostrar datos\n3.Eliminar datos\n4.Editar datos\n5.Buscar dato"));
        switch (opcion)
        {
            case 1:
                agregarDatos();
                break;
            case 2:
                mostrarDatos();
                break;
            case 3:
                eliminarDatos();
                break;
            case 4:
                editarDatos();
                break;
            case 5:
                buscarDato();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opcion invalida");
                break;
        }
        menu();
    }



    public static void main(String[] args)
    {
        Vectores vectores = new Vectores();
        vectores.menu();
    }
}
