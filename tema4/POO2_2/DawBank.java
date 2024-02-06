package POO2_2;

import java.util.Scanner;

public class DawBank {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        boolean salir = false;
        int opcion;

        System.out.println("Introduzca el IBAN de la cuenta: ");
        String iban = in.nextLine();
        System.out.println("Introduzca el titular de la cuenta: ");
        String titular = in.nextLine();
        CuentaBancaria cuenta = new CuentaBancaria(iban, titular);


        while (!salir){
            mostrarMenu();
            opcion = in.nextInt();
            in.nextLine();
            switch (opcion) {
                case 1:
                    mostrarDatosCuenta(cuenta);
                    break;
                case 2:
                    mostrarIban(cuenta);
                    break;
                case 3: 
                    mostrarTitular(cuenta);
                    break;
                case 4:
                    mostrarSaldo(cuenta);
                    break;
                case 5:
                    System.out.println("\n**Ingreso:**");
                    System.out.println("Introduzca la cantidad a ingresar: ");
                    double cantidad = in.nextDouble();
                    cuenta.ingresar(cantidad);
                    break;
                case 6:
                    System.out.println("\n**Retirada:**");
                    System.out.println("Introduzca la cantidad a ingresar: ");
                    double cantidadIngreso = in.nextDouble();
                    cuenta.retirar(cantidadIngreso);
                    break;
                case 7:
                    cuenta.mostrarMovimientos();
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
        System.out.println("\n**Menú:**");
        System.out.println("1. Datos de la cuenta.");
        System.out.println("2. Mostrar IBAN");
        System.out.println("3. Mostrar titular");
        System.out.println("4. Mostrar saldo");
        System.out.println("5. Cantidad a ingresar");
        System.out.println("6. Realizar retirada(si es posible)");
        System.out.println("7. Movimientos");
        System.out.println("8. Salir");
        System.out.println("Introduzca una opción: ");
    }
    private static void mostrarDatosCuenta(CuentaBancaria cuenta) {
        System.out.println("**Datos de la cuenta:**");
        System.out.println("IBAN: " + cuenta.getIban());
        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Saldo: " + cuenta.getSaldo() + "€");
    }
    private static void mostrarIban(CuentaBancaria cuenta){
        System.out.println("IBAN: "+cuenta.getIban());
    }
    private static void mostrarTitular(CuentaBancaria cuenta){
        System.out.println("Titular: " +cuenta.getTitular());
    }
    private static void mostrarSaldo(CuentaBancaria cuenta){
        System.out.println("Saldo: " +cuenta.getSaldo());
    }

}
