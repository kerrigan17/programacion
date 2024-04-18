package Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionarCola {
   ArrayList <Usuario> usuarios;

    public GestionarCola(){
        this.usuarios = new ArrayList<>();
    }

    public void agregarUsuario(String nombre, int edad, String dni){            
        for (Usuario usuario : usuarios) {
            if (usuario.getDni().equals(dni)) {
                System.out.println("Ya hay un usuario con ese dni");
                break;
            }else{
                Usuario nuevoUsuario = new Usuario(nombre, edad, dni);
                usuarios.add(nuevoUsuario);
                System.out.println("Usuario agregado correctamente.");
            }
        }
    }

    public void eliminarPrimerUsuario(){
            usuarios.remove(0);
    }

    public void eliminarUsuario(String dni){
        if (usuarios.contains(dni)) {
            usuarios.remove(dni);
            System.out.println("Usuario con el dni "+ dni +" eliminado correctamente.");        
        }else{
            System.out.println("Error: No existe ningún usuario con ese DNI.");
        }
    }

    public void mostrarUsuario(String dni) {
        boolean encontrado = false;
        for (Usuario usuario : usuarios) {
            if (usuario.getDni().equals(dni)) {
                encontrado = true;
                System.out.println("Nombre: " + usuario.getNombre());
                System.out.println("Edad: " + usuario.getEdad());
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Error: No existe ningún usuario con ese DNI.");
        }
    }

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestionarCola gestor = new GestionarCola();

        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar usuario a la cola");
            System.out.println("2. Eliminar primer usuario de la cola");
            System.out.println("3. Mostrar usuario específico");
            System.out.println("3. Eliminar usuario específico de la cola");
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
                    gestor.agregarUsuario(nombreAgregar, edadAgregar,dniAgregar);
                    break;
                case 2:
                    gestor.eliminarPrimerUsuario();
                    System.out.print("Primer usuario se ha ido");
                    break;
                case 3:
                    System.out.print("Ingrese el DNI del usuario a mostrar: ");
                    String dniMostrar = scanner.nextLine();
                    gestor.mostrarUsuario(dniMostrar);
                    break;
                case 4:
                    System.out.print("Ingrese el DNI del usuario a eliminar: ");
                    String dniEliminar = scanner.nextLine();
                    gestor.eliminarUsuario(dniEliminar);
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
