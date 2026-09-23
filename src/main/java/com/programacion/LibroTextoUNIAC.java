package com.programacion;

public class LibroTextoUNIAC extends LibroTexto {

    private String facultad;

    public LibroTextoUNIAC(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados,
        String curso, String facultad) {

        super(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados, curso);

        this.facultad = facultad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public void imprimir() {

        super.imprimir();

        System.out.println("Facultad: " + facultad);
    }
}