package com.programacion;



public class Libro {

    private String titulo;
    private String autor;
    private int numeroEjemplares;
    private int numeroEjemplaresPrestados;

    // Constructor por defecto
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.numeroEjemplares = 0;
        this.numeroEjemplaresPrestados = 0;
    }

    // Constructor con parámetros
    public Libro(String titulo, String autor,
                 int numeroEjemplares,
                 int numeroEjemplaresPrestados) {

        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

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

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public int getNumeroEjemplaresPrestados() {
        return numeroEjemplaresPrestados;
    }

    public void setNumeroEjemplaresPrestados(int numeroEjemplaresPrestados) {
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

    public boolean prestamo() {

        if (numeroEjemplaresPrestados < numeroEjemplares) {
            numeroEjemplaresPrestados++;
            return true;
        }

        return false;
    }

    public boolean devolucion() {

        if (numeroEjemplaresPrestados > 0) {
            numeroEjemplaresPrestados--;
            return true;
        }

        return false;
    }

    public void imprimir() {

        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de ejemplares: " + numeroEjemplares);
        System.out.println("Numero de ejemplares prestados: "+ numeroEjemplaresPrestados);
    }
}