package com.alejandro.herencia.geometria;

public class Cuadrilatero extends FiguraGeometrica {
    private int base;
    private int altura;

    public Cuadrilatero(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return (2 * base) + (2 * altura);
    }
}
