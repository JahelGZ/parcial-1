package main.java.com.programacion;


public class Novela extends Libro {

    private String tipo;

    public Novela(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados, String tipo) {

        super(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados);
        
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void imprimir() {

        super.imprimir();

        System.out.println("Tipo de novela: " + tipo);
    }
}
