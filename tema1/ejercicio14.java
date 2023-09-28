import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("¿Cuántas personas?");
        int personas = in.nextInt();
        System.out.println("¿Cuántos días?");

        int dias = in.nextInt();
        int tar = personas * dias * 15;


        if (personas >= 5){
           double tarnew = tar * 0.75;
           System.out.println(tarnew);
        }else {
            System.out.println(tar);}

    }
}