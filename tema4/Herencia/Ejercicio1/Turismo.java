public class Turismo extends Vehiculo {
    protected int numPlazas;
    protected String tipoUso;

    public Turismo(int ruedas, String color, String marca, int numPlazas, String tipoUso) {
        super(ruedas, color, marca);
        this.numPlazas = numPlazas;
        this.tipoUso = tipoUso;
    }
}