package com.alejandro.casteo;

import com.alejandro.domain.Persona;

public class CastingApp {
    public static void main(String[] args) {
        // Upcasting
        Object miObjeto = new Persona("Ligia");
        System.out.println(miObjeto);
        // Downcasting
        if (miObjeto instanceof Persona) {
            Persona persona = (Persona) miObjeto;
            System.out.println(persona.getNombre());
        } else {
            System.out.println("el objeto no es de tipo Persona");
        }

        // Casteo Implicito
        int numero = 3000;
        long numeroLong = numero;

        // Casteo explicito
        long otroNumero = 50000;
        int numeroShort = (int) otroNumero;

        // Casteo de String a primitivos

        try {
            String texto = "24b";
            short numeroTexto = Short.parseShort(texto);

            System.out.println(numeroTexto);
        } catch (Exception e) {
            System.out.println("El casteo no se realizó porque no es un número");
        }

        long numeroGrande = 2435214;
        String textoGrande = String.valueOf(numeroGrande);
        String otroTexto = Long.toString(numeroGrande);

        System.out.println(textoGrande);
    }
}
