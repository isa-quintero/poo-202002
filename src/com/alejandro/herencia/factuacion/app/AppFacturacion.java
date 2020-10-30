package com.alejandro.herencia.factuacion.app;

import com.alejandro.herencia.factuacion.FacturacionServicio;

public class AppFacturacion {
    public static void main(String[] args) {
        FacturacionServicio servicio = new FacturacionServicio();

        servicio.generarFactura(90000, "Alejandro");
        servicio.generarFactura(250000, "Alejandra");
        servicio.generarFactura(100000, "Luis");
        servicio.generarFactura(99000, "John");

        servicio.mostrarTotalFacturas();
    }
}
