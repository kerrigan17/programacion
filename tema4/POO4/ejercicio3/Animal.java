package ejercicio3;
import java.time.LocalDateTime;

interface Animal {
    public void tipoAnimal(String tipoAnimal, LocalDateTime dateTime);
    public void hacerSonido();
    public boolean irse();
    public boolean atacar();
}