package Herencia.Ejercicio5;

public class Main {
    public static void main(String[] args) {
        System.out.println("****  TEXTO  ****");
        Publicacion texto = new PublicacionTexto("Hola, que tal? Vamos a probar el texto");
        Publicacionconreaccion reaccionTexto =new PublicacionTexto("Comentario realizado con exito");
        texto.publicar();
        texto.compartir();
        reaccionTexto.comentar();
        reaccionTexto.darLike();

        System.out.println("\n****  VIDEO  ****");
        Publicacion video = new PublicacionVideo("Ahora probamos video.");
        AbrirPublicacion videoPubli=new PublicacionVideo("Abriendo publicacion");
        PublicacionVideo reaccion = new PublicacionVideo("Hola");
        videoPubli.abrir();
        video.publicar();
        reaccion.comentar();
        reaccion.darLike();

        System.out.println("\n****  FOTO  ****");
        Publicacion foto = new PublicacionTexto("Probando foto, probando");
        Publicacionconreaccion reaccionFoto =new PublicacionFoto("Publicacion con exito");
        foto.compartir();
        foto.publicar();
        reaccionFoto.comentar();
        reaccionFoto.darLike();
    }
}
