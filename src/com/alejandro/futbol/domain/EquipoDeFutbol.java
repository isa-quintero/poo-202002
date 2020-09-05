package com.alejandro.futbol.domain;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeFutbol {
    private String nombre;
    private String pais;
    private short anioFundacion;
    private short nroTitulos;
    private List<Jugador> jugadores;

    public EquipoDeFutbol(String nombre, String pais, short anioFundacion) {
        this.nombre = nombre;
        this.pais = pais;
        this.anioFundacion = anioFundacion;
        this.jugadores = new ArrayList<>();
    }

    public void entrenar(String lugar) {
        System.out.println(nombre + " está entrenando en " + lugar);
    }

    public boolean jugarPartido(String lugar, EquipoDeFutbol contrario) {
        System.out.println(this.nombre + " está jugando en " + lugar + " contra " + contrario.nombre);
        return true;
    }

    public Jugador comprarJugador(Jugador jugador, int precio) {
        jugadores.add(jugador);
        return jugador;
    }

    public void venderJugador(Jugador jugador, int precio, EquipoDeFutbol destino) {
        this.jugadores.remove(jugador);
        destino.jugadores.add(jugador);
    }

    public void mostrarDelanteros() {
        jugadores.forEach(jugador -> {
            if (jugador.getPosicion().equalsIgnoreCase("Delantero")) {
                System.out.println(jugador.getNombre());
            }
        });
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public short getAnioFundacion() {
        return anioFundacion;
    }

    public short getNroTitulos() {
        return nroTitulos;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNroTitulos(short nroTitulos) {
        this.nroTitulos = nroTitulos;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
