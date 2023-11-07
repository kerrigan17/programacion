import java.util.Scanner;

public class ejercicioDiez {
    public static  void showMenu(){
        System.out.println("Pon un numero:");
        System.out.println("1. Calcular perimetro y area del cuadrado, rectangulo, circulo:");
        System.out.println("2. Numero primo o no:");
        System.out.println("3. Indicar numero de cifras:");
        System.out.println("4. Numero de digitos pares:");
        System.out.println("5. Numero de digitos impares:");
        System.out.println("6. Calcular factorial:");
        System.out.println("7. Calcular factoral recursivo:");
        System.out.println("8. Resolver ecuacion de segundo grado:");
        System.out.println("9. Sumar los digitos del numero entero:");


    }
    static Scanner in = new Scanner(System.in);
    public static void main (String[] args){
        int eleccion = in.nextInt();
        switch(eleccion){
            case 1:
                System.out.println("Dame un lado del cuadrado: ");
                int ladoSquare = in.nextInt();
                double resultSquarePerimeter = MyMath.squarePerimeter(ladoSquare);
                double resultSquareArea = MyMath.squareArea(ladoSquare);
                System.out.println("El perimetro del cuadrado es: " + resultSquarePerimeter);
                System.out.println("El area del cuadrado es: " + resultSquareArea);

                System.out.println("Dame el lado de un rectangulo: ");
                int ladoRectangle = in.nextInt();
                System.out.println("Dame la altura de un rectangulo");
                double alturaRectangle = in.nextInt();
                double resultPerRectangle = MyMath.rectanglePerimeter(ladoRectangle, alturaRectangle);
                double resultAreaRectangle = MyMath.rectangleArea(ladoRectangle, alturaRectangle);
                System.out.println("El perimetro del rectangulo es: " + resultPerRectangle);
                System.out.println("El area del rectangulo es: "+ resultAreaRectangle);

                System.out.println("Dame un radio: ");
                int radio = in.nextInt();
                double resultAreaCircle = MyMath.circlePerimeter(radio);
                double resultPerCircle = MyMath.circleArea(radio);
                System.out.println("El perimetro del circulo es: " + resultPerCircle);
                System.out.println("El area del circulo es: " + resultAreaCircle);
                break;
            case 2:
                System.out.println("Dame un numero y te digo si es primo");
                int numero = in.nextInt();
                boolean isPrimo = MyMath.isPrime(numero);
                if (isPrimo){
                    System.out.println("Tu numero es primo");
                }else {
                    System.out.println("Tu numero no es primo");
                }
                break;
            case 3:
                System.out.println("Dame un numero y te digo cuantas cifras tiene");
                int num = in.nextInt();
                int numCifras = MyMath.figureCount(num);
                System.out.println("El numero de cifras es: " + numCifras);
                break;
            case 4:
                System.out.println("Dame un numero y te digo cuantas cifras PARES tiene");
                int numer = in.nextInt();
                int numeroPares = MyMath.evenFigureCount(numer);
                System.out.println("Tu numero tiene: " + numeroPares + " numeros pares");
                break;
            case 5:
                System.out.println("Dame un numero y te digo cuantas cifras IMPARES tiene");
                int nume = in.nextInt();
                int numeroImpares = MyMath.oddFigureCount(nume);
                System.out.println("Tu numero tiene: " + numeroImpares + " numeros pares");
                break;
            case 6:
                System.out.println("Dame un numero y te doy su factorial");
                int numfact = in.nextInt();
                int factorial = MyMath.factorial(numfact);
                System.out.println("Tu numero en factorial da: " + factorial);
                break;
            case 7:
                System.out.println("Dame un numero y te doy su factorial recursivo");
                int numFact = in.nextInt();
                int factorialRecursivo = MyMath.factorial(numFact);
                System.out.println("Tu numero en factorial da: " + factorialRecursivo);
                break;
            case 8:
                System.out.println("Dame tres numeros: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                int num3 = in.nextInt();
                int solucion = MyMath.quadraticEcuationSolutions(num1, num2, num3);
                System.out.println("Tu solucion es: " + solucion);
                break;
            case 9:
                System.out.println("Dame un numero entero y te sumo sus numeros:");
                int numSuma = in.nextInt();
                int suma = MyMath.figuresSumatory(numSuma);
                System.out.println("El sumatorio de tus numeros es: " + suma);

        }
    }
}
