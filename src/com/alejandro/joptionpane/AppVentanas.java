package com.alejandro.joptionpane;

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class AppVentanas {
    public static void main(String[] args) throws MalformedURLException {
        ImageIcon icon = new ImageIcon(new URL("https://upload.wikimedia.org/wikipedia/commons/2/25/LogoUCO_UCO_shield.png"));
//        JOptionPane.showMessageDialog(null, "Hola mundo!", "POO", JOptionPane.ERROR_MESSAGE, icon);

        /**
         * Formas de llamar las listas de opciones
         */
        // new Object[] {"El Retiro", "Medellín", "Guarne", "Guatape"}
        // Arrays.asList("Barbosa", "Bello").toArray()

//        String nombre = (String) JOptionPane.showInputDialog(null, "¿Donde vives?", "POO", JOptionPane.WARNING_MESSAGE, null,
//                Arrays.asList("Barbosa", "Bello").toArray(), null);

//        int botonElegido = JOptionPane.showConfirmDialog(null, "Qué pasa?", "POO",
//                JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, icon);
//
//        if (botonElegido == JOptionPane.YES_OPTION) {
//            mostrarMensaje("Eligió SI");
//        } else if (botonElegido == JOptionPane.NO_OPTION) {
//            mostrarMensaje("Eligió NO");
//        } else if (botonElegido == JOptionPane.CANCEL_OPTION) {
//            mostrarMensaje("Eligió CANCELAR");
//        } else if (botonElegido == JOptionPane.CLOSED_OPTION) {
//            mostrarMensaje("Eligió CERRAR");
//        }

        JCheckBox checkbox = new JCheckBox("¿Redondear?");
        int opcionElegida = JOptionPane.showOptionDialog(null, "¿Qué deseas realizar?", "POO", 0,
                0, null, Arrays.asList("Sumar", "Restar", "Multiplicar", checkbox).toArray(), "Sumar");

        mostrarMensaje("Eligió " + opcionElegida);
        mostrarMensaje("Va a redondear? " + checkbox.isSelected());

    }

    public static void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "POO", JOptionPane.PLAIN_MESSAGE);
    }
}
