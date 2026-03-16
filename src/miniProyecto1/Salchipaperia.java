package miniProyecto1;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Salchipaperia {
    private JPanel panel1;
    private JTabbedPane tabbedPane1;
    private JSpinner spinner1;
    private JSpinner spinner2;
    private JSpinner spinner3;
    private JSpinner spinner4;
    private JButton calcularButton;
    private JButton confirmarVentaButton;
    private JButton limpiarButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JComboBox comboBox1;
    private JButton modificarInventarioButton;
    private JTextArea textArea1;
    private JTextField textField5;
    private JLabel estado;
    private JTextArea textArea2;

    int salchichas = 50, papas = 80, quesos = 20;
    double topeVenta = 150000;

    double totalVenta = 0;

    int cSencilla = 0, cEspecial = 0, cGratinada = 0, cSuperDoble = 0;
    int vSencilla = 0, vEspecial = 0, vGratinada = 0, vSuperDoble = 0;

    double totalVendido = 0;

    int cTSencilla = 0, cTEspecial = 0, cTGratinada = 0, cTSuperDoble = 0;
    int vTSencilla = 0, vTEspecial = 0, vTGratinada = 0, vTSuperDoble = 0;



    public Salchipaperia()
    {
        actualizarInventario();
        estado.setText("Disponible para Vender");

        modificarInventarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                modificarInventario();
                actualizarInventario();
            }
        });
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                calcular();
            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                limpiar();
            }
        });
        confirmarVentaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                vender();
                actualizarInventario();
            }
        });
        tabbedPane1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e)
            {
                reporte();
            }
        });
    }

    public void reporte()
    {
        textArea2.setText("");
        textArea2.append("Salchipaperia el perro agradecido"+"\n\n");
        textArea2.append("Reporte"+"\n\n");
        textArea2.append("Cantidades"+"\n");
        textArea2.append("Cantidad de Sencillas Vendidas: "+cTSencilla+"\n");
        textArea2.append("Cantidad de Especiales Vendidas: "+cTEspecial+"\n");
        textArea2.append("Cantidad de Gratinadas Vendidas: "+cTGratinada+"\n");
        textArea2.append("Cantidad de Super Dobles Vendidas: "+cTSuperDoble+"\n\n");
        textArea2.append("Totales"+"\n");
        textArea2.append("Total de Sencillas Vendidas: $"+vTSencilla+"\n");
        textArea2.append("Total de Especiales Vendidas: $"+vTEspecial+"\n");
        textArea2.append("Total de Gratinadas Vendidas: $"+vTGratinada+"\n");
        textArea2.append("Total de Super Dobles Vendidas: $"+vTSuperDoble+"\n\n");
        textArea2.append("Total del dia"+"\n");
        textArea2.append("Total de Ventas: $"+totalVendido+"\n");

    }

    public void vender()
    {
        calcular();

        int cantPapas = (cSencilla*1)+(cEspecial*3)+(cGratinada*4)+(cSuperDoble*6);
        int cantSalchichas = (cSencilla*1)+(cEspecial*2)+(cGratinada*5)+(cSuperDoble*5);
        int cantQuesos = (cSencilla*0)+(cEspecial*0)+(cGratinada*2)+(cSuperDoble*4);

        if ((totalVenta + totalVendido) > topeVenta)
        {
            JOptionPane.showMessageDialog(null, "Venta no permitida, el tope de venta es de: $"+topeVenta);
        }
        else
        {
            if (cantPapas <= papas && cantSalchichas <= salchichas && cantQuesos <= quesos)
            {
                JOptionPane.showMessageDialog(null, "Venta realizada");
                papas -= cantPapas;
                salchichas -= cantSalchichas;
                quesos -= cantQuesos;
                Toolkit.getDefaultToolkit().beep();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No hay suficientes ingredientes en inventario");

            }
        }

        cerrarCaja();

        cTSencilla += cSencilla;
        cTEspecial += cEspecial;
        cTGratinada += cGratinada;
        cTSuperDoble += cSuperDoble;
        vTSencilla += vSencilla;
        vTEspecial += vEspecial;
        vTGratinada += vGratinada;
        vTSuperDoble += vSuperDoble;
        totalVendido += totalVenta;
    }

    public void limpiar()
    {
        spinner1.setValue(0);
        spinner2.setValue(0);
        spinner3.setValue(0);
        spinner4.setValue(0);
        textArea1.setText("");
    }

    public void calcular()
    {
        cSencilla = Integer.parseInt(spinner1.getValue().toString());
        cEspecial = Integer.parseInt(spinner2.getValue().toString());
        cGratinada = Integer.parseInt(spinner3.getValue().toString());
        cSuperDoble = Integer.parseInt(spinner4.getValue().toString());

        vSencilla = cSencilla * 5000;
        vEspecial = cEspecial * 8000;
        vGratinada = cGratinada * 15000;
        vSuperDoble = cSuperDoble * 20000;

        totalVenta = vSencilla + vEspecial + vGratinada + vSuperDoble;

        textArea1.setText("");

        textArea1.append("PreFactura"+"\n");
        textArea1.append("Sencillas X "+cSencilla+" = $"+vSencilla+"\n");
        textArea1.append("Especiales X "+cEspecial+" = $"+vEspecial+"\n");
        textArea1.append("Gratinadas X "+cGratinada+" = $"+vGratinada+"\n");
        textArea1.append("Super Dobles X "+cSuperDoble+" = $"+vSuperDoble+"\n");
        textArea1.append("Total a pagar: $"+totalVenta);
    }

    public void modificarInventario()
    {
        String opcion = comboBox1.getSelectedItem().toString();
        switch (opcion)
        {
            case "Salchichas":
                salchichas += Integer.parseInt(JOptionPane.showInputDialog("Cuantas Salchichas desea agregar"));
                break;
            case "Papas":
                papas += Integer.parseInt(JOptionPane.showInputDialog("Cuantas papas desea agregar"));
                break;
            case "Quesos":
                quesos += Integer.parseInt(JOptionPane.showInputDialog("Cuantos Quesos desea agregar"));
                break;
            case "Tope de venta":
                topeVenta = Integer.parseInt(JOptionPane.showInputDialog("¿Cual es el nuevo tope de venta?"));
                if (topeVenta < totalVendido)
                {
                    JOptionPane.showMessageDialog(null, "El nuevo tope de venta debe ser mayor al total de ventas");
                    modificarInventario();
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida");
                break;
        }
    }

    public void cerrarCaja()
    {
        if (papas == 0 || salchichas == 0 || quesos == 0)
        {
            JOptionPane.showMessageDialog(null, "No hay papas, salchichas o quesos en inventario");
            confirmarVentaButton.setEnabled(false);
            estado.setText("Faltan Ingredientes");

        }
        if (totalVendido >= topeVenta)
        {
            JOptionPane.showMessageDialog(null, "Tope de venta alcanzado");
            confirmarVentaButton.setEnabled(false);
            estado.setText("Tope de Ventas Alcanzado");

        }
    }

    public void actualizarInventario()
    {
        textField1.setText(String.valueOf(salchichas));
        textField2.setText(String.valueOf(papas));
        textField3.setText(String.valueOf(quesos));
        textField4.setText(String.valueOf(topeVenta));
        textField5.setText(String.valueOf(totalVendido));

        if (salchichas <= 5)
            textField1.setBackground(Color.RED);
        if (papas <= 5)
            textField2.setBackground(Color.RED);
        if (quesos <= 5)
            textField3.setBackground(Color.RED);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Salchipaperia");
        frame.setContentPane(new Salchipaperia().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(800,800);
    }
}
