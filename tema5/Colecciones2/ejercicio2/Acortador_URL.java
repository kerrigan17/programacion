package Colecciones2.ejercicio2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class Acortador_URL {
    private Map<String, String> DiccionarioURL;

    public Acortador_URL(){
        this.DiccionarioURL= new HashMap<>();
    }


    public String crearRegistro(String url){
        String clave = generarClave();
        DiccionarioURL.put(clave,url);
        return clave;
    } 

    public String resolverDireccion(String clave){
        if(DiccionarioURL.containsKey(clave)){
            return DiccionarioURL.get(clave);
        }else{
            return "La clave no existe";
        }
    }

    public String borrarRegistros(String clave){
        if(DiccionarioURL.containsKey(clave)){
            DiccionarioURL.remove(clave);
            return "Usuario borrado con éxito";
        }else{
            return "La clave no existe";
        }
    }

    public Map<String, String> mostrarRegistros(){
        return DiccionarioURL;
    }
    
    private String generarClave(){
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder claveBuilder = new StringBuilder();
        Random random = new Random();
        for (int i=0; i<6;i++) {
            int index = random.nextInt(caracteres.length());
            claveBuilder.append(caracteres.charAt(index));
        }
        return claveBuilder.toString();
    }

    public static void main(String[] args) {
        Acortador_URL acortador = new Acortador_URL();

        boolean continuar = true;
        Random scanner;
        while (continuar) {
            System.out.println("\nMenú:");
            System.out.println("1. Añadir nuevo registro");
            System.out.println("2. Resolver direcció URL");
            System.out.println("3. Eliminar registros");
            System.out.println("4. ");
            System.out.println("5. Mostrar todos los avistamientos nocturnos");
            System.out.println("6. Mostrar todas las manadas de lobos");
            System.out.println("7. Mostrar todas las serpientes");
            System.out.println("8. Mostrar todos los pájaros");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        }

        scanner.close();
    }

}