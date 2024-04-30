package Colecciones2.ejercicio1;

public class Serpiente extends AvistamientoAnimal {
    private double longitud;

    public Serpiente(int horaDelDia, String especie, double longitud) {
        super(horaDelDia, especie);
        this.longitud = longitud;
    }

    public double getLongitud() {
        return longitud;
    }

    @Override
    public String toString() {
        return toString() + ", Longitud: " + longitud + " metros";
    }
}
