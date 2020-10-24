package com.alejandro.herencia;

public class Bicicleta extends Vehiculo {
    private byte nroPinones;
    private double tamanoRueda;
    private String tipoFreno;

    public byte getNroPinones() {
        return nroPinones;
    }

    public void setNroPinones(byte nroPinones) {
        this.nroPinones = nroPinones;
    }

    public double getTamanoRueda() {
        return tamanoRueda;
    }

    public void setTamanoRueda(double tamanoRueda) {
        this.tamanoRueda = tamanoRueda;
    }

    public String getTipoFreno() {
        return tipoFreno;
    }

    public void setTipoFreno(String tipoFreno) {
        this.tipoFreno = tipoFreno;
    }
}
