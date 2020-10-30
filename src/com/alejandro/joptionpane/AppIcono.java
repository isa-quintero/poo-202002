package com.alejandro.joptionpane;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AppIcono {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon(AppIcono.class.getResource("logo.png"));
        List<String> lista = Arrays.asList("Alejo", "Anderson", "Yuber", "John");

//        lista.stream()
//                .takeWhile(s -> s.contains("Y"))
//                .forEach(n -> System.out.println(n));

        try {
            lista.forEach(nombre -> {
                if(nombre.contains("o") == false) {
                    throw new RuntimeException(nombre + " no tiene la letra o");
                }

                System.out.println(nombre);
            });
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
