public class MyMath {

    public static double squarePerimeter(double lado){
        double resultado = 0;
        if (lado < 0){
            resultado = 0;

        }else {
            resultado = lado*4;
        }
        return resultado;
    }
    public static double squareArea(double base) {
        double resultado = 0;
        if (base<0){
            resultado = 0;
        }else {
            resultado = base * base;
        }
        return resultado;
    }
    public static double rectanglePerimeter(double base, double altura){
        double resultado = 0;
        if (base <= 0 || altura <=0){
            resultado = 0;
        }else {
            resultado = 2*base + 2*altura;
        }
        return resultado;
    }
    public static double rectangleArea(double base, double altura ){
        double resultado = 0;
        if (base <=0 || altura<=0){
            resultado  = 0;
        }else {
            resultado =  base * altura;
        }
        return resultado;
    }
    public  static double circlePerimeter(double num){
        double resultado = 0;
        if (num<=0){
            resultado = 0;
        }else {
            resultado = 2*num*Math.PI;
        }
        return resultado;
    }
    public static double circleArea(double radio){
        double resultado = 0;
        if (radio <=0){
            resultado = 0;
        }else {
            resultado= Math.PI * (radio*radio);
        }
        return resultado;
    }
    public static boolean isPrime(int numero){
        boolean resultado;
        if (numero <= 1) {
            resultado = false;
        }else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    resultado = false;
                }

            }
            resultado = true;
        }
        return resultado;
    }
    public static boolean isNotPrime(int numero){
        return !isPrime(numero);
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

        // return totaldigitos - pares
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
        int resultado = 0;
        int fact = 1;
        if (num < 0){
            resultado = 0;
        }else {
            for (int i = 1; i <= num; i++){
                    fact = fact * i;
            }
            resultado = fact;
        }
        return resultado;
    }
    public static int factorialRecursive(int num){
        return factorial(num);
    }

    public static int quadraticEcuationSolutions(int num1, int num2, int num3){
        int resultado = 0;
        int discriminant = num2*2 - 4*num1*num3;
        if (discriminant == 0 ){
            resultado = 1;
        }else if (discriminant > 0){
            resultado = 2;
        }else {
            resultado = 0;
        }
        return resultado;
    }
    public static int figuresSumatory(int numero){
        int suma= 0;
        numero = Math.abs(numero);
        while (numero != 0) {
            suma += numero % 10;
            numero /= 10;
        }

        return suma;
    }


}
