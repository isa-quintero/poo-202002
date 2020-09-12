package com.taller1.uco;

import java.util.ArrayList;

public class Nota {
    private double notaParcial;
    private double notaFinal;
    private ArrayList<Double> notasSeguimiento;
    private Asignatura materia;

    public Nota(Asignatura materia, double notaParcial, double notaFinal) {
        this.materia = materia;
        this.notaParcial = notaParcial;
        this.notaFinal = notaFinal;
        this.notasSeguimiento = new ArrayList<>();
    }

    private double calcularSeguimiento() {
        double sumaNotas = this.notasSeguimiento.stream().mapToDouble(nota -> nota.doubleValue()).sum();
        return sumaNotas / notasSeguimiento.size();
    }

    public double calcularDefinitiva() {
        return (notaParcial * 0.3) + (notaFinal * 0.3) + (calcularSeguimiento() * 0.4);
    }

    public double getNotaParcial() {
        return notaParcial;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public ArrayList<Double> getNotasSeguimiento() {
        return notasSeguimiento;
    }

    public Asignatura getMateria() {
        return materia;
    }

    public void setNotasSeguimiento(ArrayList<Double> notasSeguimiento) {
        this.notasSeguimiento = notasSeguimiento;
    }
}
