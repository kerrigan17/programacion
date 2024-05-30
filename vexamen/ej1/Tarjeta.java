package vexamen.ej1;

public class Tarjeta implements Dinero {
    private String numero;
    private double saldo;
    private double credito;

    public Tarjeta(String numero, double saldo, double credito) {
        this.numero = numero;
        this.saldo = saldo;
        this.credito = credito;
    }

    @Override
    public double valor() {
        return saldo + credito;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "Tarjeta: " + numero + ", Saldo: " + saldo + " €, Crédito: " + credito + " €";
    }
}
