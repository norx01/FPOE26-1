package persistencia;

import javax.swing.*;
import java.io.*;

public class Archivos
{
    private String nombreArchivo;
    private String contenido;

    public void crearArchivo() {
        nombreArchivo = JOptionPane.showInputDialog("Ingrese el nombre del archivo");
        try
        {
            File archivo = new File(nombreArchivo + ".txt");

            if (archivo.createNewFile()) {
                JOptionPane.showMessageDialog(null, "Archivo creado: " + archivo.getName());
            } else {
                JOptionPane.showMessageDialog(null, "El archivo ya existe");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al crear el archivo");
        }
    }

    public void escribirArchivo()
    {
        nombreArchivo = JOptionPane.showInputDialog("Ingrese el nombre del archivo");

        try
        {
            FileWriter writer = new FileWriter(nombreArchivo + ".txt");
            contenido = JOptionPane.showInputDialog("Ingrese el contenido del archivo");
            writer.write(contenido);
            writer.close();
            JOptionPane.showMessageDialog(null,"Archivo escrito con exito");
        }
        catch (IOException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Error al escribir el archivo");
        }
    }

    public void leerArchivo()
    {
        nombreArchivo = JOptionPane.showInputDialog("Ingrese el nombre del archivo");

        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo+".txt"));
            String linea;
            System.out.println("Archivo: "+" "+nombreArchivo+".txt");
            while ((linea = reader.readLine()) != null)
            {
                System.out.println(linea);
            }
            reader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Error al leer el archivo");
        }
    }

    public void agregarTexto()
    {
        nombreArchivo = JOptionPane.showInputDialog("Ingrese el nombre del archivo");

        try
        {
            FileWriter writer = new FileWriter(nombreArchivo + ".txt", true);
            contenido = JOptionPane.showInputDialog("Ingrese el contenido del archivo");
            writer.write("\n"+contenido);
            writer.close();
            JOptionPane.showMessageDialog(null,"Texto agregado con exito");
        }
        catch (IOException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Error al agregar texto");
        }
    }

    public void eliminarArchivo()
    {
        nombreArchivo = JOptionPane.showInputDialog("Ingrese el nombre del archivo");

        File archivo = new File(nombreArchivo + ".txt");
        if (archivo.delete())
            JOptionPane.showMessageDialog(null, "Archivo eliminado: " + archivo.getName());
        else
            JOptionPane.showMessageDialog(null, "Error al eliminar el archivo");
    }

    public void menu()
    {
        int op = Integer.parseInt(JOptionPane.showInputDialog
                ("1.Crear Archivo \n2.Escribir Archivo \n3.Leer archivo \n4.Agregar Texto" +
                        "\n5.Eliminar Archivo \n0.Salir"));

        switch (op)
        {
            case 1:
                crearArchivo();
                break;
            case 2:
                escribirArchivo();
                break;
            case 3:
                leerArchivo();
                break;
            case 4:
                agregarTexto();
                break;
            case 5:
                eliminarArchivo();
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

    static void main()
    {
        Archivos archivos = new Archivos();
        archivos.menu();
    }
}
