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

        System.out.println("--- Estamos viendo el manejo de memoria en Java");
        alejandro.setEdad(28);
        luzMery = alejandro;

        System.out.println("Edad antes de cambiarla desde luzMery " + luzMery.getEdad());

        luzMery.setEdad(35);

        System.out.println(alejandro.getNombre());
        System.out.println(luzMery.getNombre());
        System.out.println(alejandro.getEdad());
        System.out.println(luzMery.getEdad());

        System.out.println("--- Vimos el manejo de memoria en Java\n");


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
