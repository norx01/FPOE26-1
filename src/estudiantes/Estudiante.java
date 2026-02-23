package estudiantes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Estudiante {
    private JPanel mainPanel;
    private JTextField nota1;
    private JTextField nota2;
    private JTextField nota3;
    private JTextField nota4;
    private JTextField nota5;
    private JButton calcularPromedioButton;


    public Estudiante() {
        calcularPromedioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                calcularPromedio();
            }
        });
    }

    public void calcularPromedio()
    {
        double nota1c = Double.parseDouble(nota1.getText());
        double nota2c = Double.parseDouble(nota2.getText());
        double nota3c = Double.parseDouble(nota3.getText());
        double nota4c = Double.parseDouble(nota4.getText());
        double nota5c = Double.parseDouble(nota5.getText());

        double promedio = nota1c * 0.15 + nota2c * 0.25 + nota3c * 0.1 + nota4c * 0.30 + nota5c * 0.30;

        JOptionPane.showMessageDialog(null, "Su promedio es: "+promedio);

        if (promedio >= 3)
        {
            mainPanel.setBackground(Color.green);
        }
        else
        {
            mainPanel.setBackground(Color.red);
            Toolkit.getDefaultToolkit().beep();
        }
    }

    public static void main(String[] args)
    {
        //Crea la ventana
        JFrame frame = new JFrame("Promedio");
        //Unir panel con la ventana
        frame.setContentPane(new Estudiante().mainPanel);
        //Cerrar la ventana y la ejecución
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Acomoda el tamaño de la ventana
        frame.pack();
        //Muestra la ventana
        frame.setVisible(true);
        //Determina el tamaño inicial de la ventana
        frame.setSize(500, 500);
        //Determina si es ajustable por el usuario
        frame.setResizable(false);
    }
}
