# Parcial practico 1
## Integrantes:

**-Jahel Alejandro Gutierrez Enriquez**

**-Alejandro Mosquera Corrales**

---
# Diagrama UML 

```mermaid
classDiagram
    direction TB

    class Libro {
        -String titulo
        -String autor
        -int numeroEjemplares
        -int numeroEjemplaresPrestados
        +Libro()
        +Libro(titulo: String)
        +Libro(titulo: String, autor: String, numeroEjemplares: int, numeroEjemplaresPrestados: int)
        +getTitulo() String
        +setTitulo(titulo: String) void
        +getAutor() String
        +setAutor(autor: String) void
        +getNumeroEjemplares() int
        +setNumeroEjemplares(numeroEjemplares: int) void
        +getNumeroEjemplaresPrestados() int
        +setNumeroEjemplaresPrestados(numeroEjemplaresPrestados: int) void
        +prestamo() boolean
        +devolucion() boolean
        +imprimir() void
    }

    class LibroTexto {
        -String curso
        +LibroTexto(titulo: String, autor: String, numeroEjemplares: int, numeroEjemplaresPrestados: int, curso: String)
        +getCurso() String
        +setCurso(curso: String) void
        +imprimir() void
    }

    class LibroTextoUNIAC {
        -String facultad
        +LibroTextoUNIAC(titulo: String, autor: String, numeroEjemplares: int, numeroEjemplaresPrestados: int, curso: String, facultad: String)
        +getFacultad() String
        +setFacultad(facultad: String) void
        +imprimir() void
    }

    class Novela {
        -String tipo
        +Novela(titulo: String, autor: String, numeroEjemplares: int, numeroEjemplaresPrestados: int, tipo: String)
        +getTipo() String
        +setTipo(tipo: String) void
        +imprimir() void
    }

    Libro <|-- LibroTexto
    Libro <|-- Novela
    LibroTexto <|-- LibroTextoUNIAC