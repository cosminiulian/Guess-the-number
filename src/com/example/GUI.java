package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.System.exit;

public class GUI {
    public JPanel mainPanel;
    private JButton STARTGAMEButton;
    private JButton IESIREButton;
    private JButton INFORMATIIButton;
    private JLabel label;

    public GUI() {
        STARTGAMEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Guess();
            }
        });

        IESIREButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exit(0);
            }
        });

        INFORMATIIButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Trebuie sa ghiciti un nr aleatoriu de la 1 la 100." +
                        "\nAveti la dispozitie 10 incercari.\nSucces!", "INFO", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

}
