import java.util.Scanner;

public class ejercicio11 {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dame tres numeros");
        double n1 = in.nextDouble();
        double n2 = in.nextDouble();        
        double n3 = in.nextDouble();
        if(n1 + 1 == n2 && n2 + 1 == n3){
            System.out.println("Son consecutivos");
        }else{
            System.out.println("No son consecutivos");
        }
    }
}