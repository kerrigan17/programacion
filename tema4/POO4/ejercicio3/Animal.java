package ejercicio3;
import java.time.LocalDateTime;

interface Animal {
    void tipoAnimal(String tipoAnimal, LocalDateTime dateTime);
    void hacerSonido();
    boolean irse();
    boolean atacar();
}