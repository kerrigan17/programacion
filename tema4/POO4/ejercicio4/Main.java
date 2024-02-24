package ejercicio4;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice!=5) {
            menu();
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Ingrese el título del ítem: ");
                    String title = scanner.nextLine();
                    System.out.print("Ingrese el tipo de ítem (Libro/Revista/DVD): ");
                    String type = scanner.nextLine();
                    biblioteca.addItem(title, type);
                    break;
                case 2:
                    System.out.print("Ingrese el título del ítem a buscar: ");
                    String searchTitle = scanner.nextLine();
                    biblioteca.buscarItem(searchTitle);
                    break;
                case 3:
                    System.out.print("Ingrese el título del ítem a eliminar: ");
                    String deleteTitle = scanner.nextLine();
                    biblioteca.deleteItem(deleteTitle);
                    break;
                case 4:
                    biblioteca.listItems();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione nuevamente.");
            }
        }
        scanner.close();
    }
    
    public static void menu(){
        System.out.println("*MENU*");
        System.out.println("1. Añadir ítem.");
        System.out.println("2. Buscar ítem.");
        System.out.println("3. Eliminar ítem.");
        System.out.println("4. Listado de la biblioteca.");
        System.out.println(" 5. Salir");
    }
    
}

