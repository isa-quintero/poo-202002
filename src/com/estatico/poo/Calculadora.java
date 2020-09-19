package com.estatico.poo;

public class Calculadora {
    private String marca;

    public Calculadora(String marca) {
        this.marca = marca;
    }

    public static double multiplicar(double sergio1, double sergio2) {
        return sergio1 * sergio2;
    }

    public static double sumar(int numero1, double numero2) {
        return numero1 + numero2;
    }

    public static int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static double multiplicar(double numero1, double numero2, double numero3) {
        return numero1 * numero2 * numero3;
    }

    public static int multiplicar(int... numeros) {
        int resultado = numeros[0];
        System.out.println("Número de parametros " + numeros.length);
        for (int i = 1; i < numeros.length; i++) {
            resultado = resultado * numeros[i];
        }

        return resultado;
    }

    public String getMarca() {
        return marca;
    }
}
