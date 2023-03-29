import entidades.Libro;

public class App {
    public static void main(String[] args) throws Exception {
        Libro primerLibro = new Libro();
        System.out.println("Primer libro constructor generico");
        System.out.println(primerLibro.toString());
        System.out.println("Segundo libro con el detalle en el constructor");
        Libro segundoLibro = new Libro("IS12222BN", "El nuevo camino", "Andresito Lorenzo", 25);
        System.out.println(segundoLibro);
        System.out.println("Cargamos ahora con el metodo en el primer libro: ");
        primerLibro.cargarLibro();
        System.out.println("El primero quedo: " + primerLibro);
        System.out.println("El segundo quedo: " + segundoLibro);

    }
}
