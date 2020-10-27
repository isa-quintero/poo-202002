package com.alejandro.herencia;

public class BicicletaMontana extends Bicicleta {
    private String tipoSuspension;

    public BicicletaMontana(String marca, String modelo, short anoModelo, String tipoFreno, String tipoSuspension) {
        super(marca, modelo, anoModelo, tipoFreno);
        this.tipoSuspension = tipoSuspension;
    }

    @Override
    public void acelerar() {
        System.out.println("La MTB aceleró!");
    }

    public String getTipoSuspension() {
        return tipoSuspension;
    }

    public void setTipoSuspension(String tipoSuspension) {
        this.tipoSuspension = tipoSuspension;
    }
}
