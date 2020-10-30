package com.alejandro.herencia.factuacion;

public class FacturaConDescuento extends FacturaSinIva {
    private int valorDescuento;

    public FacturaConDescuento(int numero, int valor, int valorDescuento) {
        super(numero, valor);
        this.valorDescuento = valorDescuento;
    }

    @Override
    public int calcularTotal() {
        return this.getValor() - this.valorDescuento;
    }
}
