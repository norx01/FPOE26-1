package estructuraDatos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class PilasGUI {
    private JPanel mainPanel;
    private JTextField textField1;
    private JButton agregarButton;
    private JTextArea textArea1;
    private JButton mostrarUltimaPaginaButton;
    private JButton volverALaPaginaButton;

    Stack<String> historialWeb = new Stack<>();


    public PilasGUI()
    {
        textArea1.append("Historial Web");

        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = textField1.getText();
                historialWeb.push(texto);
                textArea1.append("\nPagina visitada: "+texto);
            }
        });
        mostrarUltimaPaginaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                textArea1.append("\nPagina actual: "+historialWeb.peek());
            }
        });
        volverALaPaginaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                textArea1.append("\nRetrocediendo de pagina: "+historialWeb.pop()+" -> "+historialWeb.peek());
            }
        });
    }

    static void main()
    {
        JFrame frame = new JFrame("Historial web");
        frame.setContentPane(new PilasGUI().mainPanel);
        frame.setDefaultCloseOperation(3);
        frame.pack();
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
