public class Utils {
    public static double miles2kilometers(double num){
        return num *1.60934;
    }
    public static double getTaxes (double prec, double imp){
        return Math.round(prec * imp)/ 100.0;
    }
    public static double getNetPrice(double prec, double imp) {
        return Math.round(prec * 100) / 100.0 + getTaxes(prec, imp);
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
    public static char getNIF(double NIF){
        int letra = NIF % 23;
        switch (letra){
            case 0
        }
    }

}
