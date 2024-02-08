public class Ciclomotor extends Vehiculo {
    protected int cilindrada;

    public Ciclomotor(int ruedas, String color, String marca, int cilindrada) {
        super(ruedas, color, marca);
        this.cilindrada = cilindrada;
    }

    public boolean necesitaCarnet() {
        return cilindrada >= 125;
    }
}
