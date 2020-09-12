package com.taller1.uco;

import java.util.ArrayList;
import java.util.List;

public class Asignatura {
    private String nombre;
    private int nroCreditos;
    private Profesor docente;
    private List<Estudiante> estudiantes;

    public Asignatura(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getNroCreditos() {
        return nroCreditos;
    }

    public Profesor getDocente() {
        return docente;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setNroCreditos(int nroCreditos) {
        this.nroCreditos = nroCreditos;
    }

    public void setDocente(Profesor docente) {
        this.docente = docente;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
}
