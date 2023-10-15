import java.util.Random;
import java.util.Scanner;

public class combate {
    public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            Random rand = new Random();                 

            
            int velocidad1 = 0;
            int ataque1 = 0;
            int defensa1 = 0;
            int regener1 = 0;
            int vida1 = 500;

            int velocidad2 = 0;
            int ataque2 = 0;
            int defensa2 = 0;
            int regener2 = 0;
            int vida2 = 500;
            String personaje1 = "";
            String personaje2 = "";


            boolean personver1 =false;
            boolean personver2 =false;
            
            while(!personver1){
                System.out.println("En breves empezara el combate");
                System.out.println("Primero, escoge el PERSONAJE 1 poniendo el numero: ");
                System.out.println("1. Tigre de Hierro");
                System.out.println("2. Sombra Agil");
                System.out.println("3. Guerrero de Piedra");
<<<<<<< HEAD
                System.out.println("4. Mago maravilla");
                String numeroper = in.nextLine();            
                switch(numeroper) {
                case "1":
                    personaje1="Tigre de Hierro";
                    vida1 = 100;
                    ataque1=80;
                    defensa1=80;
=======
                System.out.println("4. Mago Vital");
                String personaje1 = in.nextLine();            
                switch(personaje1) {
                case "1":
                    vida1 = 100;
                    critico1=60;
                    ataque1=100;
                    defensa1=180;
>>>>>>> c3c31387a2eccc5f43bb346feee636da607a8515
                    velocidad1=10;
                    regener1=50;
                    personver1=true;
                    break;
                case "2":
<<<<<<< HEAD
                    vida1 = 100;
                    personaje1="Sombra Agil";
=======
                    vida1=100;
                    critico1=40;
>>>>>>> c3c31387a2eccc5f43bb346feee636da607a8515
                    ataque1=80;
                    defensa1=80;
                    velocidad1=100;
                    regener1=50;
                    personver1=true;
                    break;
                case "3":
<<<<<<< HEAD
                    vida1 = 100;
                    personaje1="Guerrero de Piedra";
=======
                    vida1=100;
                    critico1=160;
>>>>>>> c3c31387a2eccc5f43bb346feee636da607a8515
                    ataque1=150;
                    defensa1=80;
                    velocidad1=50;
                    regener1=60;
                    personver1=true;
                    break;
                case "4":
<<<<<<< HEAD
                    vida1 = 100;
                    personaje1="Mago maravilla";
=======
                    vida1=100;
                    critico1=160;
>>>>>>> c3c31387a2eccc5f43bb346feee636da607a8515
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
            System.out.println("JUGADOR 1, has elegido a: " + personaje2 );
            System.out.println("Vida: 100");
            System.out.println("Ataque: " + ataque1);
            System.out.println("Defensa: " + defensa1);
            System.out.println("Velocidad: " + velocidad1);
            System.out.println("Regeneracion: " + regener1);
            System.out.println(" ");
            
<<<<<<< HEAD
            while(personver2==false) {
=======
            if (!personver2) {
>>>>>>> c3c31387a2eccc5f43bb346feee636da607a8515
                System.out.println("Ahora, escoge el PERSONAJE 2 poniendo el numero: ");
                System.out.println("1. Tigre de Hierro");
                System.out.println("2. Sombra Agil");
                System.out.println("3. Guerrero de Piedra");
                System.out.println("4. Mago maravilla");
                String numeroper2 = in.nextLine();

                switch(numeroper2) {
                    case "1":
<<<<<<< HEAD
                    personaje2="Tigre de Hierro";
                    ataque2=80;
                    defensa2=80;
                    velocidad2=10;
                    regener2 = 150;
                    personver2=true;
                break;
                case "2":
                    personaje2="Sombra Agil";
                    ataque2=80;
                    defensa2=80;
                    velocidad2=10;
                    regener2=150;
                    personver2=true;
                    break;
                case "3":
                    personaje2="Guerrero de piedra";
                    ataque2=80;
                    defensa2=130;
                    velocidad2=10;
                    regener2=150;
                    personver2=true;
                    break;
                case "4":
                    personaje2="Mago maravila";
                    ataque2=80;
                    defensa2=80;
                    velocidad2=10;
                    regener2=150;
                    personver2=true;
                    break;
                default:
                    System.out.println("ERROR");
                    break;
                }                
            }
            System.out.println("Has elegido a: " + personaje2 );
            System.out.println("Vida: 100");
            System.out.println("Ataque: " + ataque2);
            System.out.println("Defensa: " + defensa2);
            System.out.println("Velocidad: " + velocidad2);
            System.out.println("Regeneracion: " + regener2);
            System.out.println(" ");



            Random random = new Random();
            int aleatorio = random.nextInt(5);
            int batalla1 = ataque1*aleatorio - defensa2*aleatorio;
            int regeneracion1=2*regener1/3;
            int critico1 = ataque1*2;
            int batalla2 = ataque1*aleatorio - defensa2*aleatorio;
            int regeneracion2=2*regener1/3;
            int critico2 = ataque1*2;

            
            
            while(vida1>0 && vida2>0){
                if (velocidad1 > velocidad2) {
                    System.out.println("JUGADOR 1, empiezas la partida");                
                    System.out.println("Si quieres atacar, escribe '1', si quieres regenerarte, escribe '2', si quieres lanza un critico, escribe '3'");
                    int arc = in.nextInt();
                    if (arc == 1){
                        System.out.println("JUGADOR 1");
                        vida2 =vida2 - batalla1;
                        System.out.println(personaje1 + " ha atacado a "+personaje2+" y le ha dejado" + vida2 + " puntos de vida.");
                        for (int i = 1; i <= 100; i++) {
                            if (i <= vida1) {
                                System.out.print("■");
                            } else {
                                System.out.print("");
                            }
                        }
                    }if (arc == 2){
                        vida1 = vida1 + regeneracion1;
                        System.out.println(personaje1 + " se ha regenerado y ahora tiene " + vida1 + " puntos de vida.");
                        for (int i = 1; i <= 100; i++) {
                            if (i <= vida1) {
                                System.out.print("■");
                            } else {
                                System.out.print("");
                            }
                        }
                    }if (arc == 3){
                        vida2 = vida2 - critico1;
                        System.out.println(personaje1 + " le ha lanzado un ataque critico y le ha dejado con " + vida2 + " puntos de vida a " + personaje2);
                        for (int i = 1; i <= 100; i++) {
                            if (i <= vida1) {
                                System.out.print("■");
                            } else {
                                System.out.print("");
                            }
                        }
                    }else{
                        System.out.println("Te has equivocado :' ). Lo siento, pero por empanadilla pierdes la silla...");
                    }

                }else{
                    System.out.println("JUGADOR 2, empiezas la partida");
                    System.out.println("Si quieres atacar, escribe 'a', si quieres regenerarte, escribe 'r', si quieres lanzar un critico escribe 'c'.");
                    char arc2 = in.next().charAt(0);
                    if (arc2 == 'a'){                        
                        vida1 =vida1 - batalla2;
                        System.out.println(personaje2 + " ha atacado a "+personaje1+" y le ha dejado" + vida1 + " puntos de vida.");
                        for (int i = 1; i <= 100; i++) {
                            if (i <= vida2) {
                                System.out.print("■");
                            } else {
                                System.out.print("");
                            }
                        }
                    }if (arc2 == 'r'){
                        vida2 = vida2 + regeneracion2;
                        System.out.println(personaje2 + " se ha regenerado y ahora tiene " + vida2 + " puntos de vida.");
                        for (int i = 1; i <= 100; i++) {
                            if (i <= vida2) {
                                System.out.print("■");
                            } else {
                                System.out.print("");
                            }
                        }
                    }if (arc2 == 'c'){
                        vida1 = vida1 - critico2;
                        System.out.println(personaje2 + " le ha lanzado un ataque critico y le ha dejado con " + vida1 + " puntos de vida a " + personaje1);
                        for (int i = 1; i <= 100; i++) {
                            if (i <= vida2) {
                                System.out.print("■");
                            } else {
                                System.out.print("");
                            }
                        }
                    }else{
                        System.out.println("Te has equivocado :' ). Lo siento, pero por empanadilla pierdes la silla...");
                    }
=======
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

>>>>>>> c3c31387a2eccc5f43bb346feee636da607a8515
                }
            }
    }
}

