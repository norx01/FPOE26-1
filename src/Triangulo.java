import javax.swing.*;

public class Triangulo {

    //atributos
    int lado1, lado2,lado3;

    //constructor

    public Triangulo(int lado1, int lado2, int lado3)
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    //metodos
    public void tipoTriangulo()
    {
        if (lado1 == lado2 && lado1 == lado3)
            JOptionPane.showMessageDialog(null, "Es un triangulo equilatero");
        else if(lado1!=lado2 && lado1!=lado3 && lado2!=lado3)
            JOptionPane.showMessageDialog(null, "Es un triangulo escaleno");
        else
            JOptionPane.showMessageDialog(null, "Es un triangulo isosceles");
    }

    public static void main(String[] args) {
        int lado1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        int lado2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        int lado3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        Triangulo triangulo = new Triangulo(lado1,lado2,lado3);
        triangulo.tipoTriangulo();
    }
}
