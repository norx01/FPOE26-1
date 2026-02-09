import javax.swing.*;

/**
 * Clase calculadora, encargada de realizar las operaciones basicas
 * @author Juan
 * @version 1.0
 */
public class Calculadora
{
    //Atributos:
    /**
     * numero1, numero2, encargados de almacenar los numeros
     */
    int numero1, numero2;

    //Constructor de la clase

    /**
     * Constructor de la clase Calculadora
     * @param numero1, encargado de almacenar el primer numero
     * @param numero2, encargado de almacenar el segundo numero
     */
    public Calculadora(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //Metodos:

    /**
     * Metodo sumar, encargado de sumar dos numeros
     * @return, retorna la suma de los dos numeros
     */
    public int sumar()
    {
        return numero1 + numero2;
    }
    /**
     * Metodo restar, encargado de restar dos numeros
     * @return, retorna la resta de los dos numeros
     */
    public int restar()
    {
        return numero1 - numero2;
    }

    /**
     * Metodo multiplicar, encargado de multiplicar dos numeros
     * @return, retorna la multiplicacion de los dos numeros
     */
    public int multiplicar()
    {
        return numero1 * numero2;
    }

    /**
     * Metodo dividir, encargado de dividir dos numeros
     * @return, retorna la division de los dos numeros, realiza conversión de enteros a double
     */
    public double dividir()
    {
        return (double) numero1 / numero2;
    }

    /**
     * Metodo esPar, encargado de verificar si un numero es par o impar
     * @return, retorna true si el numero es par, false si es impar
     */
    public boolean esPar()
    {
        return  (numero1 % 2 == 0);
    }

    /**
     * Metodo main, encargado de ejecutar la aplicacion
     * @param args
     */
    public static void main(String[] args)
    {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

        Calculadora calculadora = new Calculadora( numero1,numero2);
        JOptionPane.showMessageDialog(null, "La suma es: "+calculadora.sumar());
        JOptionPane.showMessageDialog(null, "La resta es: "+calculadora.restar());
        JOptionPane.showMessageDialog(null, "La multiplicacion es: "+calculadora.multiplicar());
        JOptionPane.showMessageDialog(null, "La division es: "+calculadora.dividir());
        JOptionPane.showMessageDialog(null, "Es par?: "+calculadora.esPar());
    }

}
