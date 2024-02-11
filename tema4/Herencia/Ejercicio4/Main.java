package Herencia.Ejercicio4;

public class Main {

    public static void main(String[] args) {

        Libro libro = new Libro(1, "Cien años de soledad", "Gabriel García Márquez", "Sudamericana");
        System.out.println(libro);
        System.out.println(libro.getInformacionAdicional());

        Revista revista = new Revista(2, "National Geographic", 12, 2023);
        System.out.println(revista);
        System.out.println(revista.getInformacionAdicional());

        Dvd DVD =new Dvd(3, "El Señor de los Anillos", "Peter Jackson", 2001, Herencia.Ejercicio4.Dvd.TipoDvd.CIENCIA_FICCION);
        System.out.println(DVD);
        System.out.println(DVD.getInformacionAdicional());
    }
}