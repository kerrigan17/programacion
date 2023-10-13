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
            
            while(!personver1){
                System.out.println("En breves empezara el combate");
                System.out.println("Primero, escoge el PERSONAJE 1 poniendo el numero: ");
                System.out.println("1. Tigre de Hierro");
                System.out.println("2. Sombra Agil");
                System.out.println("3. Guerrero de Piedra");
                System.out.println("4. Mago Vital");
                String personaje1 = in.nextLine();            
                switch(personaje1) {
                case "1":
                    vida1 = 100;
                    critico1=60;
                    ataque1=100;
                    defensa1=180;
                    velocidad1=10;
                    regener1=50;
                    personver1=true;
                    break;
                case "2":
                    vida1=100;
                    critico1=40;
                    ataque1=80;
                    defensa1=80;
                    velocidad1=100;
                    regener1=50;
                    personver1=true;
                    break;
                case "3":
                    vida1=100;
                    critico1=160;
                    ataque1=150;
                    defensa1=80;
                    velocidad1=50;
                    regener1=60;
                    personver1=true;
                    break;
                case "4":
                    vida1=100;
                    critico1=160;
                    ataque1=80;
                    defensa1=180;
                    velocidad1=10;
                    regener1=150;
                    personver1=true;
                    break;
                default:
                    System.out.println("ERROR");
                    break;
                }
            }
            
            if (!personver2) {
                System.out.println("Ahora, escoge el PERSONAJE 2 poniendo el numero: ");
                System.out.println("1. Tigre de Hierro");
                System.out.println("2. Sombra Agil");
                System.out.println("3. Guerrero de Piedra");
                System.out.println("4. Mago ");
                String personaje2 = in.nextLine();

                switch(personaje2) {
                    case "1":
                        vida2=100;
                        critico2=160;
                        ataque2=80;
                        defensa2=80;
                        velocidad2=10;
                        regener2 = 150;
                        personver2=true;
                        break;
                    case "2":
                        vida2=100;
                        critico2=160;
                        ataque1=80;
                        defensa1=80;
                        velocidad1=10;
                        regener1=150;
                        personver2=true;
                        break;
                    case "3":
                        vida2=100;
                        critico2=160;
                        ataque1=80;
                        defensa1=60;
                        velocidad1=10;
                        regener1=150;
                        personver2=true;
                        break;
                    case "4":
                        vida2=100;
                        critico2=160;
                        ataque1=80;
                        defensa1=80;
                        velocidad1=10;
                        regener1=50;
                        personver2=true;
                        break;
                    default:
                        System.out.println("ERROR");
                        break;
                }
            }

            Random random = new Random();
            int aleatorio = random.nextInt(8);
            int batalla = 0;
            int regeneracion = 0;

            if (velocidad1 > velocidad2) {
                System.out.println("JUGADOR 1, empiezas la partida");                
                System.out.println("Si quieres atacar, escribe 'a', si quieres regenerarte, escribe 'r', si quieres lanza un critico, escribe 'c'");
                char ar1 = in.next().charAt(0);
                if (ar1 == 'a'){
                    batalla = ataque1*aleatorio - defensa2*aleatorio;
                    System.out.println("JUGADOR 1 ataca y reduce la vida de JUGADOR 2 en" + batalla + "Y deja la vida de ");
                }if (ar1 == 'r'){
                    regeneracion = vida1 + (2*regener1/3);
                }if(ar1 == 'c'){
                    int ctitico1 = critico1;
                }else{
                    System.out.println("Dame 'a' para atacar, 'r' para regenerarte o 'c' si quieres lanzar un critico");
                }

            }else{
                System.out.println("JUGADOR 2, empiezas la partida");
                System.out.println("Si quieres atacar, escribe 'a', si quieres regenerarte, escribe 'r', si quieres lanzar un critico escribe 'c'");
                char ar2 = in.next().charAt(0);
                if (ar2 == 'a'){
                    int batalla = ataque2*aleatorio - defensa1*aleatorio ;
                    
                }if (ar2 == 'r'){
                    int regeneracioN = vida2 + (2*regener2/3);

                }if(ar2 == 'c'){
                    int ctitico = critico1;
                }else{
                    System.out.println("Si quieres atacar, escribe 'a', si quieres regenerarte, escribe 'r', si quieres lanzar un critico escribe 'c'");

                }
            }
    }
}

