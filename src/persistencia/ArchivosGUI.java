package persistencia;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivosGUI {
    private JPanel mainPanel;
    private JTabbedPane tabbedPane1;
    private JTextField campoArchivo;
    private JComboBox comboBoxGrado;
    private JTextField campoNombre;
    private JSpinner spinnerEdad;
    private JRadioButton activoRadioButton;
    private JComboBox comboBox1;
    private JTable table1;
    private JButton registrarEstudianteButton;
    private JButton actualizarArchivoButton;

    String nombreArchivo;

    public ArchivosGUI()
    {
        registrarEstudianteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                registrarEstudiante();
            }
        });
        actualizarArchivoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                nombreArchivo = campoArchivo.getText();
                JOptionPane.showMessageDialog(null,"Archivo actualizado");
            }
        });
    }

    public void registrarEstudiante()
    {
        String nombre = campoNombre.getText();
        int edad = Integer.parseInt(spinnerEdad.getValue().toString());
        String grado = comboBoxGrado.getSelectedItem().toString();
        String eps = comboBox1.getSelectedItem().toString();
        boolean activo = activoRadioButton.isSelected();

        try
        {
            FileWriter writer = new FileWriter(nombreArchivo+".txt", true);

            writer.write(nombre + " | "+edad+" | "+grado+" | "+eps+" | "+ activo +"\n");
            writer.close();
            JOptionPane.showMessageDialog(null,"Datos guardados con exito");

        }
        catch (IOException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Error al escribir el archivo");
        }
    }

    static void main() {
        JFrame frame = new JFrame("Archivos");
        frame.setContentPane(new ArchivosGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(800,800);
    }
}
