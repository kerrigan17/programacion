package Ejercicio2;

import java.util.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;


public class Gimnasio {
    static Scanner in = new Scanner(System.in);

    public static void showMenu(){
        System.out.println("1. Dar de alta usuario");
        System.out.println("2. Dar de baja usuario");
        System.out.println("3. Modificar usuario");
        System.out.println("4. Salir");
    }

    public static void main(String[] args) {

        Map<String, Usuarios> users = new HashMap<>();

        boolean salir = false;
        while (!salir){
            showMenu();
            int numero = in.nextInt();
            in.nextLine();
            switch (numero){
                case 1:
                    System.out.println("Dime el dni del Usuario que quieres añadir");
                    String dni = in.nextLine();
                    System.out.println("Dame el nombre del usuario");
                    String nombre = in.nextLine();
                    System.out.println("Dame edad");
                    int edad = in.nextInt();
                    in.nextLine();
                    Usuarios user = new Usuarios(nombre, edad);
                    users.put(dni, user);
                    break;
                case 2:
                    System.out.println("Dime el dni del Usuario que quieres eliminar");
                    String dniBuscar = in.nextLine();
                    Usuarios buscado = users.get(dniBuscar);
                    if (users.containsValue(buscado)){
                        users.remove(buscado);
                        System.out.println("Usuario eliminado correctamente.");
                    }else {
                        System.out.println("Lo siento, no existe ninguna persona registrada con ese nombre ");
                    }
                    break;
                case 3:
                    System.out.println("Dime el dni del Usuario que quieres modificar");
                    String dniBuscare = in.nextLine();
                    Usuarios buscador = users.get(dniBuscare);
                    if (users.containsValue(buscador)){
                        users.remove(buscador);
                        System.out.println("Usuario eliminado correctamente.");
                    }else {
                        System.out.println("Lo siento, no existe ninguna persona registrada con ese nombre ");
                    }
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción del menú.");

            }

        }

    }
}
