package vexamen.ej1;

public class Main {
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

