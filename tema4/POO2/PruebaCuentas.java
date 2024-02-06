import java.util.ArrayList;
import java.util.Scanner;

public class PruebaCuentas {

    private static ArrayList<Persona> personas = new ArrayList<>();
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = in.nextInt();
            switch (opcion) {
                case 1:
                    crearPersona();
                    break;
                case 2:
                    asociarCuenta();
                    break;
                case 3:
                    mostrarDatosPersona();
                    break;
                case 4:
                    recibirNomina();
                    break;
                case 5:
                    pagarRecibo();
                    break;
                case 6:
                    realizarTransferencia();
                    break;
                case 7:
                    imprimirMorosos();
                    break;
                case 8:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida. Introduzca un número entre 1 y 8.");
            }
        } while (opcion != 8);
    }

    private static void mostrarMenu() {
        System.out.println("**Menú:**");
        System.out.println("1. Instanciar objetos de tipo Persona");
        System.out.println("2. Instanciar objetos de tipo Cuenta y asociarlo a una persona");
        System.out.println("3. Mostrar datos de una persona (por su dni)");
        System.out.println("4. Recibir la nómina mensual de una persona (por dni y núm de cuenta)");
        System.out.println("5. Recibir un pago (por dni y núm de cuenta)");
        System.out.println("6. Realizar transferencia entre cuentas");
        System.out.println("7. Imprimir las personas morosas");
        System.out.println("8. Salir");
        System.out.println("Introduzca una opción: ");
    }

    private static void crearPersona() {
        System.out.println("**Crear persona**");
        System.out.println("Introduzca el DNI de la persona: ");
        String dni = in.nextLine();
        Persona persona = new Persona(dni);
        personas.add(persona);
        System.out.println("Persona " + dni + " creada!");
    }

    private static void asociarCuenta() {
        System.out.println("**Asociar cuenta a una persona**");
        System.out.println("Introduzca el DNI de la persona: ");
        String dni = in.nextLine();
        Persona persona = buscarPersonaPorDNI(dni);
        if (persona != null) {
            System.out.println("Introduzca el número de cuenta: ");
            int numeroCuenta = in.nextInt();
            System.out.println("Introduzca el saldo disponible: ");
            double saldoDisponible = in.nextDouble();
            Cuenta cuenta = new Cuenta(numeroCuenta, saldoDisponible);
            persona.addCuenta(cuenta);
            System.out.println("Cuenta " + numeroCuenta + " añadida a la persona " + dni);
        } else {
            System.out.println("Persona no encontrada.");
        }
    }

    private static Persona buscarPersonaPorDNI(String dni) {
        for (Persona persona : personas) {
            if (persona.getDni().equals(dni)) {
                return persona;
            }
        }
        return null;
    }

    private static void mostrarDatosPersona() {
        System.out.println("**Mostrar datos de una persona**");
        System.out.println("Introduzca el DNI de la persona: ");
        String dni = in.nextLine();
        Persona persona = buscarPersonaPorDNI(dni);
        if (persona != null) {
            System.out.println(persona);
        } else {
            System.out.println("Persona no encontrada.");
        }
    }

    private static void recibirNomina() {
        System.out.println("**Recibir nómina**");
        System.out.println("Introduzca el DNI de la persona: ");
        String dni = in.nextLine();
        System.out.println("Introduzca el número de cuenta: ");
        int numeroCuenta = in.nextInt();
        System.out.println("Introduzca");
    }

    private static void imprimirMorosos() {
        System.out.println("**Personas morosas**");
        for (Persona persona : personas) {
            if (persona.esMorosa()) {
                System.out.println(persona);
            }
        }
    }
    private static void realizarTransferencia() {
        System.out.println("**Realizar transferencia**");
        System.out.println("Introduzca el DNI de la persona que envía la transferencia: ");
        String dniOrigen = in.nextLine();
        System.out.println("Introduzca el número de cuenta de origen: ");
        int numeroCuentaOrigen = in.nextInt();
        System.out.println("Introduzca el DNI de la persona que recibe la transferencia: ");
        String dniDestino = in.nextLine();
        System.out.println("Introduzca el número de cuenta de destino: ");
        int numeroCuentaDestino = in.nextInt();
        System.out.println("Introduzca la cantidad a transferir: ");
        double cantidad = in.nextDouble();
    
        Persona personaOrigen = buscarPersonaPorDNI(dniOrigen);
        Persona personaDestino = buscarPersonaPorDNI(dniDestino);
        if (personaOrigen != null && personaDestino != null) {
            Cuenta cuentaOrigen = buscarCuentaPorNumero(personaOrigen, numeroCuentaOrigen);
            Cuenta cuentaDestino = buscarCuentaPorNumero(personaDestino, numeroCuentaDestino);
            if (cuentaOrigen != null && cuentaDestino != null) {
                if (cuentaOrigen.getSaldoDisponible() >= cantidad) {
                    cuentaOrigen.setSaldoDisponible(cuentaOrigen.getSaldoDisponible() - cantidad);
                    cuentaDestino.setSaldoDisponible(cuentaDestino.getSaldoDisponible() + cantidad);
                    System.out.println("Transferencia de " + cantidad + "€ realizada con éxito!");
                    System.out.println("Saldo cuenta origen: " + cuentaOrigen.getSaldoDisponible() + "€");
                    System.out.println("Saldo cuenta destino: " + cuentaDestino.getSaldoDisponible() + "€");
                } else {
                    System.out.println("Saldo insuficiente en la cuenta origen.");
                }
            } else {
                System.out.println("Cuenta no encontrada.");
            }
        } else {
            System.out.println("Persona no encontrada.");
        }
    }
}