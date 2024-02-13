package Herencia.Ejercicio5;

public class PublicacionFoto implements Publicacion, AbrirPublicacion {
    private String rutaFoto;

    public PublicacionFoto(String rutaFoto) {
        this.rutaFoto = rutaFoto;
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
}