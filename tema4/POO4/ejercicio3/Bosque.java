package ejercicio3;

import java.util.List;
import java.util.Random;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class Bosque {
    private List<Animal> registroAnimales;
    Animal animal;

    public Bosque(){
        registroAnimales =new ArrayList<>();
    }

    public void llegadaAnimales(){
        Random random =new Random();
        int aleatorio = random.nextInt(5);
        LocalDateTime dateTime = LocalDateTime.now();
        switch (aleatorio) {
            case 1:  
                animal= new Buho();
                System.out.println(dateTime);
                break;
            case 2:
                System.out.println(dateTime);
                animal = new Ciervo();
                registroAnimales.add(animal);
                break;
            case 3:
                System.out.println(dateTime);
                animal =new Jabali();
                registroAnimales.add(animal);
                break;
            case 4:
                System.out.println(dateTime);
                animal = new Oso();
                registroAnimales.add(animal);
                break;
            case 5:
                System.out.println(dateTime);
                animal = new Lobo();
                registroAnimales.add(animal);
            default:
                break;
        }  
        animal.hacerSonido();
        registroAnimales.add(animal);

        
    }
    public void mostrarRegistros(){
    System.out.println("\nRegistro de animales en el bosque:");
        for(Animal animal : registroAnimales){
            System.out.println(animal);
        }
    }
}
