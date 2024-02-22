package ejercicio3;

import java.time.LocalDateTime;

public class Oso implements Animal {    
    String tipoAnimal;
    LocalDateTime dateTime;

    @Override
    public void tipoAnimal(String tipoAnimal, LocalDateTime dateTime) {
        this.tipoAnimal = tipoAnimal;
        this.dateTime =dateTime;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El oso gruñe");
    }

    @Override
    public boolean irse() {
        return false;
    }

    @Override
    public boolean atacar() {
        return false;
    }
    
    public String toString(){
        return "Tipo: "+ tipoAnimal+"\nHora entrada: "+ dateTime;
    }
}
