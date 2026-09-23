# PARCIAL11
emmanuel ortega 
jhontan morales
estabn muñoz ordoñez


classDiagram
    class Libro {
        -String titulo
        -String autor
        -int numEjemplares
        -int numEjemplaresPrestados
        +Libro()
        +Libro(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados)
        +String getTitulo()
        +void setTitulo(String titulo)
        +String getAutor()
        +void setAutor(String autor)
        +int getNumEjemplares()
        +void setNumEjemplares(int numEjemplares)
        +int getNumEjemplaresPrestados()
        +void setNumEjemplaresPrestados(int numEjemplaresPrestados)
        +boolean prestamo()
        +boolean devolucion()
        +String toString()
    }

    class LibroTexto {
        -String curso
        +LibroTexto()
        +LibroTexto(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados, String curso)
        +String getCurso()
        +void setCurso(String curso)
        +String toString()
    }

    class LibroTextoUNIAC {
        -String facultad
        +LibroTextoUNIAC(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados, String curso, String facultad)
        +String getFacultad()
        +void setFacultad(String facultad)
        +String toString()
    }

    class Novela {
        -String tipo
        +Novela()
        +Novela(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados, String tipo)
        +String getTipo()
        +void setTipo(String tipo)
        +String toString()
    }

    Libro <|-- LibroTexto
    Libro <|-- Novela
    LibroTexto <|-- LibroTextoUNIAC
