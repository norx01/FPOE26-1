package animales;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimalesGUI {
    private JPanel mainPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton guardarButton;
    private JTextArea textArea1;
    private JButton mostrarButton;

    AnimalesController controller;

    public AnimalesGUI()
    {
        controller = new AnimalesController();

        guardarButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                controller.agregarAnimal(textField1.getText(), textField2.getText());
            }
        });
        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                textArea1.setText(controller.mostrarAnimales());
            }
        });
    }

    static void main() {
        JFrame frame = new JFrame("Animales");
        frame.setContentPane(new AnimalesGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,500);
    }
}
