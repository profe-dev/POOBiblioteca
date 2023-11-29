public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(new Libro("Papelucho", "Marcela Paz"));
        biblioteca.agregarLibro(new Libro("Viaje al Centro de la Tierra", "Julio Verne"));

        biblioteca.prestarLibro("Papelucho");
        biblioteca.prestarLibro("Papelucho");
        //biblioteca.devolverLibro("Papelucho");

    }
}