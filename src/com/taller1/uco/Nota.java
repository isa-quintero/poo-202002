package com.taller1.uco;

import java.util.ArrayList;

public class Nota {
    private static final double PORC_SEGUIMIENTO = 0.4;
    private static final double PORC_FINAL = 0.3;
    private static final double PORC_PARCIAL = 0.3;

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
        return (notaParcial * Nota.PORC_PARCIAL) + (notaFinal * Nota.PORC_FINAL) + (calcularSeguimiento() * PORC_SEGUIMIENTO);
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
