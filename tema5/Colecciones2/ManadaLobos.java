package Colecciones2;


public class ManadaLobos extends AvistamientoAnimal {
    private int numeroDeLobos;
    private String observaciones;

    public ManadaLobos(int horaDelDia, String especie, int numeroDeLobos, String observaciones) {
        super(horaDelDia, especie);
        this.numeroDeLobos = numeroDeLobos;
        this.observaciones = observaciones;
    }

    public int getNumeroDeLobos() {
        return numeroDeLobos;
    }

    public String getObservaciones() {
        return observaciones;
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de lobos: " + numeroDeLobos + ", Observaciones: " + observaciones;
    }
}
