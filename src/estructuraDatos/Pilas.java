package estructuraDatos;

import java.util.Stack;

public class Pilas
{
    //Creamos la pila
    Stack<String> pila = new Stack<>();

    public void ejemploPila()
    {
        //Se agregan 3 elementos a la pila
        pila.push("A");
        pila.push("B");
        pila.push("C");

        //Mostramos la pila
        System.out.println("Pila Actual: "+pila);

        //Mostramos el primer elemento de la pila
        System.out.println("Primer elemento de la pila: "+pila.peek());

        //Mostramos y Eliminamos 2 elementos de la pila
        System.out.println("Sacando "+pila.pop());
        System.out.println("Sacando "+pila.pop());

        //Mostramos la pila Actual
        System.out.println("Pila Final: "+pila);
    }

    static void main()
    {
        Pilas pilas = new Pilas();
        pilas.ejemploPila();
    }
}
