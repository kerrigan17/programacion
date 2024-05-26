package vexamen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Artista> artistas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case 1:
                    anadirArtista();
                    break;
                case 2:
                    mostrarArtista();
                    break;
                case 3:
                    borrarArtista();
                    break;
                case 4:
                    anadirDisco();
                    break;
                case 5:
                    mostrarListado();
                    break;
                case 6:
                    mostrarCantantes();
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    private static void mostrarMenu() {
        System.out.println("Menú:");
        System.out.println("1. Añadir artista");
        System.out.println("2. Mostrar artista");
        System.out.println("3. Borrar artista");
        System.out.println("4. Añadir nuevo disco a un artista");
        System.out.println("5. Mostrar listado de artistas");
        System.out.println("6. Mostrar listado de cantantes");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void anadirArtista() {
        System.out.print("Ingrese el tipo de artista (cantante/grupo/dj): ");
        String tipo = scanner.nextLine().toLowerCase();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Año: ");
        int anio = Integer.parseInt(scanner.nextLine());
        System.out.print("Tipo de música: ");
        String tipoMusica = scanner.nextLine();

        switch (tipo) {
            case "cantante":
                artistas.add(new Cantante(nombre, anio, tipoMusica));
                break;
            case "grupo":
                System.out.print("Número de componentes: ");
                int numeroComponentes = Integer.parseInt(scanner.nextLine());
                artistas.add(new Grupo(nombre, anio, tipoMusica, numeroComponentes));
                break;
            case "dj":
                System.out.print("Seudónimo: ");
                String seudonimo = scanner.nextLine();
                artistas.add(new DJ(nombre, seudonimo, anio, tipoMusica));
                break;
            default:
                System.out.println("Tipo de artista no válido.");
        }
    }

    private static void mostrarArtista() {
        System.out.print("Ingrese el nombre del artista: ");
        String nombre = scanner.nextLine();
        for (Artista artista : artistas) {
            if (artista.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(artista);
                return;
            }
        }
        System.out.println("Artista no encontrado.");
    }

    private static void borrarArtista() {
        System.out.print("Ingrese el nombre del artista a borrar: ");
        String nombre = scanner.nextLine();
        artistas.removeIf(artista -> artista.getNombre().equalsIgnoreCase(nombre));
        System.out.println("Artista borrado.");
    }

    private static void anadirDisco() {
        System.out.print("Ingrese el nombre del artista: ");
        String nombre = scanner.nextLine();
        for (Artista artista : artistas) {
            if (artista.getNombre().equalsIgnoreCase(nombre)) {
                System.out.print("Título del disco: ");
                String titulo = scanner.nextLine();
                System.out.print("Año del disco: ");
                int anio = Integer.parseInt(scanner.nextLine());
                System.out.print("Número de canciones: ");
                int numeroCanciones = Integer.parseInt(scanner.nextLine());
                Disco disco = new Disco(titulo, anio, numeroCanciones);
                artista.agregarDisco(disco);
                System.out.println("Disco añadido.");
                return;
            }
        }
        System.out.println("Artista no encontrado.");
    }

    private static void mostrarListado() {
        for (Artista artista : artistas) {
            System.out.println(artista);
        }
    }

    private static void mostrarCantantes() {
        for (Artista artista : artistas) {
            if (artista instanceof Cantante) {
                System.out.println(artista);
            }
        }
    }
}
