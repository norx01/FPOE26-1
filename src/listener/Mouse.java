package listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Mouse {
    private JPanel mainPanel;
    private JCheckBox checkBox1;

    public Mouse() {
        mainPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                if (e.getClickCount() == 2)
                {
                    //JOptionPane.showMessageDialog(null, "Hiciste click doble");
                    mainPanel.setBackground(Color.magenta);
                }
                else
                {
                    //JOptionPane.showMessageDialog(null, "Hiciste click simple");
                    mainPanel.setBackground(Color.yellow);

                }

            }
        });

        mainPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                mainPanel.setBackground(Color.cyan);
            }
        });

        mainPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                mainPanel.setBackground(Color.green);
            }
        });
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Mouse");
        frame.setContentPane(new Mouse().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,500);
    }
}
