package ejercicio3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Bosque bosque = new Bosque();
    
        for(int i=0; i<15; i++){
            bosque.llegadaAnimales();
            Thread.sleep(1000); 
        }

        bosque.mostrarRegistros();        
    }
}