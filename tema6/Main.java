package tema6;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void menu() {
        System.out.println("Menú:");
        System.out.println("1. Añadir funko");
        System.out.println("2. Borrar funko");
        System.out.println("3. Mostrar todos los funkos");
        System.out.println("4. Mostrar el funko más caro");
        System.out.println("5. Mostrar la media de precio de los funkos");
        System.out.println("6. Mostrar los funkos agrupados por modelos");
        System.out.println("7. Mostrar los funkos de 2023");
        System.out.println("8. Salir");
        System.out.print("Elige una opción: ");
    }

    public static void crearFunko(FunkoStore csv1) throws ParseException {
        System.out.println("Introduce la clave, nombre, modelo, precio y fecha de lanzamiento (yyyy-MM-dd):");
        String clave = in.nextLine();
        String nombre = in.nextLine();
        String modelo = in.nextLine();
        double precio = in.nextDouble();
        in.nextLine(); 
        String fecha = in.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaDate = sdf.parse(fecha);

        Funko funko = new Funko(clave, nombre, modelo, precio, fechaDate);
        csv1.añadirFunko(funko);
    }

    public static void eliminarFunko(FunkoStore csv1) {
        System.out.println("Introduce la clave del funko a borrar:");
        String cod = in.nextLine();
        csv1.eliminarFunko(cod);
    }

    public static void main(String[] args) throws ParseException, IOException {
        FunkoStore csv1 = new FunkoStore();
        csv1.cargarFunkos();

        boolean condition = true;
        while (condition) {
            menu();
            int option = in.nextInt();
            in.nextLine(); 
            switch (option) {
                case 1:
                    crearFunko(csv1);
                    break;
                case 2:
                    eliminarFunko(csv1);
                    break;
                case 3:
                    csv1.mostrar();
                    break;
                case 4:
                    csv1.mostrarMasCaro();
                    break;
                case 5:
                    csv1.mostrarMedia();
                    break;
                case 6:
                    csv1.mostrarFunkosPorModelo();
                    break;
                case 7:
                    csv1.mostrarFunkosDe2023();
                    break;
                case 8:
                    condition = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            csv1.guardarFunkos();
        }
    }
}
