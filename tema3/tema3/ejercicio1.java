package tema3;
public class ejercicio1 {

    static int [] array = new int[10];

    public static void imprimirArray(){
        for (int i=0; i <=9; i++){
            System.out.println(array[i]);
        }
    }
    public static void main (String[] args){
        array  = new int[]{0,2,4,6,8,10,12,14,16,18};
        int num = 0;
        for (int i= 1; i<=9; i++){
            array[i] = num +=3;
        }
        imprimirArray();
    }
    public static int [] maxnumber (){

    }
}
