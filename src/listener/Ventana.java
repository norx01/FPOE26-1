package listener;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ventana {
    private JPanel mainPanel;

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() ->
        {
            JFrame frame = new JFrame("Ventana");
            frame.setContentPane(new Ventana().mainPanel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
            frame.setSize(500,500);

            frame.addWindowListener(new WindowListener() {
                @Override
                public void windowOpened(WindowEvent e)
                {
                    JOptionPane.showMessageDialog(null, "Ventana abierta");
                }

                @Override
                public void windowClosing(WindowEvent e)
                {
                    JOptionPane.showMessageDialog(null, "Cerrando ventana");
                }

                @Override
                public void windowClosed(WindowEvent e)
                {
                    JOptionPane.showMessageDialog(null, "Ventana cerrada");
                }

                @Override
                public void windowIconified(WindowEvent e)
                {
                    JOptionPane.showMessageDialog(null, "Ventana minimizada");
                }

                @Override
                public void windowDeiconified(WindowEvent e)
                {
                    JOptionPane.showMessageDialog(null, "Ventana maximizada");
                }

                @Override
                public void windowActivated(WindowEvent e)
                {
                    JOptionPane.showMessageDialog(null, "Ventana activada");
                }

                @Override
                public void windowDeactivated(WindowEvent e)
                {
                    JOptionPane.showMessageDialog(null, "Ventana desactivada");
                }
            });
        });

    }
}
