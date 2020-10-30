package com.alejandro.herencia.factuacion;

import java.util.Date;

public abstract class Factura {
    private int numero;
    private String nombre;
    private Date fecha;
    private int valor;

    public Factura(int numero, int valor) {
        this.numero = numero;
        this.fecha = new Date();
        this.valor = valor;
    }

    public abstract int calcularTotal();

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getValor() {
        return valor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
