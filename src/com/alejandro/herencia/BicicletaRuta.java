package com.alejandro.herencia;

public class BicicletaRuta extends Bicicleta {
    public BicicletaRuta(String marca, String modelo, short anoModelo) {
        super(marca, modelo, anoModelo, "HERRADURA");
    }

    @Override
    public void acelerar() {
        System.out.println("La rutera aceleró!");
    }
}
