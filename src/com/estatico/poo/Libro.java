package com.estatico.poo;

public class Libro {
    private static int nroLibrosCreados = 0;
    private int serial;
    private String titulo;
    private String indice;
    private String autor;
    private short nroPaginas;

    private Libro(String titulo) {
        this.titulo = titulo;
        this.serial = nroLibrosCreados + 1;

        Libro.nroLibrosCreados++;
    }

    public static Libro crearLibro(String titulo) {
        if (nroLibrosCreados < 3) {
            return new Libro(titulo);
        } else {
            System.out.println("No se pueden crear mas de tres libros");
            return null;
        }
    }

    public static int getNroLibrosCreados() {
        return nroLibrosCreados;
    }

    public int getSerial() {
        return serial;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIndice() {
        return indice;
    }

    public String getAutor() {
        return autor;
    }

    public short getNroPaginas() {
        return nroPaginas;
    }

    public void setIndice(String indice) {
        this.indice = indice;
    }
}
