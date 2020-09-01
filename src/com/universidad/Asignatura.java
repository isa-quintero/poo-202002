package com.universidad;

import java.util.List;

public class Asignatura {
    public String nombre;
    public Profesor profesor;
    public List<Estudiante> estudiantes;

    public Asignatura(String nombre, Profesor profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
    }
}
