package Herencia.Ejercicio5;

public class PublicacionTexto implements Publicacion {
    private String contenido;

    public PublicacionTexto(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public void publicar() {
        System.out.println("Publicando texto: " + contenido);
    }

    @Override
    public void compartir() {
        System.out.println("Compartiendo texto: " + contenido);
    }
}