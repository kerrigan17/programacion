public class Utils {
    public static double miles2kilometers(double num){
        return num *1.60934;
    }
    public static double getTaxes (double prec, double imp){
        return Math.round(prec * imp)/ 100.0;
    }
    public static double getNetPrice(double precio, double imp) {
        return Math.round(precio * 100) / 100.0 + getTaxes(precio, imp);
    }
    public static int getCoins(double euros){
        int monedas = 0;
        while(euros>0) {
            if (euros >= 2) {
                euros -= 2;
                monedas += 10000000;
            }else if (euros>=1){
                euros -=1;
                monedas += 1000000;
            }else if (euros>=0.50){
                euros -= 0.5;
                monedas += 100000;
            }else if (euros>=0.20){
                euros -= 0.2;
                monedas += 10000;
            }else if (euros>=0.10){
                euros -= 0.1;
                monedas += 1000;
            }else if (euros>=0.05){
                euros -=0.05;
                monedas+= 100;
            }else if (euros>=0.02){
                euros -=0.02;
                monedas += 10;
            }else {
                if (euros>=0.009) {
                    euros -= 0.01;
                    monedas += 1;
                }else {
                    break;
                }
            }
        }
        return monedas;
    }
    public static char getNIF(int num){
        int letra = num % 23;
        return switch (letra) {
            case 0 -> 'T';
            case 1 -> 'R';
            case 2 -> 'W';
            case 3 -> 'A';
            case 4 -> 'G';
            case 5 -> 'M';
            case 6 -> 'Y';
            case 7 -> 'F';
            case 8 -> 'P';
            case 9 -> 'D';
            case 10 -> 'X';
            case 11 -> 'B';
            case 12 -> 'N';
            case 13 -> 'J';
            case 14 -> 'Z';
            case 15 -> 'S';
            case 16 -> 'Q';
            case 17 -> 'V';
            case 18 -> 'H';
            case 19 -> 'L';
            case 20 -> 'C';
            case 21 -> 'K';
            case 22 -> 'E';
            default -> 0;
        };
    }
    public static boolean isValidNIF(int number, char letter){
        boolean verify = false;
        char calculateNif= getNIF(number);
        letter = Character.toUpperCase(letter);
        if (calculateNif == letter){
            verify =true;
        }else verify = false;
        return verify;
    }


}
