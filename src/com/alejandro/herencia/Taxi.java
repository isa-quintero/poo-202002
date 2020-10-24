package com.alejandro.herencia;

public class Taxi extends Vehiculo {
    private String registroCirculacion;
    private String empresa;
    private byte nroPasajeros;

    public String getRegistroCirculacion() {
        return registroCirculacion;
    }

    public void setRegistroCirculacion(String registroCirculacion) {
        this.registroCirculacion = registroCirculacion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public byte getNroPasajeros() {
        return nroPasajeros;
    }

    public void setNroPasajeros(byte nroPasajeros) {
        this.nroPasajeros = nroPasajeros;
    }
}
