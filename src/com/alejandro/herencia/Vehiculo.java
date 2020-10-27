package com.alejandro.herencia;

public abstract class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private short anoModelo;
    private String color;

    public Vehiculo(String marca, String modelo, short anoModelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoModelo = anoModelo;
    }

    public abstract void acelerar();

    public void frenar() {
        System.out.println("El vehiculo frenó");
    }

    @Override
    public String toString() {
        return "Vehiculo {" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
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
