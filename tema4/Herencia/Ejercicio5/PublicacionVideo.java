package Herencia.Ejercicio5;

public class PublicacionVideo implements Publicacion, AbrirPublicacion, Publicacionconreaccion {
    private String rutaVideo;
    private String comentario;

    public PublicacionVideo(String rutaVideo) {
        this.rutaVideo = rutaVideo;
        this.comentario=rutaVideo;
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
    public void comentar(){
        System.out.println("Comentario"+comentario);
    }

    @Override
    public void darLike() {
        System.out.println("Ha dado Like al video");
    }
}
