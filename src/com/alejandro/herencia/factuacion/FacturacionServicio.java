package com.alejandro.herencia.factuacion;

import java.util.ArrayList;
import java.util.List;

public class FacturacionServicio {
    private static final int VALOR_TOPE = 100000;
    private static final int DESCUENTO = 30000;

    private List<Factura> facturas;

    public FacturacionServicio() {
        this.facturas = new ArrayList<>();
    }

    public void generarFactura(int valor, String nombreCliente) {
        Factura factura = null;

        if (nombreCliente.contains("A")) {
            factura = new FacturaConDescuento(facturas.size() + 1, valor, DESCUENTO);
        } else {
            if (valor >= VALOR_TOPE) {
                factura = new FacturaConIva(facturas.size() + 1, valor, "SISTEMA");
            } else {
                factura = new FacturaSinIva(facturas.size() + 1, valor);
            }
        }

        facturas.add(factura);
    }

    public void mostrarTotalFacturas() {
        facturas.forEach(factura -> {
            System.out.println(factura + " - Total: " + factura.calcularTotal());
        });
    }
}
