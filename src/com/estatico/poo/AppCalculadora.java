package com.estatico.poo;

import javax.swing.*;
import java.util.Arrays;

public class AppCalculadora {
    public static final int SUMAR = 0;
    public static final int RESTAR = 1;
    public static final int MULTIPLICAR = 2;

    public static void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Mi Calculadora", JOptionPane.PLAIN_MESSAGE);
    }

    public static void main(String[] args) {
        boolean seguirEjecutando = true;

        while(seguirEjecutando) {
            JCheckBox checkbox = new JCheckBox("¿Redondear?");

            int opcionElegida = JOptionPane.showOptionDialog(null, "¿Qué deseas realizar?", "POO", 0,
                    0, null, Arrays.asList("Sumar", "Restar", "Multiplicar", checkbox).toArray(), "Sumar");

            switch (opcionElegida) {
                case SUMAR: {
                    int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número 1"));
                    int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número 2"));

                    mostrarMensaje("El resultado de la suma es: " + Calculadora.sumar(numero1, numero2));
                    break;
                }
                case RESTAR: {
                    int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número 1"));
                    int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número 2"));

                    mostrarMensaje("El resultado de la resta es: " + Calculadora.restar(numero1, numero2));
                    break;
                }
                case MULTIPLICAR: {
                    int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número 1"));
                    int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número 2"));

                    mostrarMensaje("El resultado de la multiplicación es: " + Calculadora.multiplicar(numero1, numero2));
                    break;
                }
                default: {
                    seguirEjecutando = false;
                }
            }
        }











//        double resultado = Calculadora.multiplicar(2, 5);
//
//        System.out.println(Calculadora.multiplicar(3.2, 4));
//        System.out.println(Calculadora.multiplicar(2.2, 1.5, 3));
//
//        System.out.println(resultado);
//
//        System.out.println(Calculadora.sumar(3, 6.9));
//
//        System.out.println("Probando parametros indeterminados: " + Calculadora.multiplicar(10, 3, 4, 34, 2));
    }
}
