package com.alejandro.herencia.app;

import com.alejandro.herencia.*;

import java.util.ArrayList;
import java.util.List;

public class AppHerencia {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();

        Taxi taxi = new Taxi();
        Bicicleta bici = new Bicicleta();
        BicicletaMontana mtb = new BicicletaMontana();
        BicicletaRuta rutera = new BicicletaRuta();

        vehiculos.add(taxi);
        vehiculos.add(bici);
        vehiculos.add(mtb);
        vehiculos.add(rutera);

        taxi.setColor("Blanco");

        mostrarVehiculos(vehiculos);
    }

    private static void mostrarVehiculos(List<Vehiculo> vehiculos) {
        vehiculos.forEach(vehiculo -> {
            if (vehiculo instanceof Taxi) {
                System.out.println(vehiculo + " - es taxi.");
            } else if (vehiculo instanceof BicicletaMontana) {
                System.out.println(vehiculo + " - es bicicleta de montaña");
            }
        });
    }
}
