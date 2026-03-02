package listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Boton {
    private JPanel mainPanel;
    private JButton hagaClickButton;

    public Boton()
    {
        hagaClickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(null, "Hiciste click");
                mainPanel.setBackground(Color.MAGENTA);
            }
        });
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Boton");
        frame.setContentPane(new Boton().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,500);
    }

}
