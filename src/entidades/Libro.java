package entidades;

import java.util.Scanner;

public class Libro {
    Scanner leer = new Scanner(System.in);
    public String ISBN;
    public String titulo;
    public String autor;
    public int paginas;

    public Libro() {

    }

    public Libro(String ISBN, String titulo, String autor, int paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void cargarLibro() {
        //
        System.out.println("Ingrese el ISBN: ");
        ISBN = leer.next();
        System.out.println("Ingrese el titulo: ");
        titulo = leer.next();
        System.out.println("Ingrese el autor: ");
        autor = leer.next();
        System.out.println("Ingrese el numero de paginas: ");
        paginas = leer.nextInt();
    }

    @Override
    public String toString() {
        return "Libro [ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + "]";
    }

}
