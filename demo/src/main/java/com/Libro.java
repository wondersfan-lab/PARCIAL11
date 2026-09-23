package com;

// Clase Libro: encapsula los datos y el comportamiento comunes a todo libro.
// Los atributos son privados (encapsulamiento) y solo se acceden mediante get/set.
public class Libro {

    private String titulo;
    private String autor;
    private int numEjemplares;
    private int numEjemplaresPrestados;

    // Constructor por defecto: crea un libro "vacío".
    // Se inicializan los contadores en 0 para evitar valores basura.
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.numEjemplares = 0;
        this.numEjemplaresPrestados = 0;
    }

    // Constructor con parámetros: crea el libro con todos sus datos de una vez.
    public Libro(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }

    // Getters y setters de cada atributo (obligatorio por el enunciado)
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public int getNumEjemplaresPrestados() {
        return numEjemplaresPrestados;
    }

    public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }

    // Presta un libro: solo se puede si hay ejemplares disponibles
    // (ejemplares totales menos los que ya están prestados).
    // Devuelve true si el préstamo se pudo realizar, false si no.
    public boolean prestamo() {
        int disponibles = numEjemplares - numEjemplaresPrestados;
        if (disponibles > 0) {
            numEjemplaresPrestados++;
            return true;
        }
        return false;
    }

    // Devuelve un libro: solo se puede si hay al menos un ejemplar prestado.
    // No se puede devolver lo que no se había prestado.
    public boolean devolucion() {
        if (numEjemplaresPrestados > 0) {
            numEjemplaresPrestados--;
            return true;
        }
        return false;
    }

    // toString para mostrar los datos del libro de forma legible.
    // Las subclases lo sobreescriben (@Override) para agregar sus propios atributos.
    @Override
    public String toString() {
        return "Titulo: " + titulo +
                ", Autor: " + autor +
                ", Ejemplares: " + numEjemplares +
                ", Prestados: " + numEjemplaresPrestados;
    }
}