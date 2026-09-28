package com.parcial1t;

public class LibroTexto extends Libro {

    private String curso;

    public LibroTexto(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados, String curso) {
        super(titulo, autor, numEjemplares, numEjemplaresPrestados);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCurso: " + curso;
    }
}
   