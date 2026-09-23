package com;

// Clase Novela: hereda de Libro y agrega el atributo "tipo" (ej: terror, romance, ciencia ficción...)
public class Novela extends Libro {

    private String tipo;

    // Constructor vacío
    public Novela() {
        super();
        this.tipo = "";
    }

    // Constructor con parámetros
    public Novela(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados, String tipo) {
        super(titulo, autor, numEjemplares, numEjemplaresPrestados);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo de novela: " + tipo;
    }
}
