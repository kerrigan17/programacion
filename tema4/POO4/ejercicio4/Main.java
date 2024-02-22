package ejercicio4;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
        int eleccion = in.nextInt();
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

