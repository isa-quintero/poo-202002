package com.estatico.poo;

public class AppCalculadora {
    public static void main(String[] args) {
        double resultado = Calculadora.multiplicar(2, 5);

        System.out.println(Calculadora.multiplicar(3.2, 4));
        System.out.println(Calculadora.multiplicar(2.2, 1.5, 3));

        System.out.println(resultado);

        System.out.println(Calculadora.sumar(3, 6.9));

        System.out.println("Probando parametros indeterminados: " + Calculadora.multiplicar(10, 3, 4, 34, 2));
    }
}
