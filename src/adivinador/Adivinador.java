package adivinador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Adivinador {
    private JPanel mainPanel;
    private JTextField campoAdivinar;
    private JButton adivinarButton;
    private JLabel contadorVidas;
    private JLabel numAleatorio;

    int aleatorio;
    int vidas = 3;
    Random random = new Random();

    public Adivinador()
    {
        generarAleatorio();

        adivinarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                adivinar();
            }
        });
    }

    public void generarAleatorio()
    {
        aleatorio = random.nextInt(25)+1;
        //numAleatorio.setText("num aleatorio: "+aleatorio);
    }

    public void adivinar() {
        int numAdivinador = Integer.parseInt(campoAdivinar.getText());
        int absoluto = Math.abs(aleatorio - numAdivinador);

        if (absoluto == 0) {
            JOptionPane.showMessageDialog(null, "Ganaste");
            mainPanel.setBackground(Color.green);
            adivinarButton.setEnabled(false);
        } else if (absoluto >= 1 && absoluto <= 3) {
            JOptionPane.showMessageDialog(null, "Caliente");
            mainPanel.setBackground(Color.red);
            vidas--;
        } else if (absoluto >= 4 && absoluto <= 6) {
            JOptionPane.showMessageDialog(null, "tibio");
            mainPanel.setBackground(Color.orange);
            vidas--;
        } else {
            JOptionPane.showMessageDialog(null, "Frio");
            mainPanel.setBackground(Color.blue);
            vidas--;
        }

        if (vidas == 0) {
            JOptionPane.showMessageDialog(null, "Perdiste \nEl numero era: " + aleatorio);
            mainPanel.setBackground(Color.black);
            adivinarButton.setEnabled(false);
        }
        contadorVidas.setText("Vidas: " + vidas);
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Adivinador");
        frame.setContentPane(new Adivinador().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,500);
    }

}
