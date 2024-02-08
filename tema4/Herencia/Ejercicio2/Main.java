package Herencia.Ejercicio2;

public class Main {
    public static void main(String[] args) {        
        System.out.println("PERRO");
        Perro perro= new Perro();
        perro.hacerRuido();
        perro.dormir();
        perro.comer();

        System.out.println("\nGATO");
        Gato gato = new Gato();
        gato.hacerRuido();
        gato.dormir();
        gato.comer();
        
        System.out.println("\nHUMANO");
        Humano humano = new Humano();
        humano.hacerRuido();
        humano.dormir();
        humano.comer();
    }   
}
