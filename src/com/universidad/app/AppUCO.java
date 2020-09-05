package com.universidad.app;

import com.universidad.Profesor;
import com.universidad.Programa;
import com.universidad.Universidad;

public class AppUCO {
    public static void main(String[] args) {
        Universidad uco = new Universidad();
        Profesor alejandro = new Profesor("Alejandro Ramirez");
        Profesor alirio = new Profesor("Alirio");
        Profesor luzMery = new Profesor("Luz Mery Rios");

        Programa ingenieriaDeSistemas = new Programa("Ing. de Sistemas");
        System.out.println("El nombre del programa es " + ingenieriaDeSistemas.getNombre());

        ingenieriaDeSistemas.getProfesores().add(alejandro);
        ingenieriaDeSistemas.getProfesores().add(luzMery);
        ingenieriaDeSistemas.getProfesores().add(alirio);

        uco.getProgramas().add(ingenieriaDeSistemas);

        uco.getProgramas().get(0).getProfesores().forEach(profesor -> System.out.println(profesor.getNombre()));

//        for (Profesor profe: uco.programas.get(0).profesores) {
//            System.out.println(profe.nombre);
//        }
//
//        for (int i = 0; i < uco.programas.get(0).profesores.size(); i++) {
//            System.out.println(uco.programas.get(0).profesores.get(i).nombre);
//        }
    }
}
