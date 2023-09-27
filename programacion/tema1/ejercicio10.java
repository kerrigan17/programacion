import java.util.Scanner;

public class ejercicio10 {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dame tres numeros");
        double n1 = in.nextDouble();
        double n2 = in.nextDouble();        
        double n3 = in.nextDouble();
        if(n1 < n2 && n2 < n3){
            System.out.println("Estan ordenados de menor a mayor");
        }else{
            System.out.println("No estan ordenados de menor a mayor");
        }
    }
}