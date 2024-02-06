package POO2;

import java.util.ArrayList;
import java.util.Scanner;

public class PruebaCuentas {

    static ArrayList<Persona> personas = new ArrayList<>();
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;
        int opcion;
        while (!salir){
            mostrarMenu();
            opcion = in.nextInt();
            in.nextLine();
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
                    System.out.println("Tienes que ingresar el dni de la persona, numero de cuenta, y cantidad que desea ingresar");
                    System.out.println("Dame el dni de la persona");
                    String dniin = in.nextLine();
                    System.out.println("Dame el numero de cuenta");
                    int cuentain = in.nextInt();
                    System.out.println("Dame el importe que quieres ingresar");
                    Double importe = in.nextDouble();
                    recibirNomina(dniin, cuentain,importe);
                    break;
                case 5:
                System.out.println("Tienes que ingresar el dni de la persona, numero de cuenta, y cantidad que desea pagar");
                    System.out.println("Dame el dni de la persona");
                    String dnipa = in.nextLine();
                    System.out.println("Dame el numero de cuenta");
                    int cuentapa = in.nextInt();
                    System.out.println("Dame el importe que quieres ingresar");
                    Double pago = in.nextDouble();
                    pagarRecibo(dnipa, cuentapa, pago);
                    break;
                case 6:
                    System.out.println("String dniOrigen, int numeroCuentaOrigen, String dniDestino, int numeroCuentaDestino, double cantidad");
                    System.out.println("Dame el dni de origen");
                    String dnior = in.nextLine();
                    System.out.println("Dame el numero de cuenta origen");
                    int cuentaor = in.nextInt();
                    System.out.println("Dame el dni del receptor");
                    String dnire = in.nextLine();
                    System.out.println("Dame el numero de cuenta del receptor");
                    int cuentare = in.nextInt();
                    System.out.println("Dame la cantidad de la tranferencia");
                    int tranferencia = in.nextInt();
                    realizarTransferencia(dnior, cuentaor, dnire, cuentare,tranferencia);
                    break;
                case 7:
                    imprimirMorosos();
                    break;
                case 8:
                    System.out.println("¡Hasta pronto!");
                    salir =true;
                    break;
                default:
                    System.out.println("Opción no válida. Introduzca un número entre 1 y 8.");
            }
        }
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
        System.out.println("Usuario con dni: " + dni + " creado!");
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
            persona.addCuentaBancaria(cuenta);
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

    private static void imprimirMorosos() {
        System.out.println("**Personas morosas**");
        for (Persona persona : personas) {
            if (persona.esMorosa()) {
                System.out.println(persona);
            }
        }
    }
    private static void recibirNomina(String dni, int numeroCuenta, double cantidad) {
        Persona persona = buscarPersonaPorDNI(dni);
        if (persona != null) {
            Cuenta cuenta = persona.buscarCuentaPorNumero(numeroCuenta);
            if (cuenta != null) {
                cuenta.realizarAbono(cantidad);
                System.out.println("Nómina de " + cantidad + "€ añadida a la cuenta " + numeroCuenta + " de " + persona.getDni());
            } else {
                System.out.println("Cuenta no encontrada.");
            }
        } else {
            System.out.println("Persona no encontrada.");
        }
    }
    
    private static void pagarRecibo(String dni, int numeroCuenta, double importe) {
        Persona persona = buscarPersonaPorDNI(dni);
        if (persona != null) {
            Cuenta cuenta = persona.buscarCuentaPorNumero(numeroCuenta);
            if (cuenta != null) {
                cuenta.pagarRecibo(importe);
            } else {
                System.out.println("Cuenta no encontrada.");
            }
        } else {
            System.out.println("Persona no encontrada.");
        }
    }
    
    private static void realizarTransferencia(String dniOrigen, int numeroCuentaOrigen, String dniDestino, int numeroCuentaDestino, double cantidad) {
        Persona personaOrigen = buscarPersonaPorDNI(dniOrigen);
        Persona personaDestino = buscarPersonaPorDNI(dniDestino);
        if (personaOrigen != null && personaDestino != null) {
            Cuenta cuentaOrigen = personaOrigen.buscarCuentaPorNumero(numeroCuentaOrigen);
            Cuenta cuentaDestino = personaDestino.buscarCuentaPorNumero(numeroCuentaDestino);
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