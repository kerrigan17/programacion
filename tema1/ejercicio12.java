import java.util.Scanner;

public class ejercicio12 {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dame tres numeros");
        int n1 = in.nextInt();
        int n2 = in.nextInt();        
        int n3 = in.nextInt();
        if(n1 < n2 && n1 < n3){
            if(n2 < n3){
            System.out.println("Numeros ordenados:");
            System.out.println(n1);
            System.out.println(n2);
            System.out.println(n3);
            }else{
            System.out.println("Numeros ordenados");
            System.out.println(n1);
            System.out.println(n3);
            System.out.println(n2);
            }
        }if (n2 < n1 && n2 < n3) {
            if(n1 < n3){
            System.out.println("Numeros ordenados");
            System.out.println(n2);
            System.out.println(n1);
            System.out.println(n3);
            } else{
            System.out.println("Numeros ordenados");
            System.out.println(n2);
            System.out.println(n3);
            System.out.println(n1);}          
        } else {
            if (n2 < n1){
            System.out.println("Numeros ordenados");
            System.out.println(n3);
            System.out.println(n2);
            System.out.println(n1);
            }else{
            System.out.println("Numeros ordenados");
            System.out.println(n3);
            System.out.println(n1);
            System.out.println(n2);
            }
            
        }
    }
}