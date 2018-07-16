package com.example;

import javax.swing.*;

import static java.lang.System.exit;

public class Guess {

    public Guess() {

        int randomNr = (int) (Math.random() * 100) + 1;
        boolean win = false;

        for (int i = 9; i >= 0; --i) {
            try {
                int guess = Integer.parseInt(input()); // Se introduce un nr din GUI si se stocheaza in guess.

                if (guess > randomNr) {
                    JOptionPane.showMessageDialog(null, " Numarul ales de tine este mai mare!\nMai ai "
                            + i + " incercari ramase!", "Numar mare", JOptionPane.WARNING_MESSAGE);
                } else if (guess < randomNr) {
                    JOptionPane.showMessageDialog(null, " Numarul ales de tine este mai mic!\nMai ai "
                            + i + " incercari ramase!", "Numar mic", JOptionPane.WARNING_MESSAGE);
                } else {
                    win = true;
                    break;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ati iesit din aplicatie!", "Iesire",
                        JOptionPane.INFORMATION_MESSAGE);
                exit(0);
            }
        }
        if (win) {
            JOptionPane.showMessageDialog(null, " Succes! Ai ghicit numarul!",
                    "Numar mare", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, " Esuat! Ai ramas fara incercari! Numarul era " + randomNr + ".",
                    "Numar mare", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private String input() {
        return JOptionPane.showInputDialog("Introduceti un nr.");
    }

}
