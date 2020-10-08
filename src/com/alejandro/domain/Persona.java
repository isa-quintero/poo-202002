package com.alejandro.domain;

public class Persona {
    public long identificacion;
    private String nombre;
    public char genero;
    public long celular;
    public String email;

    public Persona() {}

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
