package com.estatico.poo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AppLibros {
    public static void main(String[] args) {
        ArrayList<Libro> libros = new ArrayList<>();
        Libro diasSinTi = Libro.crearLibro("Dias sin ti");
        Libro cienAnos = Libro.crearLibro("Cien años de soledad");
        Libro hambriento = Libro.crearLibro("Hambriento");
        Libro hambriento2 = Libro.crearLibro("Hambriento 2");

        System.out.println("diasSinTi=" + diasSinTi);
        System.out.println("cienAnos=" + cienAnos);
        System.out.println("hambriento=" + hambriento);
        System.out.println("hambriento2=" + hambriento2);

//        libros.add(diasSinTi);
//        libros.add(cienAnos);
//        libros.add(hambriento);
//
//        libros.forEach(librito -> {
//            System.out.println(librito.getTitulo());
//        });
//
//        List<Libro> librosHamb = libros.stream().filter(libro -> {
//            return libro.getTitulo().contains("Hambriento");
//        }).collect(Collectors.toList());
//        System.out.println("Despues de filtrar");
//        librosHamb.forEach(librito -> {
//            System.out.println(librito.getTitulo());
//        });
//
//        System.out.println(hambriento2);
//
//        System.out.println(cienAnos.getSerial());
//
//        System.out.println("He creado " + Libro.getNroLibrosCreados());
    }

}
