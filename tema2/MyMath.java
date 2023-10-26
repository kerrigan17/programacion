public class MyMath {
    public static double squarePerimeter(double lado){
        if (lado < 0){
            return 0;

        }else {
            return lado*4;
        }
    }
    public static double squareArea(double base) {
        if (base<0){
            return 0;
        }else {
            return  base * base;
        }
    }
    public static double rectanglePerimeter(double base, double altura){
        if (base <= 0 || altura <=0){
            return 0;
        }else {
            return 2*base + 2*altura;
        }
    }
    public static double rectangleArea(double base, double altura ){
        if (base <=0 || altura<=0){
            return 0;
        }else {
            return  base * altura;
        }
    }
    public  static double circlePerimeter(double num){
        if (num<=0){
            return 0;
        }else {
            return 2*num*Math.PI;
        }
    }
    public static double circleArea(double radio){
        if (radio <=0){
            return 0;
        }else {
            return Math.PI * (radio*radio);
        }
    }
    public static boolean isPrime(int numero){
        if (numero <= 1) {
            return false;
        }else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    return false;
                }

            }
            return true;
        }
    }
    public static boolean isNotPrime(int numero){
        if (numero <= 1) {
            return true;
        }else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    return true;
                }

            }
            return false;
        }
    }
    public static int figureCount(int numero) {
        int cifras = 0;
        if (numero == 0) {
            cifras=1;
        } else {
            while (numero != 0) {
                cifras++;
                numero = numero / 10;
            }
        }
        return cifras;

    }
    public static int evenFigureCount(int numero) {
        int cifras =0;
        if (numero == 0) {
            cifras = 1;
        } else {
            while (numero != 0) {
                if (numero%2==0){
                    cifras++;
                }
                numero = numero / 10;
            }
        }
        return cifras;

    }
    public static int oddFigureCount(int numero){
        int cifras =0;
        numero = Math.abs(numero);
            while (numero != 0) {
                if (numero%2==1){
                    cifras++;
                }
                numero = numero / 10;
            }
        return cifras;

    }
    public static int factorial(int num){
        int fact = 1;
        if (num == -1){
            return 0;
        }else {
            for (int i = 1; i <= num; i++){
                    fact = fact * i;
            }
            return fact;
        }
    }
    public static int factorialRecursive(int num){
        int fact = 1;
        if (num == -1){
            return 0;
        }else {
            for (int i = 1; i <= num; i++){
                fact = fact * i;
            }
            return fact;
        }
    }

    public static int quadraticEcuationSolutions(int num1, int num2, int num3){
        int ecuation = num2*2 - 4*num1*num3;
        if (ecuation == 0 ){
            return 1;
        }if (ecuation > 0){
            return 2;
        }else {
            return 0;
        }
    }
    public static int figuresSumatory(int num){
        int suma= 0;
    }

}
