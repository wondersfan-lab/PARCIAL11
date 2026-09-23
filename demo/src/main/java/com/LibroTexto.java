package com;

// Clase LibroTexto: hereda de Libro y agrega el atributo "curso".
// Es la clase intermedia que necesita LibroTextoUNIAC para heredar (Persona 2).
public class LibroTexto extends Libro {

    private String curso;

    // Constructor vacío
    public LibroTexto() {
        super();
        this.curso = "";
    }

    // Constructor con parámetros: reutiliza el constructor de Libro con super()
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
