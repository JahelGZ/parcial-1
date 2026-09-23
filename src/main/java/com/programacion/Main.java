package com.programacion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Objeto libro1 utilizando constructor con parametros
        Libro libro1 = new Libro(
                "Danza de dragones",
                "George R. R. Martin",
                1,
                0
        );

        // Objeto libro2 utilizando constructor vacio
        Libro libro2 = new Libro();

        System.out.println("Ingrese los datos del libro 2");

        System.out.print("Titulo: ");
        libro2.setTitulo(sc.nextLine());

        System.out.print("Autor: ");
        libro2.setAutor(sc.nextLine());

        System.out.print("Numero de ejemplares: ");
        libro2.setNumeroEjemplares(sc.nextInt());

        System.out.print("Numero de ejemplares prestados: ");
        libro2.setNumeroEjemplaresPrestados(sc.nextInt());

        // Objeto LibroTextoUNIAC con todos sus atributos
        LibroTextoUNIAC libroTextoUNIAC = new LibroTextoUNIAC(
                "Programación Orientada a Objetos",
                "Luis Joyanes Aguilar",
                5,
                1,
                "Programacion II",
                "Facultad de Ingenierias"
        );

        // Objeto Novela indicando su tipo
        Novela novela = new Novela(
                "1984",
                "George Orwell",
                4,
                1,
                "Ciencia ficcion"
        );

        System.out.println("\nLIBRO 1");
        libro1.imprimir();

        System.out.println("\nLIBRO 2");
        libro2.imprimir();

        System.out.println("\nLIBRO TEXTO UNIAC");
        libroTextoUNIAC.imprimir();

        System.out.println("\nNOVELA");
        novela.imprimir();

        System.out.println("\n=== PRUEBAS DE PRESTAMO Y DEVOLUCION ===");

        System.out.println("\n1. Intentando prestar '" + libro1.getTitulo() + "'...");
        if (libro1.prestamo()) {
            System.out.println("Exito: El libro ha sido prestado correctamente.");
        } else {
            System.out.println("Error: El libro no estaba disponible para prestamo.");
        }

        System.out.println("\n2. Intentando prestar el mismo libro por segunda vez");
        if (libro1.prestamo()) {
            System.out.println("Error: Se presto un libro que no tenia ejemplares disponibles.");
        } else {
            System.out.println("Validacion correcta: El sistema no permite prestar un libro sin ejemplares disponibles.");
        }

        System.out.println("\n3. Devolviendo el libro");
        if (libro1.devolucion()) {
            System.out.println("Exito: El libro se ha devuelto correctamente.");
        } else {
            System.out.println("Error: El libro no se pudo devolver.");
        }

        System.out.println("\n4. Intentando devolver el libro nuevamente");
        if (libro1.devolucion()) {
            System.out.println("Error: Se devolvio un libro que no estaba prestado.");
        } else {
            System.out.println("Validacion correcta: No se puede devolver un libro que no esta prestado.");
        }

        sc.close();
    }
}
