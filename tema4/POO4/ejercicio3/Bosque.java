package ejercicio3;

import java.util.List;
import java.util.Random;
import java.time.LocalDateTime;
import java.util.ArrayList;


class Bosque {
    private final List<Animal> registroAnimales;

    public Bosque(){
        registroAnimales = new ArrayList<>();
    }

    public void llegadaAnimales(){
        Random random = new Random();
        int aleatorio = random.nextInt(6); 
        LocalDateTime dateTime = LocalDateTime.now();
        Animal animal;
        switch (aleatorio) {
            case 1:
                animal = new Buho();
                break;
            case 2:
                animal = new Ciervo();
                break;
            case 3:
                animal = new Jabali();
                break;
            case 4:
                animal = new Oso();
                break;
            case 5:
                animal = new Lobo();
                break;
            default:
                animal = null;
                break;
        }
        if (animal != null) {
            animal.hacerSonido();
            registroAnimales.add(animal);
        }
    }

    public void mostrarRegistros(){
        System.out.println("\nRegistro de animales en el bosque:");
        for(Animal animal : registroAnimales){
            System.out.println(animal);
        }
    }
}
