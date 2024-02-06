package POO2;

public class Cuenta {

    private int numeroCuenta;
    private double saldoDisponible;

    public Cuenta(int numeroCuenta, double saldoDisponible) {
        this.numeroCuenta = numeroCuenta;
        this.saldoDisponible = saldoDisponible;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public void realizarAbono(double abono) {
        saldoDisponible += abono;
        System.out.println("Se ha realizado un abono de " + abono + "€ a la cuenta " + numeroCuenta);
        System.out.println("Saldo disponible: " + saldoDisponible + "€");
    }

    public void pagarRecibo(double importe) {
        if (saldoDisponible >= importe) {
            saldoDisponible -= importe;
            System.out.println("Se ha pagado un recibo de " + importe + "€ de la cuenta " + numeroCuenta);
            System.out.println("Saldo disponible: " + saldoDisponible + "€");
        } else {
            System.out.println("Saldo insuficiente en la cuenta " + numeroCuenta + ".");
        }
    }

    @Override
    public String toString() {
        return "Cuenta: " + numeroCuenta + "\nSaldo disponible: " + saldoDisponible + "€";
    }
}
