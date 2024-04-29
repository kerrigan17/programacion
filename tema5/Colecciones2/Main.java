package Colecciones2;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RegistroAvistamientos registro = new RegistroAvistamientos();

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nMenú de Registro de Avistamientos:");
            System.out.println("1. Añadir avistamiento de serpiente");
            System.out.println("2. Añadir avistamiento de pájaro");
            System.out.println("3. Añadir avistamiento de manada de lobos");
            System.out.println("4. Mostrar todos los avistamientos desde las 8 horas");
            System.out.println("5. Mostrar todos los avistamientos nocturnos");
            System.out.println("6. Mostrar todas las manadas de lobos");
            System.out.println("7. Mostrar todas las serpientes");
            System.out.println("8. Mostrar todos los pájaros");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarAvistamientoSerpiente(scanner, registro);
                    break;
                case 2:
                    agregarAvistamientoPajaro(scanner, registro);
                    break;
                case 3:
                    agregarAvistamientoManadaLobos(scanner, registro);
                    break;
                case 4:
                    mostrarAvistamientosDesdeLasOcho(registro);
                    break;
                case 5:
                    mostrarAvistamientosNocturnos(registro);
                    break;
                case 6:
                    mostrarManadasLobos(registro);
                    break;
                case 7:
                    mostrarSerpientes(registro);
                    break;
                case 8:
                    mostrarPajaros(registro);
                    break;
                case 9:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        }

        scanner.close();
    }

    private static void agregarAvistamientoSerpiente(Scanner scanner, RegistroAvistamientos registro) {
        System.out.println("Ingrese la hora del día:");
        int hora = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Ingrese la especie:");
        String especie = scanner.nextLine();
        System.out.println("Ingrese la longitud (en metros):");
        double longitud = scanner.nextDouble();

        Serpiente serpiente = new Serpiente(hora, especie, longitud);
        registro.agregarAvistamiento(serpiente);
        System.out.println("Avistamiento de serpiente añadido exitosamente.");
    }

    private static void agregarAvistamientoPajaro(Scanner scanner, RegistroAvistamientos registro) {
        System.out.println("Ingrese la hora del día:");
        int hora = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese la especie:");
        String especie = scanner.nextLine();
        System.out.println("Ingrese el peso (en gramos):");
        double peso = scanner.nextDouble();

        Pajaro pajaro = new Pajaro(hora, especie, peso);
        registro.agregarAvistamiento(pajaro);
        System.out.println("Avistamiento de pájaro añadido exitosamente.");
    }

    private static void mostrarManadasLobos(RegistroAvistamientos registro) {
        List<AvistamientoAnimal> avistamientos = registro.mostrarManadasLobos();
        if (avistamientos.isEmpty()) {
            System.out.println("No hay manadas de lobos registradas.");
        } else {
            System.out.println("Manadas de lobos registradas:");
            for (AvistamientoAnimal avistamiento : avistamientos) {
                System.out.println(avistamiento);
            }
        }
    }

    private static void agregarAvistamientoManadaLobos(Scanner scanner, RegistroAvistamientos registro) {
        System.out.println("Ingrese la hora del día:");
        int hora = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese la especie:");
        String especie = scanner.nextLine();
        System.out.println("Ingrese el número de lobos:");
        int numeroLobos = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese las observaciones:");
        String observaciones = scanner.nextLine();

        ManadaLobos manada = new ManadaLobos(hora, especie, numeroLobos, observaciones);
        registro.agregarAvistamiento(manada);
        System.out.println("Avistamiento de manada de lobos añadido exitosamente.");
    }

    private static void mostrarAvistamientosDesdeLasOcho(RegistroAvistamientos registro) {
        List<AvistamientoAnimal> avistamientos = registro.avistamientosDesdeLasOcho();
        if (avistamientos.isEmpty()) {
            System.out.println("No hay avistamientos registrados desde las 8 horas.");
        } else {
            System.out.println("Avistamientos registrados desde las 8 horas:");
            for (AvistamientoAnimal avistamiento : avistamientos) {
                System.out.println(avistamiento);
            }
        }
    }

    private static void mostrarAvistamientosNocturnos(RegistroAvistamientos registro) {
        List<AvistamientoAnimal> avistamientos = registro.avistamientosNocturnos();
        if (avistamientos.isEmpty()) {
            System.out.println("No hay avistamientos nocturnos registrados.");
        } else {
            System.out.println("Avistamientos nocturnos:");
            for (AvistamientoAnimal avistamiento : avistamientos) {
                System.out.println(avistamiento);
            }
        }
    }

    private static void mostrarSerpientes(RegistroAvistamientos registro) {
        List<AvistamientoAnimal> avistamientos = registro.mostrarSerpientes();
        if (avistamientos.isEmpty()) {
            System.out.println("No hay serpientes registradas.");
        } else {
            System.out.println("Serpientes registradas:");
            for (AvistamientoAnimal avistamiento : avistamientos) {
                System.out.println(avistamiento);
            }
        }
    }
    
    
    private static void mostrarPajaros(RegistroAvistamientos registro) {
        List<AvistamientoAnimal> avistamientos = registro.mostrarPajaros();
        if (avistamientos.isEmpty()) {
            System.out.println("No hay pájaros registrados.");
        } else {
            System.out.println("Pájaros registrados:");
            for (AvistamientoAnimal avistamiento : avistamientos) {
                System.out.println(avistamiento);
            }
        }
    }
}
