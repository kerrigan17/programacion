import java.util.Scanner;

public class ejercicio7 {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dame un numero");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        if(n1 > n2){
            int suma1 = n1 - n2;
            System.out.println("Tu resta da " + suma1);
        }else{
            int  suma2 = n2 - n1;
            System.out.println("Tu resta da " + suma2);
        }
    }
}
