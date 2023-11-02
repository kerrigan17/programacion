public class Utils {
    public static double miles2kilometers(double num){
        return num *1.60934;
    }
    public static double getTaxes (double prec, double imp){
        return Math.round(prec * imp)/ 100.0;
    }
    public static double getNetPrice(double prec, double imp){
        return prec+(Math.round((prec * imp /100) * 100)/ 100.0);
    }

}
