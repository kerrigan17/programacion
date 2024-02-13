package Herencia.Ejercicio5;

public class PublicacionFoto implements Publicacion, AbrirPublicacion, Publicacionconreaccion {
    private String rutaFoto;
    private String comentario;

    public PublicacionFoto(String rutaFoto) {
        this.rutaFoto = rutaFoto;
        this.comentario=rutaFoto;

    }

    @Override
    public void publicar() {
        System.out.println("Publicando foto: " + rutaFoto);
    }

    @Override
    public void compartir() {
        System.out.println("Compartiendo foto: " + rutaFoto);
    }

    @Override
    public void abrir() {
        System.out.println("Abriendo foto: " + rutaFoto);
    }

    public void comentar(){
        System.out.println("Comentario"+comentario);
    }

    @Override
    public void darLike() {
        System.out.println("Ha dado like a la foto");
    }
}