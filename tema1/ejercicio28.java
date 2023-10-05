import java.util.Scanner;

public class ejercicio28 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Dame un numero:");
        int num1 = in.nextInt();
        System.out.println("Dame otro numero, no has acertado:");
        int num2 = in.nextInt();
        System.out.println("Dame otro numero, no has acertado:");
        int num3 = in.nextInt();
        System.out.println("Dame otro numero, no has acertado:");
        int num4 = in.nextInt();
        System.out.println("Dame otro numero, no has acertado:");
        int num5 = in.nextInt();

        int random = (int)Math.floor(Math.random()*1000000+1);
        System.out.println(random);

        }
}



