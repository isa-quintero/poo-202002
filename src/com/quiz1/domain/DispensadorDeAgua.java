package com.quiz1.domain;

public class DispensadorDeAgua {
    public long serial;
    public String marca;
    public double cantidadMaxima;
    public double cantidadActual;
    public double temperatura;

    public boolean servir(boolean caliente, double cantidadAServir) {
        if ((cantidadActual - cantidadAServir) >= 0) {
            cantidadActual -= cantidadAServir;

            if (caliente) {
                System.out.println("Se sirvió agua caliente a " + temperatura + "ºC");
            } else {
                System.out.println("Se sirvió agua al clima");
            }

            return true;
        } else {
            return false;
        }
    }

    public void llenar() {
        this.cantidadActual = this.cantidadMaxima;
    }

    public void vaciar() {
        this.cantidadActual = 0;
    }

    public boolean calentar(double grados) {
        if ((this.temperatura + grados) >= 100) {
            return false;
        } else {
            this.temperatura += grados;
            return true;
        }
    }
}
