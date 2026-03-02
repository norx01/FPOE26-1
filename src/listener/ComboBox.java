package listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ComboBox {
    private JPanel mainPanel;
    private JComboBox comboBox1;

    public ComboBox() {
        comboBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e)
            {
                String opcion = (String) comboBox1.getSelectedItem();

                switch (opcion)
                {
                    case "Magenta":
                        mainPanel.setBackground(Color.magenta);
                        break;
                    case "Yellow":
                        mainPanel.setBackground(Color.yellow);
                        break;
                    case "Cyan":
                        mainPanel.setBackground(Color.cyan);
                        break;
                    default:
                        mainPanel.setBackground(Color.white);
                        break;
                }
            }
        });
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("ComboBox");
        frame.setContentPane(new ComboBox().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,500);
    }
}
