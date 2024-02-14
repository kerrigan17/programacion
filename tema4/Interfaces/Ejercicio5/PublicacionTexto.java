package Interfaces.Ejercicio5;

public class PublicacionTexto implements Publicacion, Publicacionconreaccion {
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
    public void comentar(){
        System.out.println("Comentario: "+ contenido);
    }
    public void darLike(){
        System.out.println("Ha dado like a la publicacion de texto.");
    }
}