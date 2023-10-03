
public class ejercicio21 {
    public static void main(String[] args) {
        int suma = 0;

        for(int i = 0; i<=1000; i++){
            if (i%2==0){
                suma += i;
                System.out.println("La suma de los numeros es: " + suma);
            }
        }

    }

}