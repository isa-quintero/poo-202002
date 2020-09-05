package com.universidad;

import java.util.ArrayList;
import java.util.List;

public class Programa {
    private String nombre;
    private List<Profesor> profesores;
    private List<Asignatura> asignaturas;

    public Programa(String nombre) {
        this.nombre = nombre;
        profesores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
}
