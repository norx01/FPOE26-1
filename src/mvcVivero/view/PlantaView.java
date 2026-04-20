package mvcVivero.view;

import mvcVivero.controller.PlantaController;
import mvcVivero.model.Planta;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlantaView {
    private JPanel mainPanel;
    private JTabbedPane tabbedPane1;
    private JButton registrarPlantaButton;
    private JTextField textField1;
    private JSpinner spinner1;
    private JTextField textField2;
    private JComboBox comboBox1;
    private JSpinner spinner2;
    private JRadioButton solRadioButton;
    private JCheckBox medicionalCheckBox;
    private JCheckBox ornamentalCheckBox;
    private JRadioButton dispoRadioButton1;
    private JTextArea textArea1;
    private JTextField textField3;

    PlantaController plantaController;

    public PlantaView() {
        plantaController = new PlantaController();

        registrarPlantaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                plantaController.agregarPlanta(objetoPlanta());
                JOptionPane.showMessageDialog(null, "Planta registrada");
            }
        });

        tabbedPane1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e)
            {
                textArea1.setText(plantaController.mostrarPlantas());
            }
        });
    }

    public Planta objetoPlanta()
    {
        String nombre = textField1.getText();
        String tipo = comboBox1.getSelectedItem().toString();
        double altura = textField3.getText().equals("") ? 0 : Double.parseDouble(textField3.getText());
        int precio = (int)spinner2.getValue();
        String color = textField2.getText();
        boolean solRadioButtonSelected = solRadioButton.isSelected();
        boolean medicinalCheckBoxSelected = medicionalCheckBox.isSelected();
        boolean ornamentalCheckBoxSelected = ornamentalCheckBox.isSelected();
        boolean dispoRadioButtonSelected = dispoRadioButton1.isSelected();

        return new Planta(nombre,tipo,altura,precio,color,solRadioButtonSelected,dispoRadioButtonSelected,medicinalCheckBoxSelected,ornamentalCheckBoxSelected);

    }

    static void main()
    {
        JFrame frame = new JFrame("Planta");
        frame.setContentPane(new PlantaView().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(700,450);
    }
}
