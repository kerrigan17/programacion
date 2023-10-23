public class ejercicio6 {


    public static void main(String[] args){
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
}
