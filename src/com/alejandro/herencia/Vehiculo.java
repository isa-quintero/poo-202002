package com.alejandro.herencia;

public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private short anoModelo;
    private String color;

    public void acelerar() {
        System.out.println("El vehiculo aceleró");
    }

    public void frenar() {
        System.out.println("El vehiculo frenó");
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public short getAnoModelo() {
        return anoModelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
