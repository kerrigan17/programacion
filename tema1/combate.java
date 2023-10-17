import java.util.Random;
import java.util.Scanner;

public class combate {
    public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            Random random = new Random();                 

            
            int velocidad1 = 0;
            int ataque1 = 0;
            int defensa1 = 0;
            int regener1 = 0;
            int vida1 = 0;

            int velocidad2 = 0;
            int ataque2 = 0;
            int defensa2 = 0;
            int regener2 = 0;
            int vida2 = 0;
            String personaje1 = "";
            String personaje2 = "";

            boolean personver1 =false;
            boolean personver2 =false;
            
            while(!personver1){
                System.out.println("En breves empezara el combate");
                System.out.println("Primero, escoge el PERSONAJE 1 poniendo el numero: ");
                System.out.println("");
                System.out.println("1. Tigre de Hierro");
                System.out.println("2. Sombra Agil");
                System.out.println("3. Guerrero de Piedra");
                System.out.println("4. Mago maravilla");
                String numeroper = in.nextLine();   
                System.out.println("****************************************************************************************************************************************************************");         
                switch(numeroper) {
                case "1":
                    vida1 = 150;
                    personaje1="Tigre de Hierro";
                    ataque1=150;
                    defensa1=100;
                    velocidad1=50;
                    regener1=50;
                    personver1=true;
                    break;
                case "2":
                    vida1 = 100;
                    personaje1="Sombra Agil";
                    ataque1=150;
                    defensa1=80;
                    velocidad1=100;
                    regener1=70;
                    personver1=true;
                    break;
                case "3":
                    vida1 = 200;
                    personaje1="Guerrero de Piedra";
                    ataque1=50;
                    defensa1=150;
                    velocidad1=20;
                    regener1=80;
                    personver1=true;
                    break;
                case "4":
                    vida1 = 120;
                    personaje1="Mago maravilla";
                    ataque1=120;
                    defensa1=120;
                    velocidad1=20;
                    regener1=120;
                    personver1=true;
                    break;
                default:
                    System.out.println("ERROR");
                    break;
                }
            }
            System.out.println("JUGADOR 1, has elegido a " + personaje1 );
            System.out.println("Vida: 100");
            System.out.println("Ataque: " + ataque1);
            System.out.println("Defensa: " + defensa1);
            System.out.println("Velocidad: " + velocidad1);
            System.out.println("Regeneracion: " + regener1);
            System.out.println(" ");
            System.out.println("****************************************************************************************************************************************************************");
            
            while(!personver2) {
                System.out.println("Ahora, escoge el PERSONAJE 2 poniendo el numero: ");
                System.out.println("1. Tigre de Hierro");
                System.out.println("2. Sombra Agil");
                System.out.println("3. Guerrero de Piedra");
                System.out.println("4. Mago maravilla");
                String numeroper2 = in.nextLine();
                System.out.println("****************************************************************************************************************************************************************");               

                switch(numeroper2) {
                    case "1":
                        personaje2="Tigre de Hierro";
                        vida2 = 100;
                        ataque2=80;
                        defensa2=60;
                        velocidad2=10;
                        regener2 = 150;
                        personver2=true;
                        break;
                    case "2":
                        vida2 = 100;
                        personaje2="Sombra Agil";
                        ataque2=150;
                        defensa2=80;
                        velocidad2=100;
                        regener2=70;
                        personver2=true;
                        break;
                    case "3":
                        personaje2="Guerrero de piedra";
                        vida2 = 200;
                        ataque2=50;
                        defensa2=150;
                        velocidad2=20;
                        regener2=80;
                        personver2=true;
                        break;
                    case "4":
                        personaje2="Mago maravilla";
                        vida2 = 120;
                        ataque2=120;
                        defensa2=120;
                        velocidad2=20;
                        regener2=120;
                        personver2=true;
                        break;
                    default:
                        System.out.println("ERROR");
                        break;
                } 
            }
            System.out.println("JUGADOR 2, has elegido a: " + personaje2);
            System.out.println("Vida: 100");
            System.out.println("Ataque: " + ataque2);
            System.out.println("Defensa: " + defensa2);
            System.out.println("Velocidad: " + velocidad2);
            System.out.println("Regeneracion: " + regener2); 
            System.out.println(" ");
            System.out.println("****************************************************************************************************************************************************************");



