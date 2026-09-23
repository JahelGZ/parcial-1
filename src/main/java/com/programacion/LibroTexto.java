package main.java.com.programacion;

public class LibroTexto extends Libro {

    private String curso;

    public LibroTexto(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados, String curso){

        super(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados);

        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void imprimir() {

        super.imprimir();

        System.out.println("Curso: " + curso);
    }
}