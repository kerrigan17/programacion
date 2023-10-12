import java.util.Random;
import java.util.Scanner;

public class combate {
    public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            Random rand = new Random();                 

            int velocidad1 = 0;
            int ataque1 = 0;
            int defensa1 = 0;
            int critico1 = 0;
            int regener1 = 0;
            int vida1 = 500;

            int velocidad2 = 0;
            int ataque2 = 0;
            int defensa2 = 0;
            int critico2 = 0;
            int regener2 = 0;
            int vida2 = 500;


            boolean personver1 =false;
            boolean personver2 =false;
            
            while(personver1==false){
                System.out.println("En breves empezara el combate");
                System.out.println("Primero, escoge el PERSONAJE 1 poniendo el numero: ");
                System.out.println("1. Tigre de Hierro");
                System.out.println("2. Sombra Agil");
                System.out.println("3. Guerrero de Piedra");
                System.out.println("4. Mago ");
                String personaje1 = in.nextLine();            
                switch(personaje1) {
                case "1":
                    critico1=160;
                    ataque1=80;
                    defensa1=80;
                    velocidad1=10;
                    regener1=150;
                    personver1=true;
                    break;
                case "2":
                    critico1=100;
                    ataque1=80;
                    defensa1=80;
                    velocidad1=150;
                    regener1=150;
                    personver1=true;
                    break;
                case "3":
                    critico1=160;
                    ataque1=150;
                    defensa1=80;
                    velocidad1=50;
                    regener1=60;
                    personver1=true;
                    break;
                case "4":
                    critico1=160;
                    ataque1=80;
                    defensa1=180;
                    velocidad1=10;
                    regener1=150;
                    personver1=true;
                    break;
                default:
                    System.out.println("Escribe 1,2,3 o 4 segun el personaje que quieras");
                    break;
                }
            }
            
            if (personver2==false) {
                System.out.println("Ahora, escoge el PERSONAJE 2 poniendo el numero: ");
                System.out.println("1. Tigre de Hierro");
                System.out.println("2. Sombra Agil");
                System.out.println("3. Guerrero de Piedra");
                System.out.println("4. Mago ");
                String personaje2 = in.nextLine();

                switch(personaje2) {
                    case "1":
                    critico2=160;
                    ataque2=80;
                    defensa2=80;
                    velocidad2=10;
                    regener2 = 150;
                    personver2=true;
                break;
                case "2":
                    critico2=160;
                    ataque1=80;
                    defensa1=80;
                    velocidad1=10;
                    regener1=150;
                    personver2=true;
                    break;
                case "3":
                    critico2=160;
                    ataque1=80;
                    defensa1=80;
                    velocidad1=10;
                    regener1=150;
                    personver2=true;
                    break;
                case "4":
                    critico2=160;
                    ataque1=80;
                    defensa1=80;
                    velocidad1=10;
                    regener1=150;
                    personver2=true;
                    break;
                default:
                    System.out.println("Escribe 1,2,3 o 4 segun el personaje que quieras");
                    break;
                }
            }
            char ar = in.next().charAt(0);
            Random random = new Random();
            int aleatorio = random.nextInt(8);
            
            if (velocidad1 > velocidad2) {
                System.out.println("JUGADOR 1, empiezas la partida");                
                System.out.println("Quieres atacar, escribe 'a', si quieres regenerarte, escribe 'r', si quieres lanza un critico, escribe 'c'");
                if (ar == 'a'){
                    int batalla1 = ataque1*aleatorio - defensa2*aleatorio;
                }if (ar == 'r'){
                    int regeneracion = vida1 + (2*regener1/3);
                }else{
                    System.out.println("Dame 'a' para atacar o 'r' para regenerarte");
                }

            }else{
                System.out.println("JUGADOR 2, empiezas la partida");
                System.out.println("Quieres atacar, escribe 'a', si quieres regenerarte, escribe 'r', si quieres lanzar un critico escribe 'c'");
                if (ar == 'a'){
                    int batalla2 = ataque2*aleatorio - defensa1*aleatorio ;
                    
                }if (ar == 'r'){
                    int regeneracion = vida2 + (2*regener2/3);

                }if(ar == 'c'){
                    int ctitico = critico1;
                }else{
                    System.out.println("Dame 'a' para atacar o 'r' para regenerarte");
                }
            }
    }
}

