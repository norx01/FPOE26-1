package excepcion;

import javax.swing.*;

public class Errores
{
    public void compilacion()
    {
        //Error de compilación
    /*
    Se da cuando no se respetan las reglas del lenguaje
    */
        //encapsulamiento tipo nombre = valor;
        //private int numero -> 10;
        //double valor = + 5 4;
    }

    public void logico()
    {
        //Error logico
    /*
    El programa compila y se ejecuta, pero produce un resultado incorrecto
    porque la lógica está mal planteada.
    */
        double nota1 = 3, nota2 = 3;
        double promedio = nota1 + nota2 / 2; // Falta agrupar
        System.out.println("promedio incorrecto: "+promedio);
        // Lo correcto puede ser:
        double promedioCorrecto = (nota1 + nota2) / 2;
        System.out.println("promedio correcto: "+promedioCorrecto);
    }

    public void tiempoEjecucion()
    {
        //double resultado = 10 / 0;
        //System.out.println("resultado: "+resultado);
    }

    public void ejemplo1()
    {
        String texto = JOptionPane.showInputDialog("ingrese su edad");

        try {
            // Esta línea puede fallar si texto no contiene un número válido.
            System.out.println("Edad");
            int edad = Integer.parseInt(texto);
            System.out.println("Edad registrada: " + edad);
        }
        catch (NumberFormatException e)
        {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Error en el valor ingresado");
            ejemplo1();
        }
    }

    public void ejemplo2()
    {
        String texto = JOptionPane.showInputDialog("ingrese su edad");

            // Esta línea puede fallar si texto no contiene un número válido.
            System.out.println("Edad");
            int edad = Integer.parseInt(texto);
            System.out.println("Edad registrada: " + edad);
    }

    public void aritmetica()
    {
        try {
            double numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
            double numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));

            double resultado = numero1 / numero2;
            System.out.println(resultado);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error: no se puede dividir entre cero.");
        }
        catch (NumberFormatException e)
        {
            System.out.println("Error: los valores ingresados no son numeros.");
        }
    }

    public void aritmetica2()
    {
        try {
            int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
            int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));

            double resultado = numero1 / numero2;
            System.out.println(resultado);
        }
        catch (Exception e)
        {
            System.out.println("Error");
        }
    }

    public void array()
    {
        try
        {
            int[] notas = {4, 5, 3};
            System.out.println(notas[5]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error: la posición solicitada no existe.");
        }
    }

    public void nulo()
    {
        try
        {
            String nombre = null;
            System.out.println(nombre.length());
        }
        catch (NullPointerException e)
        {
            System.out.println("Error: el nombre no ha sido inicializado.");
        }
    }

    public void finalException()
    {
        try
        {
            int resultado = 8 / 0;
            System.out.println("Resultado: " + resultado);
        }
        catch (ArithmeticException e)
        {
            System.out.println("No se pudo calcular.");
        }
        finally
        {
            System.out.println("Gracias por usar la calculadora.");
        }
    }

    static void main() {
        Errores errores = new Errores();
        errores.aritmetica2();
    }


}
