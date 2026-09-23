package com;

public class LibroTextoUNIAJC extends LibroTexto {

    private String facultad;

    public LibroTextoUNIAJC(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados, String curso, String facultad) {
        // super() ahora llama al constructor de LibroTexto (le pasa 5 datos)
        super(titulo, autor, numEjemplares, numEjemplaresPrestados, curso);
        
        // Guardamos el dato exclusivo de esta clase
        this.facultad = facultad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return super.toString() + "\nFacultad que lo publicó: " + facultad;
    }
}