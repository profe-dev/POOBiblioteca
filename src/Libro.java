public class Libro {
    //Propiedades
    private String titulo;
    private String autor;
    private boolean estaPrestado;

    //Constructor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.estaPrestado = false;
    }

    //Métodos
    public void prestar() {
        if(!estaPrestado) {
            estaPrestado = true;
            System.out.println(titulo + " ha sido prestado");
        } else {
            System.out.println(titulo + " ya está prestado");
        }
    }

    public void devolver() {
        estaPrestado = false;
        System.out.println(titulo + " ha sido devuelto");
    }

    public boolean estaPrestado() {
        return estaPrestado;
    }

    //Métodos getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

}
