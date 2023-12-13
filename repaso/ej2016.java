import java.util.Scanner;

public class ej2016 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        int days = 0;
        System.out.println("Dame un mes, en numero por favor!");
        System.out.println("Recuerda que van del 1 al 12");
        int month = in.nextInt();
        if (month>0 && month<=12){
            switch (month){
                case 1,3,5,7,8,10,12:
                    days = 31;
                    break;
                case 4,6,9,11:
                    days = 30;
                    break;
                case 2:
                    days = 28;
                    break;
            }
        }else {
            System.out.println("El mes no es valido.");
        }
        System.out.println("En el mes " + month + " hay " + days +" dias");
        System.out.println("Dime un dia del mes " + month);
        int dia = in.nextInt();
        if (dia>0 && dia<= days){
            System.out.println("Ahora dime las temperaturas en grados celsius:");
            System.out.println("Temperatura maxima: ");
            double  tempmax = in.nextDouble();
            if (tempmax>-20 && tempmax <45){
                System.out.println("Temperatura minima: ");
                double tempmin = in.nextDouble();
                if (tempmin>-20 && tempmin <45) {
                    double tempmed = (tempmax + tempmin)/2;
                    System.out.println("La temperatura media es: " + tempmed+ "ªC");
                }
            }
        }else {
            System.out.println("Dia el mes invalido.");
        }

    }
}
