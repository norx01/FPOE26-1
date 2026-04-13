package mvc.view;

import mvc.controller.AvionController;
import mvc.model.Avion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AvionView {
    private JPanel mainPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JSpinner spinner1;
    private JSpinner spinner2;
    private JComboBox comboBox1;
    private JButton registrarAvionButton;
    private JButton mostrarAvionesButton;
    private JTextArea textArea1;

    private AvionController avionController;

    public AvionView()
    {
        avionController = new AvionController();

        registrarAvionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String nombre = textField1.getText();
                String modelo = textField2.getText();
                int anio = (int)spinner1.getValue();
                int capacidad = (int)spinner2.getValue();
                String tipo = comboBox1.getSelectedItem().toString();

                avionController.agregarAvion(new Avion(nombre,modelo,anio,capacidad,tipo));
                JOptionPane.showMessageDialog(null, "Avion registrado");
            }
        });

        mostrarAvionesButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                textArea1.setText(avionController.mostrarAviones());
            }
        });
    }

    static void main()
    {
        JFrame frame = new JFrame("Avion");
        frame.setContentPane(new AvionView().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,500);
    }
}
