package com.parcial1t;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        // ---------- libro1: Libro creado con el constructor por parámetros ----------
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 3, 0);

        System.out.println("===== LIBRO 1 (constructor por parámetros) =====");
        System.out.println(libro1);
        probarPrestamoYDevolucion(libro1);

        // ---------- libro2: Libro creado con constructor vacío + set/get y Scanner ----------
        Libro libro2 = new Libro();
        
        System.out.println("\n===== INGRESAR DATOS PARA EL LIBRO 2 =====");
        System.out.print("Ingrese el título del libro: ");
        libro2.setTitulo(teclado.nextLine());
        
        System.out.print("Ingrese el autor del libro: ");
        libro2.setAutor(teclado.nextLine());
        
        System.out.print("Ingrese el número de ejemplares disponibles: ");
        libro2.setNumEjemplares(teclado.nextInt());
        
        libro2.setNumEjemplaresPrestados(0); // Todo libro nuevo inicia con 0 prestados

        System.out.println("\n===== LIBRO 2 (constructor vacío + set/get) =====");
        System.out.println(libro2);
        probarPrestamoYDevolucion(libro2);

        // ---------- libroTextoUNIAJC: objeto completo de tu herencia ----------
        LibroTextoUNIAJC libroTextoUNIAJC = new LibroTextoUNIAJC(
                "Programación Orientada a Objetos",
                "Bjarne Stroustrup",
                5,
                0,
                "Ingeniería de Software",
                "Facultad de Ingeniería"
        );

        System.out.println("\n===== LIBRO DE TEXTO UNIAJC =====");
        System.out.println(libroTextoUNIAJC);
        probarPrestamoYDevolucion(libroTextoUNIAJC);

        // ---------- novela: objeto completo de la herencia de Jonathan ----------
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
        
        teclado.close();
    }

    // Método reutilizable para probar prestamo() y devolucion() sobre cualquier Libro
    // (funciona con libro1, libro2, libroTextoUNIAJC y novela gracias al polimorfismo)
    private static void probarPrestamoYDevolucion(Libro libro) {
        boolean prestado = libro.prestamo();
        System.out.println("Intento de préstamo: " + (prestado ? "OK, se prestó un ejemplar" : "No hay ejemplares disponibles"));
        System.out.println(libro);

        boolean devuelto = libro.devolucion();
        System.out.println("Intento de devolución: " + (devuelto ? "OK, se devolvió un ejemplar" : "No hay ejemplares prestados"));
        System.out.println(libro);
    }
}