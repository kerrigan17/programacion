package vexamen;

class DJ extends Artista {
    private String seudonimo;

    public DJ(String nombre, String seudonimo, int anio, String tipoMusica) {
        super(nombre, anio, tipoMusica);
        this.seudonimo = seudonimo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Seudónimo: " + seudonimo;
    }
}
