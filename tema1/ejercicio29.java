import java.util.Random;
import java.util.Scanner;

public class ejercicio29 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        Random random = new Random();
        int secreto = random.nextInt(1000);

        for (int i = 0; i <=100; i++) {
            System.out.println("Dame un numero del 1 al 100 para averiguar el numero secreto:");
            int num = in.nextInt();
            if(secreto != num){
                if(secreto<num) {
                    System.out.println("EL numero secreto es menor que " + num);
                }else{
                    System.out.println("El numero secreto es mayor que " + num);
                }                
            }else{
                System.out.println("Woooohoooo Congratulations, eres un crack");
            }

        }
    }
}



