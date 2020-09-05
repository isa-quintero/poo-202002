package com.alejandro.futbol.app;

import com.alejandro.futbol.domain.EquipoDeFutbol;
import com.alejandro.futbol.domain.Jugador;

import java.util.ArrayList;
import java.util.Arrays;

public class AppFutbol {
    public static void main(String[] args) {
        Jugador duque = new Jugador("Jefferson Duque", (byte) 33, "Delantero");
        Jugador aristi = new Jugador("Victor Aristizabal", (byte) 45, "DELANTERO");
        Jugador mac = new Jugador("Macnelly Torres", (byte) 34, "Volante 10");
        Jugador cardona = new Jugador("Edwin Cardona", (byte) 26, "Creativo");

        EquipoDeFutbol nacional = new EquipoDeFutbol("Atl. Nacional", "Colombia", (short) 1950);

        nacional.getJugadores().addAll(Arrays.asList(duque, mac, aristi));

        EquipoDeFutbol boca = new EquipoDeFutbol("Boca Juniors", "Argentina", (short) 1918);

        nacional.entrenar("Guarne");
        boca.jugarPartido("Miami", nacional);

        System.out.println("Boca antes de comprar: " + boca.getJugadores().size());
        boca.comprarJugador(cardona, 5000000);
        nacional.venderJugador(duque, 8000000, boca);

        System.out.println("Boca después de comprar: " + boca.getJugadores().size());

        nacional.mostrarDelanteros();
    }
}
