package Ejercicio2;

import java.util.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class GestorGimnasio {
    Map<String, Usuarios> usuarios;

    public GestorGimnasio() {
        this.usuarios = new HashMap<>();
    }

    public void agregarUsuario(String dni, String nombre, int edad) {
        Usuarios usuario = new Usuarios(nombre, edad);
        usuarios.put(dni, usuario);
        System.out.println("Usuario agregado correctamente.");
    }

    public void eliminarUsuario(String dni) {
        if (usuarios.containsKey(dni)) {
            usuarios.remove(dni);
            System.out.println("Usuario eliminado correctamente.");
        } else {
            System.out.println("Error: No existe ningún usuario con ese DNI.");
        }
    }

    public void mostrarUsuario(String dni) {
        if (usuarios.containsKey(dni)) {
            Usuarios usuario = usuarios.get(dni);
            System.out.println("Nombre: " + usuario.getNombre());
            System.out.println("Edad: " + usuario.getEdad());
        } else {
            System.out.println("Error: No existe ningún usuario con ese DNI.");
        }
    }

    public void modificarUsuario(String dni, String nuevoNombre, int nuevaEdad) {
        if (usuarios.containsKey(dni)) {
            Usuarios usuario = usuarios.get(dni);
            usuario.setNombre(nuevoNombre);
            usuario.setEdad(nuevaEdad);
            System.out.println("Usuario modificado correctamente.");
        } else {
            System.out.println("Error: No existe ningún usuario con ese DNI.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorGimnasio gestor = new GestorGimnasio();

        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar usuario");
            System.out.println("2. Eliminar usuario");
            System.out.println("3. Mostrar usuario");
            System.out.println("4. Modificar usuario");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el DNI del usuario: ");
                    String dniAgregar = scanner.nextLine();
                    System.out.print("Ingrese el nombre del usuario: ");
                    String nombreAgregar = scanner.nextLine();
                    System.out.print("Ingrese la edad del usuario: ");
                    int edadAgregar = scanner.nextInt();
                    gestor.agregarUsuario(dniAgregar, nombreAgregar, edadAgregar);
                    break;
                case 2:
                    System.out.print("Ingrese el DNI del usuario a eliminar: ");
                    String dniEliminar = scanner.nextLine();
                    gestor.eliminarUsuario(dniEliminar);
                    break;
                case 3:
                    System.out.print("Ingrese el DNI del usuario a mostrar: ");
                    String dniMostrar = scanner.nextLine();
                    gestor.mostrarUsuario(dniMostrar);
                    break;
                case 4:
                    System.out.print("Ingrese el DNI del usuario a modificar: ");
                    String dniModificar = scanner.nextLine();
                    System.out.print("Ingrese el nuevo nombre del usuario: ");
                    String nuevoNombre = scanner.nextLine();
                    System.out.print("Ingrese la nueva edad del usuario: ");
                    int nuevaEdad = scanner.nextInt();
                    gestor.modificarUsuario(dniModificar, nuevoNombre, nuevaEdad);
                    break;
                case 5:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Error: Opción no válida.");
            }
        }

        scanner.close();
    }
}
