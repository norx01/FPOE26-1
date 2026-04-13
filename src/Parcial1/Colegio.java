package Parcial1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Colegio {
    private JPanel mainPanel;
    private JTabbedPane tabbedPane1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton registrarEstudianteButton;
    private JComboBox comboBox1;
    private JTextField textField4;
    private JTextField textField5;
    private JSpinner spinner1;
    private JTextPane textPane1;
    private JButton registrarMateriaButton;
    private JSpinner spinner2;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JButton registrarAsignacionButton;

    List<Estudiantes> estudiantesList = new ArrayList<>();
    List<Materias> materiasList = new ArrayList<>();
    List<Registros> registrosList = new ArrayList<>();

    public Colegio()
    {
        registrarEstudianteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int codigo = Integer.parseInt(textField1.getText());
                String nombre = textField2.getText();
                int edad = (int)spinner2.getValue();
                String programa = comboBox1.getSelectedItem().toString();

                Estudiantes estudiante = new Estudiantes(codigo,nombre,edad,programa);
                estudiantesList.contains(estudiante);
                estudiantesList.add(estudiante);

                comboBox2.addItem(estudiante.getCodigo() + " - " + estudiante.getNombre());
                JOptionPane.showMessageDialog(null, "Estudiante registrado");
            }
        });

        registrarMateriaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int codigo = Integer.parseInt(textField4.getText());
                String nombre = textField5.getText();
                int creditos = (int)spinner1.getValue();
                String descripcion = textPane1.getText();

                Materias materia = new Materias(codigo,nombre,creditos,descripcion);
                materiasList.add(materia);

                comboBox3.addItem(materia.getCodigo()+" - "+materia.getNombre());
                JOptionPane.showMessageDialog(null, "Materia registrada");
            }
        });

        registrarAsignacionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int codigoEstudiante = comboBox2.getSelectedIndex();
                int codigoMateria = comboBox3.getSelectedIndex();

                Registros registro = new Registros(codigoEstudiante,codigoMateria);
                registrosList.add(registro);
                JOptionPane.showMessageDialog(null, "Asignacion registrada");

            }
        });
    }

    static void main() {
        JFrame frame = new JFrame("Colegio");
        frame.setContentPane(new Colegio().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,500);
    }
}
