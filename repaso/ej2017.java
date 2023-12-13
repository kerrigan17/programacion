
import java.util.Scanner;

public class ej2017 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Dame un anyo mayor que 0.");
        int year = in.nextInt();
        int month = 0;
        boolean salir = false;
        System.out.println("Dame un mes, tiene que ser del 1 al 12.");
        System.out.println("Si quieres salir presiona el 0");
        month = in.nextInt();        
        while(!salir){
                if(year>0){
                switch(month){
                    case 0:
                        salir=true;
                        break;
                    case 1:
                        System.out.println("Enero del " + year + " tiene 31 dias"); 
                        month = -1;
                        break;
                    case 2:
                        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                            int day = 29;
                            System.out.println("Febrero del " + year + " tiene " + day + " dias.");
                        }else{
                            int day = 28;
                            System.out.println("Febrero del " + year + " tiene " + day + " dias.");
                        }
                        month = -1;
                        break;
                    case 3:
                        System.out.println("Marzo del " + year + " tiene 31 dias");
                        month = -1;
                        break;
                    case 4:
                        System.out.println("Abril del " + year + " tiene 30 dias");
                        month = -1;
                        break;
                    case 5:
                        System.out.println("Mayo del " + year + " tiene 31 dias");
                        month = -1;
                        break;
                    case 6:
                        System.out.println("Junio del " + year + " tiene 30 dias");
                        month = -1;
                        break;
                    case 7:
                        month = -1;
                        System.out.println("Julio del " + year + " tiene 31 dias");
                        break;
                    case 8:
                        System.out.println("Agosto del " + year + " tiene 31 dias");
                        month = -1;
                        break;
                    case 9:
                        System.out.println("Septiembre del " + year + " tiene 30 dias");
                        month = -1;
                        break;
                    case 10:
                    System.out.println("Octubre del " + year + " tiene 31 dias");
                        month = -1;
                        break;
                    case 11:
                        System.out.println("Noviembre del " + year + " tiene 30 dias");
                        month = -1;
                        break;
                    case 12:
                    System.out.println("MDiciembre del " + year + " tiene 31 dias");
                        month = -1;
                        break;
                    default:
                        System.out.println("Dame un anyo.");
                        year = in.nextInt();
                        System.out.println("Dame un mes, del 1 al 12.");
                        month = in.nextInt();
                        break;
                    }
                }else{
                    System.out.println("-------ERROR-------");
                    System.out.println("Tienes que darme un anyo del 1 al infinito");
                    System.out.println("Dame un anyo.");
                    year = in.nextInt();
                }
            }        
    }
}