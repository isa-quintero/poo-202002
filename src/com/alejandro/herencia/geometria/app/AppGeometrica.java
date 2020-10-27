package com.alejandro.herencia.geometria.app;

import com.alejandro.herencia.geometria.Circulo;
import com.alejandro.herencia.geometria.Cuadrilatero;
import com.alejandro.herencia.geometria.FiguraGeometrica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppGeometrica {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(14);
        Cuadrilatero cuadrilatero = new Cuadrilatero(70, 98);

        List<FiguraGeometrica> figuras = new ArrayList<>(Arrays.asList(circulo, cuadrilatero));
        calcular(figuras);
    }

    public static void calcular(List<FiguraGeometrica> figuraGeometricas) {
        figuraGeometricas.forEach(figura -> {
            System.out.println(figura + " - Area: " + figura.calcularArea());
            System.out.println(figura + " - Perimetro: " + figura.calcularPerimetro());
        });
    }
}
