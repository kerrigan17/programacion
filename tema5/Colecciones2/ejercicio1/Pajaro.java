package Colecciones2.ejercicio1;

public class Pajaro extends AvistamientoAnimal {
    private double peso;

    public Pajaro(int horaDelDia, String especie, double peso) {
        super(horaDelDia, especie);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return super.toString() + ", Peso: " + peso + " gramos";
    }
}

