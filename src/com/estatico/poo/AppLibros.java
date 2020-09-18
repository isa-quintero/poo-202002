package com.estatico.poo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AppLibros {
    public static void main(String[] args) {
        ArrayList<Libro> libros = new ArrayList<>();
        Libro diasSinTi = new Libro("Días sin ti");
        Libro cienAnos = new Libro("Cien años de soledad");
        Libro hambriento = new Libro("Hambriento");
        Libro hambriento2 = new Libro("Hambriento 2");

        libros.add(diasSinTi);
        libros.add(cienAnos);
        libros.add(hambriento);
        libros.add(hambriento2);

        libros.forEach(librito -> {
            System.out.println(librito.getTitulo());
        });

        List<Libro> librosHamb = libros.stream().filter(libro -> {
            return libro.getTitulo().contains("Hambriento");
        }).collect(Collectors.toList());
        System.out.println("Despues de filtrar");
        librosHamb.forEach(librito -> {
            System.out.println(librito.getTitulo());
        });

        System.out.println(hambriento2);

        System.out.println(cienAnos.getSerial());

        System.out.println("He creado " + Libro.getNroLibrosCreados());
    }

}
