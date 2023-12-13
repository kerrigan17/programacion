
import java.util.Scanner;

public class ev2021 {
    static Scanner in = new Scanner(System.in);

    public static void showMenu(){
        System.out.println("Elija una de las tres opciones:");
        System.out.println("a. Aprobados y suspendidos.");
        System.out.println("b. Billetes a Madrid");
        System.out.println("c. Salir.");
    }
    public static int aprobados (){
        System.out.println("Dame el numero de alumnos");
        int alumnos = in.nextInt();
        int count =0;
        int [] notas = new int[alumnos];
        for(int i=0; i < notas.length; i ++){
            System.out.println("Nota alumno " +(i+1)+ ":");
            notas[i]= in.nextInt();
            if(notas[i]>=0&&notas[i]<=10){
                if(notas[i]>=5){
                    count ++;
                }
            }else{
                System.out.println("Ingrese una nota entre el 0 y el 10. Este alumno ya no cuenta.");
            }
        }
        System.out.println("Han aprobado " + count + " alumnos.");

        return count;
    }
    public static double billetes (){
        double precio = 32;
        double preciofinal = 0;
        
        System.out.println("Cantidad de billetes que desea comprar");
        int cantbilletes = in.nextInt();
        int [] edad = new int[cantbilletes];
        for(int i=1; i<=edad.length; i++){
            System.out.println("Pasajero "+ (i+1) +":");
            edad[i]=in.nextInt();
            if (edad[i] >= 0 && edad[i] <= 120) {
                if (edad[i] >= 65) {
                    precio *= 0.90;
                } else if (edad[i] >= 12 && edad[i] <= 15) {
                    precio *= 0.92;
                } else if (edad[i] >= 4 && edad[i] <= 11) {
                    precio *= 0.65;
                } else if (edad[i] < 4) {
                    precio = 0;
                }
                preciofinal += precio;
            } else {
                System.out.println("Edad no válida. Ingrese una edad entre 0 y 120.");
                i--;
            }
            
        }
        return preciofinal;
    }

    public static void main (String[] args){
        boolean exit = true;
        showMenu();
        char eleccion = in.next().charAt(0);
        while(exit){
            switch(eleccion){
                case 'a':
                    aprobados();
                    exit = false;
                    break;
                case 'b':
                    double total = billetes();
                    System.out.println("Precio total: " + total);
                    exit = false;
                    break;
                case 'c': 
                    exit = false;
                    break;                
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    showMenu();
                    eleccion = in.next().charAt(0);                    
                    break;
            }
        }
    }
    
}
