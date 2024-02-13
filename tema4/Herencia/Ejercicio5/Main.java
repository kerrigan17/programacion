package Herencia.Ejercicio5;

public class Main {
    public static void main(String[] args) {
        System.out.println("****  TEXTO  ****");
        Publicacion texto = new PublicacionTexto("Hola, que tal? Vamos a probar el texto");
        texto.publicar();
        texto.compartir();

        System.out.println("\n****  VIDEO  ****");
        Publicacion video = new PublicacionVideo("Ahora probamos video.");
        video.compartir();
        video.publicar();

        System.out.println("\n****  FOTO  ****");
        Publicacion foto = new PublicacionTexto("Probando foto, probando");
        foto.compartir();
        foto.publicar();
    }
}
