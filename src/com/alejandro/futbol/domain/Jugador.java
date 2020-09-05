package com.alejandro.futbol.domain;

public class Jugador {
    private String nombre;
    private byte edad;
    private byte nroCamiseta;
    private String posicion;

    public Jugador(String nombre, byte edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public byte getNroCamiseta() {
        return nroCamiseta;
    }

    public void setNroCamiseta(byte nroCamiseta) {
        this.nroCamiseta = nroCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
}
