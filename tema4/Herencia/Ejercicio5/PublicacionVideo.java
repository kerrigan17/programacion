package Herencia.Ejercicio5;

public class PublicacionVideo implements Publicacion, AbrirPublicacion {
    private String rutaVideo;

    public PublicacionVideo(String rutaVideo) {
        this.rutaVideo = rutaVideo;
    }

    @Override
    public void publicar() {
        System.out.println("Publicando video: " + rutaVideo);
    }

    @Override
    public void compartir() {
        System.out.println("Compartiendo video: " + rutaVideo);
    }

    @Override
    public void abrir() {
        System.out.println("Abriendo video: " + rutaVideo);
    }
}
