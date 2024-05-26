package vexamen;

import java.util.ArrayList;
import java.util.List;

abstract class Artista {
    protected String nombre;
    protected int anio;
    protected String tipoMusica;
    protected List<Disco> discos;

    public Artista(String nombre, int anio, String tipoMusica) {
        this.nombre = nombre;
        this.anio = anio;
        this.tipoMusica = tipoMusica;
        this.discos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarDisco(Disco disco) {
        discos.add(disco);
    }

    public int obtenerNumeroTotalCanciones() {
        int totalCanciones = 0;
        for (Disco disco : discos) {
            totalCanciones += disco.getNumeroCanciones();
        }
        return totalCanciones;
    }

    public int obtenerNumeroDiscos() {
        return discos.size();
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Año: " + anio + ", Tipo de Música: " + tipoMusica + ", Número de discos: " + obtenerNumeroDiscos() + ", Total de canciones: " + obtenerNumeroTotalCanciones();
    }
}
