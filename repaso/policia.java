import java.util.Scanner;

public class policia {
    static Scanner in = new Scanner(System.in);
    static public void main(String[] args){
        System.out.println("¿Cuantas pistas tiene el preso?");
        int nPistas = in.nextInt();

        System.out.println("¿Que tipos de pista es? Dame 1,2 o 3.");
        System.out.println("1. 25 puntos ");
        System.out.println("2. 15 puntos ");
        System.out.println("3. 35 puntos ");

        int [] pistas = new int[nPistas+1];
        int puntosfinales = 0;
        for (int i = 1; i<=nPistas; i ++){
            pistas[i]= in.nextInt();
            if (pistas[i]>=1 && pistas[i]<=3){
                if (pistas[i]==1){
                    puntosfinales +=25;
                }if (pistas[i]==2){
                    puntosfinales +=15;
                }if (pistas[i]==3) {
                    puntosfinales += 35;
                }
            }
            System.out.println(puntosfinales);
        }

        if (puntosfinales>=85){
            System.out.println("El preso es culpable");
        }if (puntosfinales<85 && puntosfinales>=65){
            System.out.println("El preso es sospechoso de alto riesgo");
        }if (puntosfinales <65 && puntosfinales>=0){
            System.out.println("El preso es sospechoso de bajo riesgo");
        }
    }
}
