package estructuraDatos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;

public class ColasGUI {
    private JPanel mainPanel;
    private JButton agregarClienteButton;
    private JButton atenderClienteButton;
    private JButton visualizarClienteActualButton;
    private JTextArea textArea1;
    private JButton mostrarColaButton;

    Queue<String> cola = new LinkedList<>();



    int cliente = 1;

    public ColasGUI()
    {
        agregarClienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                cola.add("Cliente "+cliente);
                textArea1.append("Ha llegado un nuevo cliente - cliente "+cliente+"\n");
                cliente++;
            }
        });
        atenderClienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                textArea1.append("Se ha atendido al cliente: "+cola.poll()+"\n");
            }
        });
        visualizarClienteActualButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                textArea1.append("Se esta atendiendo al: "+cola.peek()+"\n");
            }
        });
        mostrarColaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                textArea1.append(cola+"\n");
            }
        });
    }

    static void main()
    {
        JFrame frame = new JFrame("Atencion de Banco");
        frame.setContentPane(new ColasGUI().mainPanel);
        frame.setDefaultCloseOperation(3);
        frame.pack();
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
