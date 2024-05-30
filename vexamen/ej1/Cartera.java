package vexamen.ej1;

import java.util.ArrayList;
import java.util.List;

public class Cartera {
    private List<Dinero> contenido;

    public Cartera() {
        this.contenido = new ArrayList<>();
    }

    public boolean añadirDinero(Dinero dinero) {
        if (contenido.size() < 10) {
            contenido.add(dinero);
            return true;
        }
        return false;
    }

    public double disponible() {
        double total = 0;
        for (Dinero dinero : contenido) {
            total += dinero.valor();
        }
        return total;
    }

    @Override
    public String toString() {
        String resultado = "Valor total de la cartera: " + disponible() + " €\n";
        for (Dinero dinero : contenido) {
            resultado += dinero.toString() + "\n";
        }
        return resultado;
    }

    public boolean sacarDinero(double cantidad) {
        if (cantidad > disponible()) {
            return false;
        }

        double restante = cantidad;
        List<Dinero> aEliminar = new ArrayList<>();

        // Primero intenta usar billetes
        for (Dinero dinero : contenido) {
            if (dinero instanceof Billete) {
                if (dinero.valor() <= restante) {
                    restante -= dinero.valor();
                    aEliminar.add(dinero);
                }
            }
        }
        contenido.removeAll(aEliminar);
        aEliminar.clear();

        // Luego intenta usar el saldo de las tarjetas
        for (Dinero dinero : contenido) {
            if (dinero instanceof Tarjeta) {
                Tarjeta tarjeta = (Tarjeta) dinero;
                if (tarjeta.getSaldo() >= restante) {
                    tarjeta.setSaldo(tarjeta.getSaldo() - restante);
                    return true;
                } else {
                    restante -= tarjeta.getSaldo();
                    tarjeta.setSaldo(0);
                }
            }
        }

        // Finalmente, intenta usar el crédito de las tarjetas
        for (Dinero dinero : contenido) {
            if (dinero instanceof Tarjeta) {
                Tarjeta tarjeta = (Tarjeta) dinero;
                if (tarjeta.getCredito() >= restante) {
                    tarjeta.setCredito(tarjeta.getCredito() - restante);
                    return true;
                } else {
                    restante -= tarjeta.getCredito();
                    tarjeta.setCredito(0);
                }
            }
        }

        return restante == 0;
    }

    public static void main(String[] args) {
        Cartera cartera = new Cartera();

        Billete billete1 = new Billete(20);
        Billete billete2 = new Billete(50);
        Tarjeta tarjeta1 = new Tarjeta("123456789", 100, 50);
        Tarjeta tarjeta2 = new Tarjeta("987654321", 200, 100);

        cartera.añadirDinero(billete1);
        cartera.añadirDinero(billete2);
        cartera.añadirDinero(tarjeta1);
        cartera.añadirDinero(tarjeta2);

        System.out.println(cartera);

        boolean exito = cartera.sacarDinero(70);
        System.out.println("¿Se pudo sacar el dinero? " + exito);

        System.out.println(cartera);
    }
}
