package com.universidad.app;

import com.universidad.Profesor;
import com.universidad.Programa;
import com.universidad.Universidad;

import java.util.ArrayList;

public class AppUCO {
    public static void main(String[] args) {
        Universidad uco = new Universidad();
        Profesor alejandro = new Profesor("Alejandro Ramirez");
        Profesor alirio = new Profesor("Alirio");
        Profesor luzMery = new Profesor("Luz Mery Rios");

        Programa ingenieriaDeSistemas = new Programa();

        ingenieriaDeSistemas.profesores.add(alejandro);
        ingenieriaDeSistemas.profesores.add(luzMery);
        ingenieriaDeSistemas.profesores.add(alirio);

        uco.programas.add(ingenieriaDeSistemas);

        uco.programas.get(0).profesores.forEach(profesor -> System.out.println(profesor.nombre));

//        for (Profesor profe: uco.programas.get(0).profesores) {
//            System.out.println(profe.nombre);
//        }
//
//        for (int i = 0; i < uco.programas.get(0).profesores.size(); i++) {
//            System.out.println(uco.programas.get(0).profesores.get(i).nombre);
//        }
    }
}
