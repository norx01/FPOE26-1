package estructuraDatos;

import java.util.LinkedList;
import java.util.Queue;

public class Colas
{
    //Se crea la cola
    Queue<String> cola = new LinkedList<>();

    public void ejemploCola()
    {
        //Agregar 3 elementos a la cola
        cola.add("A");
        cola.add("B");
        cola.add("C");

        //Mostramos la cola actual
        System.out.println("Cola actual: "+cola);

        //Mostramos el primer elemento de la cola
        System.out.println("Primer elemento de la cola: "+cola.peek());

        //Procedemos a atender
        System.out.println("Atendiendo a: "+cola.poll());
        System.out.println("Atendiendo a: "+cola.poll());

        //Mostramos la cola final
        System.out.println("Cola final: "+cola);
    }

    static void main() {
        Colas colas = new Colas();
        colas.ejemploCola();
    }
}
