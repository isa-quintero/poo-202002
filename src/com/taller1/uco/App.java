package com.taller1.uco;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Asignatura asignatura = new Asignatura("POO");
        Profesor profesor = new Profesor("1040182218", "Alejandro");

        Estudiante esteban = new Estudiante("1", "Esteban");
        Estudiante alejandra = new Estudiante("2", "Alejandra");

        Nota notaEsteban = new Nota(asignatura, 3, 3);
        notaEsteban.getNotasSeguimiento().add(3.0);
        notaEsteban.getNotasSeguimiento().add(4.2);
        notaEsteban.getNotasSeguimiento().add(1.5);
        notaEsteban.getNotasSeguimiento().add(3.0);
        notaEsteban.getNotasSeguimiento().add(4.7);

        Nota notaAlejandra = new Nota(asignatura, 4, 4.5);
        notaAlejandra.getNotasSeguimiento().add(0.0);
        notaAlejandra.getNotasSeguimiento().add(1.5);
        notaAlejandra.getNotasSeguimiento().add(1.0);
        notaAlejandra.getNotasSeguimiento().add(2.7);

        esteban.setNota(notaEsteban);
        alejandra.setNota(notaAlejandra);

        asignatura.setDocente(profesor);
        asignatura.getEstudiantes().add(esteban);
        asignatura.getEstudiantes().add(alejandra);

        System.out.println(asignatura.getNombre() + " que la da " + asignatura.getDocente().getNombre());

        asignatura.getEstudiantes().forEach(est -> {
            double definifiva = est.getNota().calcularDefinitiva();

            if (definifiva >= 3) {
                System.out.println(est.getNombre() + " ganó " + est.getNota().getMateria().getNombre() + "! 🚀 Sacó " + definifiva);
            } else {
                System.out.println(est.getNombre() + " perdió " + est.getNota().getMateria().getNombre() + "! ☹️ Sacó " + definifiva);
            }
        });
    }
}
