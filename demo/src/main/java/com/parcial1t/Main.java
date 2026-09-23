package com.parcial1t;

public class Main {

    private static class Libro {
        private String titulo;
        private String autor;
        private int numEjemplares;
        private int numEjemplaresPrestados;

        Libro() {
        }

        Libro(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados) {
            this.titulo = titulo;
            this.autor = autor;
            this.numEjemplares = numEjemplares;
            this.numEjemplaresPrestados = numEjemplaresPrestados;
        }

        void setTitulo(String titulo) { this.titulo = titulo; }
        void setAutor(String autor) { this.autor = autor; }
        void setNumEjemplares(int numEjemplares) { this.numEjemplares = numEjemplares; }
        void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
            this.numEjemplaresPrestados = numEjemplaresPrestados;
        }

        boolean prestamo() {
            if (numEjemplaresPrestados >= numEjemplares) {
                return false;
            }
            numEjemplaresPrestados++;
            return true;
        }

        boolean devolucion() {
            if (numEjemplaresPrestados <= 0) {
                return false;
            }
            numEjemplaresPrestados--;
            return true;
        }

        @Override
        public String toString() {
            return "Título: " + titulo + ", Autor: " + autor
                    + ", Ejemplares: " + numEjemplares
                    + ", Prestados: " + numEjemplaresPrestados;
        }
    }

    private static class LibroTextoUNIAC extends Libro {
        private final String curso;
        private final String facultad;

        LibroTextoUNIAC(String titulo, String autor, int ejemplares, int prestados,
                        String curso, String facultad) {
            super(titulo, autor, ejemplares, prestados);
            this.curso = curso;
            this.facultad = facultad;
        }

        @Override
        public String toString() {
            return super.toString() + ", Curso: " + curso + ", Facultad: " + facultad;
        }
    }

    private static class Novela extends Libro {
        private final String genero;

        Novela(String titulo, String autor, int ejemplares, int prestados, String genero) {
            super(titulo, autor, ejemplares, prestados);
            this.genero = genero;
        }

        @Override
        public String toString() {
            return super.toString() + ", Género: " + genero;
        }
    }

    public static void main(String[] args) {

        // ---------- libro1: Libro creado con el constructor por parámetros ----------
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 3, 0);

        System.out.println("===== LIBRO 1 (constructor por parámetros) =====");
        System.out.println(libro1);
        probarPrestamoYDevolucion(libro1);

        // ---------- libro2: Libro creado con constructor vacío + set/get ----------
        Libro libro2 = new Libro();
        libro2.setTitulo("El principito");
        libro2.setAutor("Antoine de Saint-Exupéry");
        libro2.setNumEjemplares(2);
        libro2.setNumEjemplaresPrestados(0);

        System.out.println("\n===== LIBRO 2 (constructor vacío + set/get) =====");
        System.out.println(libro2);
        probarPrestamoYDevolucion(libro2);

        // ---------- libroTextoUNIAC: objeto completo ----------
        LibroTextoUNIAC libroTextoUNIAC = new LibroTextoUNIAC(
                "Programación Orientada a Objetos",
                "Bjarne Stroustrup",
                5,
                0,
                "Ingeniería de Software",
                "Facultad de Ingeniería"
        );

        System.out.println("\n===== LIBRO DE TEXTO UNIAC =====");
        System.out.println(libroTextoUNIAC);
        probarPrestamoYDevolucion(libroTextoUNIAC);

        // ---------- novela ----------
        Novela novela = new Novela(
                "El nombre del viento",
                "Patrick Rothfuss",
                4,
                0,
                "Fantasía"
        );

        System.out.println("\n===== NOVELA =====");
        System.out.println(novela);
        probarPrestamoYDevolucion(novela);
    }

    // Método reutilizable para probar prestamo() y devolucion() sobre cualquier Libro
    // (funciona con libro1, libro2, libroTextoUNIAC y novela gracias al polimorfismo)
    private static void probarPrestamoYDevolucion(Libro libro) {
        boolean prestado = libro.prestamo();
        System.out.println("Intento de préstamo: " + (prestado ? "OK, se prestó un ejemplar" : "No hay ejemplares disponibles"));
        System.out.println(libro);

        boolean devuelto = libro.devolucion();
        System.out.println("Intento de devolución: " + (devuelto ? "OK, se devolvió un ejemplar" : "No hay ejemplares prestados"));
        System.out.println(libro);
    }
}
