package Opcional1.view;

import Opcional1.model.EspecieBotanica;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.util.List;

public class BotanicaView
{
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JButton registrarEspecieButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JSpinner spinner1;
    private JSpinner spinner2;
    private JSpinner spinner3;
    private JComboBox comboBox3;
    private JTextField textField5;
    private JTable table1;
    private JTextArea textArea1;
    private JTextField textField6;
    private JComboBox comboBox4;
    private JTextField textField7;
    private JComboBox comboBox5;
    private JTextArea textArea2;
    private JSpinner spinner4;
    private JSpinner spinner5;
    private JButton registrarObservacionButton;
    private JComboBox comboBox6;
    private JComboBox comboBox7;
    private JTextField textField8;
    private JComboBox comboBox8;
    private JButton registrarObservacionButton1;

    List<EspecieBotanica> especiesList = new ArrayList<>();

    int totalEspecies = 0;

    public BotanicaView() {

        registrarEspecieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String codigo = textField1.getText();
                String nombreComun = textField2.getText();
                String nombreCientifico = textField3.getText();
                String familiaBotanica = textField4.getText();
                String tipoPlanta = (String) comboBox1.getSelectedItem();
                String habitat = (String) comboBox2.getSelectedItem();
                int alturaPromedio = (int) spinner1.getValue();
                String estadoConservacion = (String) comboBox3.getSelectedItem();
                int nivelHumedad = (int) spinner2.getValue();
                int nivelLuz = (int) spinner3.getValue();
                String estadoBiologico = textField5.getText();

                EspecieBotanica especie = new EspecieBotanica(codigo, nombreComun, nombreCientifico,
                        familiaBotanica, tipoPlanta, habitat,
                        alturaPromedio, estadoConservacion,
                        nivelHumedad, nivelLuz, estadoBiologico);

                especiesList.add(especie);
                JOptionPane.showMessageDialog(null,"Especie registrada");
                mostrarTabla();
                totalEspecies++;
            }
        });
        textField5.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                int humedad = (int)spinner2.getValue();
                int luz = (int)spinner3.getValue();
                textField5.setText(calcularEstado(humedad,luz));
            }
        });
        textField5.addFocusListener(new FocusAdapter() {
        });

        tabbedPane1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e)
            {
                reporteGeneral();
            }
        });
    }

    public void reporteGeneral()
    {
        textArea1.setText("");
        textArea1.append("Reporte General\n");
        textArea1.append("Total de especies registradas: "+totalEspecies+"\n");
        textArea1.append("Total de observaciones registradas: "+totalEspecies+"\n");
        textArea1.append("Total de observaciones aplicadas: "+totalEspecies+"\n");
        textArea1.append("Especie mas observada: "+totalEspecies+"\n");
        textArea1.append("Número de especies en riesgo biológico: "+totalEspecies+"\n");
        textArea1.append("Promedio general de condición ambiental: "+totalEspecies+"\n");
        textArea1.append("Listado de especies amenazadas o en peligro: "+totalEspecies+"\n");
    }


    public String calcularEstado(int nivelHumedad, int nivelLuz)
    {
        if(nivelHumedad >= 60 && nivelLuz >= 60)
        {
            return  "Optimo";
        }
        else if((nivelHumedad >= 40 && nivelHumedad <= 59) || (nivelLuz >= 40 && nivelLuz <= 59))
        {
            return "Estable";
        }
        else if(nivelHumedad < 40 || nivelLuz < 40)
        {
            return  "Riesgo Biologico";
        }

        return "Error";
    }

    public void mostrarTabla()
    {
        String[] columnas = {
                "Código", "Nombre Común", "Nombre Científico", "Familia Botánica",
                "Tipo Planta", "Hábitat", "Altura Promedio",
                "Estado Conservación", "Nivel Humedad", "Nivel Luz", "Estado Biológico"
        };

        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        for (EspecieBotanica e: especiesList)
        {
            Object[] fila = {
                    e.getCodigo(),
                    e.getNombreComun(),
                    e.getNombreCientifico(),
                    e.getFamiliaBotanica(),
                    e.getTipoPlanta(),
                    e.getHabitat(),
                    e.getAlturaPromedio(),
                    e.getEstadoConservacion(),
                    e.getNivelHumedad(),
                    e.getNivelLuz(),
                    e.getEstadoBiologico()
            };
            modelo.addRow(fila);
        }
        table1.setModel(modelo);
    }



    static void main() {
        BotanicaView botanicaView = new BotanicaView();
        JFrame frame = new JFrame("Botanica");
        frame.setContentPane(botanicaView.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,1000);
    }
}
