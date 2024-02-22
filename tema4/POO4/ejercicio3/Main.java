package ejercicio3;

public class Main {
    public static void main(String[] args) {
        Bosque bosque = new Bosque();
    
        for(int i=1; i<10; i++){
            bosque.llegadaAnimales();
        }

        bosque.mostrarRegistros();        
    }
}