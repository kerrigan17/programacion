



package tema3.metodos;

public class clases {

    public static String invertirYMayusculas(String cadenaoriginal) {
        String resultado = "";
        String cadena = cadenaoriginal.toUpperCase();
        for(int i= cadena.length() -1; i>=0; i--){
            char character = cadena.charAt(i);
            resultado += Character.toUpperCase(character);

        }
        return resultado;
    }
    public static int numvocales(String cadena1){
        int resultado=0;
        String cadena = cadena1.toLowerCase();
        for(int i= 0; i<=cadena.length(); i++){
            if (cadena.charAt(i)=='e'||cadena.charAt(i)=='a'||cadena.charAt(i)=='i'||cadena.charAt(i)=='o'||cadena.charAt(i)=='u'){
                resultado ++;
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        String original = "Hola, mundo!";
        String invertir = invertirYMayusculas(original);

        System.out.println("Invertida y en mayúsculas:  " + invertir);

        int vocales = numvocales(original);
        System.out.println("Tienes " + vocales + " vocales");

    }
}
