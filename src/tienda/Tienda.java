package tienda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tienda {
    private JPanel mainPanel;
    private JComboBox comboBox1;
    private JSpinner spinner1;
    private JRadioButton siRadioButton;
    private JButton venderButton;
    private JTextArea textArea1;

    public Tienda()
    {
        venderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                vender();
            }
        });
    }

    public void vender()
    {
        String producto = comboBox1.getSelectedItem().toString();
        int cantidad = Integer.parseInt(spinner1.getValue().toString());
        boolean vip = siRadioButton.isSelected();

        double precio = 0;

        if (producto.equals("Arroz"))
        {
            precio = cantidad * 3000;
        }
        else if (producto.equals("Azucar"))
        {
            precio = cantidad * 1000;
        }
        else if (producto.equals("Panela"))
        {
            precio = cantidad * 4000;
        }
        textArea1.append(producto+"X"+cantidad+" = "+precio+"\n");
        if (vip)
        {
            precio = precio - (precio*0.15);
            textArea1.append("Aplica descuento de 15% VIP \n");
            textArea1.append("Total a pagar: "+precio+"\n");
        }
        else
        {
            textArea1.append("Total a pagar: "+precio+"\n");
        }

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tienda");
        frame.setContentPane(new Tienda().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,500);
    }
}
