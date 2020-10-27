package com.alejandro.herencia.app;

import com.alejandro.herencia.*;

import java.util.ArrayList;
import java.util.List;

public class AppHerencia {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();

        Vehiculo taxi = new Taxi("Kia", "Picanto", (short) 2020);
        Vehiculo bici = new BicicletaMontana("GW", "Hyena", (short) 2019, "DISCO", "AIRE");
        Vehiculo mtb = new BicicletaMontana("Trek", "Marlin 7", (short) 2020, "DISCO", "HIDRAULICA");
        Vehiculo rutera = new BicicletaRuta("Pinarello", "Tour", (short) 2020);

        vehiculos.add(taxi);
        vehiculos.add(bici);
        vehiculos.add(mtb);
        vehiculos.add(rutera);

        taxi.setColor("Blanco");

        acelerarVehiculos(vehiculos);
    }

    private static void acelerarVehiculos(List<Vehiculo> vehiculos) {
        vehiculos.forEach(vehiculo -> {
            vehiculo.acelerar();
        });
    }

    private static void mostrarVehiculos(List<Vehiculo> vehiculos) {
        vehiculos.forEach(vehiculo -> {
            if (vehiculo instanceof Taxi) {
                System.out.println(vehiculo.toString() + " - es taxi.");
            } else if (vehiculo instanceof BicicletaMontana) {
                System.out.println(vehiculo.toString() + " - es bicicleta de montaña");
            }
        });
    }
}
