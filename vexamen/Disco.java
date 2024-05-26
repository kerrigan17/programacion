package vexamen;

class Disco {
    private String titulo;
    private int anio;
    private int numeroCanciones;

    public Disco(String titulo, int anio, int numeroCanciones) {
        this.titulo = titulo;
        this.anio = anio;
        this.numeroCanciones = numeroCanciones;
    }

    public int getNumeroCanciones() {
        return numeroCanciones;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Año: " + anio + ", Número de canciones: " + numeroCanciones;
    }
}
