package vexamen.ej1;


public class Billete implements Dinero {
    private int valor;

    public Billete(int valor) {
        this.valor = valor;
    }

    @Override
    public double valor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Billete: " + valor + " €";
    }
}
