import java.util.Scanner;


public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir); {
            System.out.println("Menú Principal:");
            System.out.println("a) Muestra el signo de un número.");
            System.out.println("b) Indica si el usuario es mayor de edad o no.");
            System.out.println("c) Calcula el área y perímetro de un círculo.");
            System.out.println("d) Conversor de euros a dólares y de dólares a euros.");
            System.out.println("e) Mostrar tabla de multiplicar de un número.");
            System.out.println("f) Mostrar tablas de multiplicar del 1 al 10.");
            System.out.println("g) Comprobador de números primos.");
            System.out.println("h) Comprobador de fechas.");
            System.out.println("i) Dibujar triángulos.");
            System.out.println("x) Salir");

            System.out.print("Elige una opción: ");
            char opcion = sc.next().charAt(0);
            sc.nextLine();

            switch (opcion) {
                case 'a':
                    mostrarSigno();
                    break;
                case 'b':
                    verificarMayorEdad();
                    break;
                case 'c':
                    calcularAreaPerimetroCirculo();
                    break;
                case 'd':
                    conversorMoneda();
                    break;
                case 'e':
                    mostrarTablaMultiplicar();
                    break;
                case 'f':
                    mostrarTablasMultiplicar();
                    break;
                case 'g':
                    comprobarNumeroPrimo();
                    break;
                case 'h':
                    comprobarFecha();
                    break;
                case 'i':
                    dibujarTriangulos();
                    break;
                case 'x':
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Introduce una opción válida.");
                    break;
            }
        } 
    }
    
    public static void mostrarSigno() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero");
        double num = sc.nextDouble();
        if(num==0) {
            System.out.println("Tu numero es 0");
        }if(num>0){
            System.out.println("Tu numero es positivo");
        }else{
            System.out.println("Tu numero es negativo");
        }
    }

    public static void verificarMayorEdad() {
        Scanner in = new Scanner(System.in);
        System.out.println("Escribe tu edad, por favor");
        int edad = in.nextInt();
        if(edad>0 && edad<18) {
            System.out.println("Eres menor de edad");
        }if(edad>=18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("No puedes tener menos de 0 anyos");
        }
    }

    public static void calcularAreaPerimetroCirculo() {
        Scanner in = new Scanner(System.in);

        System.out.println("Dame un radio y te doy la superficie y el perimetro de un circulo:");
        double num = in.nextInt();
        if (num > 0){
            double pi = 3.14;
            double perimeter =2*num*pi;
            double area= pi * (num*num);
            System.out.println("El perimetro del circulo es: " + perimeter);
            System.out.println("El area del circulo es: " + area);
        }else {
            System.out.println("Introduce un numero positivo");

        }    
    }

    public static void conversorMoneda() {
        Scanner in = new Scanner(System.in);
        System.out.println("**** Conversor ****");
        System.out.println("1. Convertir de euros a dólares");
        System.out.println("2. Convertir de dólares a euros");
        System.out.println("Elige una opción: ");
        int choice = in.nextInt();
        
        if (choice == 1){
            System.out.println("Dame una cantidad de euros");
            double euros = in.nextDouble();
            double dollars = euro2dollar(euros);
            System.out.println("La conversion de " + euros + " euros son " + dollars +" dollares");
        }if (choice == 2){
            System.out.println("Dame una cantidad de dolares");
            double dollars = in.nextDouble();
            double euros = dollar2euro(dollars);
            System.out.println("La conversion de " + dollars + " dolares son " + euros +" dollares.");

        }else{
            System.out.println("Dame un numero");
        }
    }
    public static double euro2dollar(double euros){
        double cambio = 1.05;
        return euros * cambio;
    }

    public  static double dollar2euro(double num){
        double cambio = 1.05;
        return num * cambio;
    }

    public static void mostrarTablaMultiplicar() {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime un nnumero entero entre el 1 y el 10: ");
        int numero = in.nextInt();
        if (numero>0 && numero<10){
            tabla(numero);
        }
    }
    
    public static void mostrarTablasMultiplicar() {
        tablas();
    }
    public static void tabla(int numero) {
        for (int i = 0; i < 11; i++){
            System.out.print(numero + " x " + i + " = ");
            int resultado = numero * i;
            System.out.println(resultado);
        }
        numero++;
        
    }
    public static void tablas() {
        for (int i = 1; i<11; i++){
            System.out.println("Tabla del " + i + ":");
            tabla(i);
        }
    }

    public static void comprobarNumeroPrimo() {
        Scanner in  = new Scanner(System.in);
        while(true){
            System.out.println("Dame un numero y te digo si es primo o no.");
            System.out.println("Si quieres salir escribe un 0");
            int numero = in.nextInt();
            if(numero == 0){
                System.out.println("Has salido");
                break;
            }if(numero<0){
                System.out.println("Dame un numero positivo");
            }else{
                if(primo(numero) || numero == 1){
                    System.out.println(numero + " es un numero primo.");
                }else{
                    System.out.println(numero + " no es un numero primo.");
                }
            }
        }
    }
    public static boolean primo(int numero){
        if (numero <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    public static boolean fechaValida(int dia, int mes, int anio) {
        boolean esValido = true;
        
        if (anio < 1 || mes < 1 || mes > 12 || dia < 1) {
            esValido = false;
        } else {
            int maxDias = 0;

            if (mes == 2) {
                maxDias = esAnioBisiesto(anio) ? 29 : 28;
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                maxDias = 30;
            } else {
                maxDias = 31;
            }

            if (dia > maxDias) {
                esValido = false;
            }
        }
        
        return esValido;
    }

    public static boolean esAnioBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
    public static void comprobarFecha() {
        Scanner in = new Scanner(System.in);
        System.out.println("Dame un dia, un mes y un año te dire si es correcta o no.");
        System.out.println("Dame un dia:");
        int dia = in.nextInt();
        System.out.println("Dame un dia:");
        int mes = in.nextInt();
        System.out.println("Dame un año:");
        int anio = in.nextInt();
        if (fechaValida(dia, mes, anio)) {
            System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " es una fecha correcta.");
        } else {
            System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " no es una fecha correcta.");
        }
    }

    public static void dibujarTriangulos() {
        mostrarTriangulo('a', 4);
    }
    public static void mostrarTriangulo(char caracter, int numLineas) {
        for (int i = 1; i <= numLineas; i++) {
            for (int j = 1; j <= numLineas - i; j++) {
                System.out.print("  "); 
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(caracter);
            }
            System.out.println();  
        }
    }
}