            int min = 1;
            int max = 5;
            int aleatorio = random.nextInt((max-min)+1)+min;
            int batalla1 = (ataque1/2) - (defensa2/4);
            int regeneracion1 = 2*(regener1/aleatorio);
            int critico1 = ataque1/2;
            int batalla2 = (ataque2/2) - (defensa1/4);
            int regeneracion2 = 2*(regener1/aleatorio);
            int critico2 = ataque2/2;
            int ronda1 = 1;
            int ronda2 = 1;
            
            
            if (velocidad1 > velocidad2) {
                System.out.println("JUGADOR 1, empiezas la partida");
                while (vida1 > 0 && vida2 > 0) {
                    System.out.println("****************************************************************************************************************************************************************");
                    System.out.println("RONDA:  " + ronda1);
                    System.out.println("****************************************************************************************************************************************************************");
                    System.out.println("TURNO JUGADOR 1");
                    System.out.println("JUGADOR 1, Si quieres atacar, escribe 'a', si quieres regenerarte, escribe 'r', si quieres lanza un critico, escribe 'c'");
                    System.out.println("JUGADOR 1, si quieres SALIR, pulsa 'e'.");

                    char arc = in.next().charAt(0);
                    if (arc == 'a') {
                        vida2 = vida2 - batalla1;
                        System.out.println(personaje1 + " ha atacado a " + personaje2 + ".");
                        System.out.println("Vida de JUGADOR1 " + personaje1 + ": " + vida1);

                        System.out.println("Vida de JUGADOR2 " + personaje2 + ": " + vida2);
                    }
                    if (arc == 'r') {
                        vida1 = vida1 + regeneracion1;
                        System.out.println(personaje1 + " se ha regenerado.");
                        System.out.println("Vida de JUGADOR1 " + personaje1 + ": " + vida1);
                        System.out.println("Vida de JUGADOR2 " + personaje2 + ": " + vida2);
                    }
                    if (arc == 'c') {
                        vida2 = vida2 - critico1;
                        System.out.println(personaje1 + " le ha lanzado un ataque critico.");
                        System.out.println("Vida de JUGADOR1 " + personaje1 + ": " + vida1);
                        System.out.println("Vida de JUGADOR2 " + personaje2 + ": " + vida2);
                        
                    }if (arc == 'e') {
                        vida2 = 0;
                        vida1 = 0;
                    }
                
                    System.out.println("****************************************************************************************************************************************************************");
                    System.out.println("TURNO JUGADOR 2");
                    System.out.println("JUGADOR 2, si quieres atacar, escribe 'a', si quieres regenerarte, escribe 'r', si quieres lanzar un critico escribe 'c'.");
                    System.out.println("JUGADOR 2, si quieres SALIR, pulsa 'e'.");

                    char arc2 = in.next().charAt(0);
                    if (arc2 == 'a') {
                        vida1 = vida1 - batalla2;
                        System.out.println("****************************************************************************************************************************************************************");
                        System.out.println(personaje2 + " ha atacado a " + personaje1 + ".");
                        System.out.println("Vida de JUGADOR1 " + personaje1 + ": " + vida1);
                        System.out.println("Vida de JUGADOR2 " + personaje2 + ": " + vida2);
                    }
                    if (arc2 == 'r') {
                        vida2 = vida2 + regeneracion2;
                        System.out.println("****************************************************************************************************************************************************************");
                        System.out.println(personaje2 + " se ha regenerado.");
                        System.out.println("Vida de JUGADOR1 " + personaje1 + ": " + vida1);
                        System.out.println("Vida de JUGADOR2 " + personaje2 + ": " + vida2);
                    }
                    if (arc2 == 'c') {
                        vida1 = vida1 - critico2;
                        System.out.println("****************************************************************************************************************************************************************");
                        System.out.println(personaje2 + " le ha lanzado un ataque critico a " + personaje1);
                        System.out.println("Vida de JUGADOR1 " + personaje1 + ": " + vida1);
                        System.out.println("Vida de JUGADOR2 " + personaje2 + ": " + vida2);
                    }
                    if (arc2 == 'e') {
                        vida1 = 0;
                        vida2 = 0;
                    }
                    ronda1 = ++ronda1;
                    System.out.println("****************************************************************************************************************************************************************");
                    System.out.println("Vida de JUGADOR1 " + personaje1 + ": " + vida1);
                    for (int i = 1; i <= vida1; i++) {
                        System.out.print("-"); 
                    }
                    System.out.println("\n ");
                    System.out.println("Vida de JUGADOR2 " + personaje2 + ": " + vida2);
                    for (int i = 1; i <= vida2; i++) {
                        System.out.print("-"); 
                    }
                    System.out.println("\n ");
                    
                }
            }
            if(velocidad2 >velocidad1) {
                System.out.println("JUGADOR 2, empiezas la partida");
                while (vida1 > 0 && vida2 > 0) {
                    System.out.println("****************************************************************************************************************************************************************");
                    System.out.println("RONDA:  " + ronda2);
                    System.out.println("****************************************************************************************************************************************************************");
                    System.out.println("TURNO JUGADOR 2");
                    System.out.println("JUGADOR 2, si quieres atacar, escribe 'a', si quieres regenerarte, escribe 'r', si quieres lanzar un critico escribe 'c'.");
                    System.out.println("JUGADOR 2, si quieres SALIR, pulsa 'e'.");
                    char arc2 = in.next().charAt(0);
                    if (arc2 == 'a') {
                        vida1 = vida1 - batalla2;
                        System.out.println(personaje2 + " ha atacado a " + personaje1 + ".");
                        System.out.println("****************************************************************************************************************************************************************");
                        System.out.println("Vida de JUGADOR1 " + personaje1 + ": " + vida1);
                        System.out.println("Vida de JUGADOR2 " + personaje2 + ": " + vida2);
                    }
                    if (arc2 == 'r') {
                        vida2 = vida2 + regeneracion2;
                        System.out.println(personaje2 + " se ha regenerado.");
                        System.out.println("Vida de JUGADOR1 " + personaje1 + ": " + vida1);
                        System.out.println("Vida de JUGADOR2 " + personaje2 + ": " + vida2);

                    }
                    if (arc2 == 'c') {
                        vida1 = vida1 - critico2;
                        System.out.println(personaje2 + " le ha lanzado un ataque critico a " + personaje1);
                        System.out.println("Vida de JUGADOR1 " + personaje1 + ": " + vida1);
                        System.out.println("Vida de JUGADOR2 " + personaje2 + ": " + vida2);
                    }if (arc2 == 'e') {
                        vida2 = 0;
                        vida1 = 0;
                    }

                
                    System.out.println("****************************************************************************************************************************************************************");
                    System.out.println("TURNO JUGADOR 1");
                    System.out.println("JUGADOR 1, si quieres atacar, escribe 'a', si quieres regenerarte, escribe 'r', si quieres lanza un critico, escribe 'c'");
                    System.out.println("JUGADOR 1, si quieres SALIR, pulsa 'e'.");
                    char arc = in.next().charAt(0);
                    if (arc == 'a') {
                        vida2 = vida2 - batalla1;
                        System.out.println(personaje1 + " ha atacado a " + personaje2 + ".");
                        System.out.println("Vida de JUGADOR1 " + personaje1 + ": " + vida1);
                        System.out.println("Vida de JUGADOR2 " + personaje2 + ": " + vida2);
                    }
                    if (arc == 'b') {
                        vida1 = vida1 + regeneracion1;
                        System.out.println(personaje1 + " se ha regenerado.");
                        System.out.println("Vida de JUGADOR1" + personaje1 + ": " + vida1);
                        System.out.println("Vida de JUGADOR2" + personaje2 + ": " + vida2);
                    }
                    if (arc == 'c') {
                        vida2 = vida2 - critico1;
                        System.out.println(personaje1 + " le ha lanzado un ataque critico.");
                        System.out.println("Vida de JUGADOR1 " + personaje1 + ": " + vida1);
                        System.out.println("Vida de JUGADOR2 " + personaje2 + ": " + vida2);
                    } if (arc2 == 'e') {
                        vida2 = 0;
                        vida1 = 0;
                    }
                    
                    ronda2 = ++ronda2;
                    System.out.println("\n ");
                    System.out.println("Vida de JUGADOR1 " + personaje1 + ": " + vida1);
                    for (int i = 1; i <= vida1; i++) {
                        System.out.print("-"); 
                    }
                    System.out.println("\n ");
                    System.out.println("Vida de JUGADOR2 " + personaje2 + ": " + vida2);
                    for (int i = 1; i <= vida2; i++) {
                        System.out.print("-"); 
                    }
                    System.out.println("\n ");
                    }

                
            }
            if(vida1>200){
                vida1 = 200;
            }
            if(vida2>200){
                vida2 = 200;
            }
            if(vida1<0){
                vida1 = 0;
            }
            if(vida2<0){
                vida2 = 0;
            }

            if (vida1 <= 0 || vida2 <= 0) {
                if (vida1 <= 0 && vida2 <= 0) {
                    System.out.println("****************************************************************************************************************************************************************");
                    System.out.println("HAS EMPATADO");
                    System.out.println("****************************************************************************************************************************************************************");
                }else{
                    if (vida1 <= 0) {
                        System.out.println("****************************************************************************************************************************************************************");
                        System.out.println("JUGADOR 1 HAS MUERTO");
                        System.out.println("****************************************************************************************************************************************************************");
        
                    }
                    if (vida2 <= 0) {
                        System.out.println("****************************************************************************************************************************************************************");
                        System.out.println("JUGADOR 2 HAS MUERTO");
                        System.out.println("****************************************************************************************************************************************************************");
        
                    }
                }
    
            }

        } 

    }



