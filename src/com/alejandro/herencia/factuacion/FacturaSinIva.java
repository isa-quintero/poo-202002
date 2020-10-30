package com.alejandro.herencia.factuacion;

import java.util.Date;

public class FacturaSinIva extends Factura {
    public FacturaSinIva(int numero, int valor) {
        super(numero, valor);
    }

    @Override
    public int calcularTotal() {
        return this.getValor();
    }
}
