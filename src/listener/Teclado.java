package listener;

import javax.swing.*;
import java.awt.event.*;

public class Teclado {
    private JPanel mainPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    public Teclado() {
        textField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e)
            {
                super.keyReleased(e);
                char caracter = e.getKeyChar();
                JOptionPane.showMessageDialog(null, "Has pulsado: "+caracter);
            }
        });
        textField2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Has pulsado: ENTER ");
            }
        });

        textField3.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                String texto = textField3.getText();
                if (!texto.contains("@gmail.com") && !texto.contains("@hotmail.com"))
                {
                    JOptionPane.showMessageDialog(null, "El correo no es valido");
                }
            }
        });
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Teclado");
        frame.setContentPane(new Teclado().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,500);
    }
}
