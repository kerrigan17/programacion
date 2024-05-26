package vexamen;

class Grupo extends Artista {
    private int numeroComponentes;

    public Grupo(String nombre, int anio, String tipoMusica, int numeroComponentes) {
        super(nombre, anio, tipoMusica);
        this.numeroComponentes = numeroComponentes;
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de componentes: " + numeroComponentes;
    }
}
