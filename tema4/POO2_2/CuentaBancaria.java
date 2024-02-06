package POO2_2;

public class CuentaBancaria {
    private final String iban;
    private final String nombre;
    private double saldo;
    private String[] movimientos;
    private int contador;

    public CuentaBancaria(String iban, String nombre) {
        this.iban = iban;
        this.nombre = nombre;
        this.saldo = 0;
        this.movimientos = new String[100];
        this.contador=0;
    }

    public String getIban() {
        return iban;
    }

    public String getTitular() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public String[] getMovimientos() {
        return movimientos;
    }
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            anadirMovimiento("Ingreso: " + cantidad + "€");
            if (saldo > 3000) {
                System.out.println("**AVISO: Notificar a hacienda**");
            }
        } else {
            System.out.println("La cantidad debe ser mayor a 0");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && saldo - cantidad >= -50) {
            saldo -= cantidad;
            anadirMovimiento("Retirada: " + cantidad + "€");

            if (saldo < 0) {
                System.out.println("**AVISO: Saldo negativo**");
            }

            if (saldo > 3000) {
                System.out.println("**AVISO: Notificar a hacienda**");
            }
        } else {
            System.out.println("La cantidad no es válida o dejaría el saldo en negativo");
        }
    }

    private void anadirMovimiento(String movimiento){
        movimientos[contador++]=movimiento;
    }
    public void mostrarMovimientos() {
        System.out.println("\n**Movimientos:**");
        for (int i = 0; i < contador; i++) {
            System.out.println(movimientos[i]);
        }
    }
}
