package listener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Deslizador {
    private JPanel mainPanel;
    private JSlider slider1;
    private JProgressBar progressBar1;
    private JLabel porcentaje;

    public Deslizador()
    {
        slider1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e)
            {
                int valor = slider1.getValue();
                progressBar1.setValue(valor);
                porcentaje.setText(valor+"%");
            }
        });
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Deslizador");
        frame.setContentPane(new Deslizador().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,500);
    }
}
