package com.alejandro.joptionpane;

import javax.swing.*;

public class AppIcono {
    public static void main(String[] args) {
        Icon icon = new ImageIcon(AppIcono.class.getResource("logo.png"));

        String resultado = (String) JOptionPane.showInputDialog(null, "¿Cómo queda colombia hoy?",
                "Eliminatorias Qatar", JOptionPane.INFORMATION_MESSAGE, icon, null, null);

        JOptionPane.showMessageDialog(null, "Tu resultado es: " + resultado, "Eliminatorias Qatar",
                JOptionPane.INFORMATION_MESSAGE, icon);
    }
}
