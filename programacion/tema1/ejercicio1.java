import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Dame un numero y te doy el area y el perimetro: ");
        int lado = in.nextInt();
        int area = lado * lado;
        int perimetro = lado * 4;

        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);

    }
}
