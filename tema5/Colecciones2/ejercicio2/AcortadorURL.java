package Colecciones2.ejercicio2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class AcortadorURL {
    private Map<String, String> urlDiccionario;

    public AcortadorURL() {
        this.urlDiccionario = new HashMap<>();
    }

    public String crearRegistro(String url) {
        String clave = generarClave();
        urlDiccionario.put(clave, url);
        return clave;
    }

    public String resolverDireccion(String clave) {
        if (urlDiccionario.containsKey(clave)) {
            return urlDiccionario.get(clave);
        } else {
            return "La clave no existe";
        }
    }

    public String borrarRegistro(String clave) {
        if (urlDiccionario.containsKey(clave)) {
            urlDiccionario.remove(clave);
            return "Registro borrado";
        } else {
            return "La clave no existe";
        }
    }

    public Map<String, String> mostrarRegistros() {
        return urlDiccionario;
    }

    private String generarClave() {
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder claveBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            int index = random.nextInt(caracteres.length());
            claveBuilder.append(caracteres.charAt(index));
        }
        return claveBuilder.toString();
    }

    public static void main(String[] args) {
        AcortadorURL acortador = new AcortadorURL();

        String clave = acortador.crearRegistro("https://es.wikipedia.org/wiki/Wikipedia");
        System.out.println("Clave generada: " + clave);

        String direccion = acortador.resolverDireccion(clave);
        System.out.println("URL resuelta: " + direccion);

        Map<String, String> registros = acortador.mostrarRegistros();
        System.out.println("Registros: " + registros);

        System.out.println(acortador.borrarRegistro(clave));

        registros = acortador.mostrarRegistros();
        System.out.println("Registros después de borrar: " + registros);
    }
}
