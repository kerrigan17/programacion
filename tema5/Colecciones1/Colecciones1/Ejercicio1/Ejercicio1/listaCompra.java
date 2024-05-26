package Colecciones1.Ejercicio1.Ejercicio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class listaCompra {
    static Scanner in = new Scanner(System.in);

    public static void showMenu(){
        System.out.println("1. Añadir ítem");
        System.out.println("2. Salir de la lista");
    }

    public static void main(String[] args) {
        Set<String> ListaCompra = new HashSet<>();;
        boolean salir = false;
        while (!salir){
            showMenu();
            int numero = in.nextInt();
            switch (numero){
                case 1:
                    System.out.println("Dime el artículo que quieres añadir");
                    in.nextLine();
                    String articulo = in.nextLine();
                    if (ListaCompra.contains(articulo)){
                        System.out.println("Artículo ya seleccionado");
                    }else {
                        ListaCompra.add(articulo);
                    }

                    break;
                case 2:
                    salir = true;
                    break;
            }

        }
    }
}