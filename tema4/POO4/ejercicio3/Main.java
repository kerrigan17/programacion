package ejercicio3;

import java.util.Scanner;

import repaso.Biblioteca.Biblioteca;


public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenú:");
            System.out.println("1. Añadir ítem.");
            System.out.println("2. Buscar ítem.");
            System.out.println("3. Eliminar ítem.");
            System.out.println("4. Listado de la biblioteca.");
            System.out.println("5. Salir.");
            System.out.print("Seleccione una opción: ");
            int opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    biblioteca.addItem();
                    break;
                case 2:
                    biblioteca.buscarItem();
                    break;
                case 3:
                    biblioteca.eliminarItem();
                    break;
                case 4:
                    biblioteca.listarBiblioteca();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    exit=true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
            }
        }
    }
}