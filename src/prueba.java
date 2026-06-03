import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class prueba {
    private JPanel mainPanel;
    private JTextField textField1;
    private JButton button1;
    private JTextField textField2;

    public prueba() {
        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mensaje();
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mensaje();
            }
        });
        textField2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE)
                {
                    mensaje();
                }
            }
        });
    }

    void mensaje()
    {
        JOptionPane.showMessageDialog(null, "Hola");
    }

    static void main() {
        JFrame frame = new JFrame("Prueba");
        frame.setContentPane(new prueba().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,500);
    }
}
