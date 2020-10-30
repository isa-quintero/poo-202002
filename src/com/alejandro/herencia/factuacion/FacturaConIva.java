package com.alejandro.herencia.factuacion;

import java.util.Date;

public class FacturaConIva extends Factura {
    private String generador;

    public FacturaConIva(int numero, int valor, String generador) {
        super(numero, valor);
        this.generador = generador;
    }

    @Override
    public int calcularTotal() {
        return (int) (this.getValor() * 1.19);
    }

    public String getGenerador() {
        return generador;
    }

    public void setGenerador(String generador) {
        this.generador = generador;
    }
}
