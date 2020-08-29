package com.quiz1.app;

import com.quiz1.domain.DispensadorDeAgua;

public class AppDispensador {
    public static void main(String[] args) {
        // Declaración
        DispensadorDeAgua dispensador;

        // Instanciación (new) e Inicialización
        dispensador = new DispensadorDeAgua(12345, "Kalley", 10);

        System.out.println("Marca del dipensador: " + dispensador.marca);

        dispensador.mostrarNivel();
        dispensador.calentar(30);
        dispensador.servir(false, 1);
        dispensador.servir(true, 0.4);
        dispensador.mostrarNivel();
        dispensador.calentar(50);
        dispensador.servir(true, 0.8);
        dispensador.vaciar();
        dispensador.mostrarNivel();
        dispensador.llenar();
        dispensador.mostrarNivel();
    }
}
