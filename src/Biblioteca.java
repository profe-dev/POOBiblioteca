import java.util.ArrayList;

public class Biblioteca {
    //Propiedades
    private ArrayList<Libro> libros;

    //Constructor
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    //Métodos
    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println(libro.getTitulo() + "  agregado a la biblioteca");
    }

    public void prestarLibro(String titulo) {
        for(Libro libro : libros) {
            if(libro.getTitulo().equals(titulo) && !libro.estaPrestado()) {
                libro.prestar();
                return;
            }
        }
        System.out.println("Libro no disponible para préstamo");
    }

    public void devolverLibro(String titulo) {
        for(Libro libro : libros) {
            if(libro.getTitulo().equals(titulo) && libro.estaPrestado()) {
                libro.devolver();
                return;
            }
        }
        System.out.println("Libro no encontrado o no estaba prestado");
    }

}
