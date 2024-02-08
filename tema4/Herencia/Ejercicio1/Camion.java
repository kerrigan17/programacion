public class Camion extends Vehiculo {
    protected double pesoMaximo;
    protected boolean mercanciaPeligrosa;

    public Camion(int ruedas, String color, String marca, double pesoMaximo, boolean mercanciaPeligrosa) {
        super(ruedas, color, marca);
        this.pesoMaximo = pesoMaximo;
        this.mercanciaPeligrosa = mercanciaPeligrosa;
    }
}