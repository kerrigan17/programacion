package POO;

import java.util.Scanner;

public class PersonaMain {
      private static Scanner in = new Scanner(System.in);

  public static void main(String[] args) {
    Persona persona1 = new Persona();
    Persona persona2 = new Persona();

    System.out.println("Hola, vamos a comenzar con la recpilacion de datos.");
    System.out.println("Nombre:");
    String name1=in.nextLine();
    System.out.println("Primer apellido:");
    String apellido1_1 =in.nextLine();
    System.out.println("Segundo apellido:");
    String apellido1_2 =in.nextLine();
    System.out.println("Edad: ");
    int age1 = in.nextInt();
    in.nextLine();
    System.out.println("DNI: ");
    String dni1 = in.nextLine();
    System.out.println("*************************");

    persona1.setName(name1);
    persona1.setApellido1(apellido1_1);
    persona1.setApellido2(apellido1_2);
    persona1.setAge(age1);
    persona1.setDni(dni1);

    Persona.saludar(persona1);
    Persona.showInfo(persona1);
    System.out.println("Ahora de la segunda persona:");
    System.out.println("Nombre:");
    String name2=in.nextLine();
    System.out.println("Primer apellido:");
    String apellido2_1 =in.nextLine();
    System.out.println("Segundo apellido:");
    String apellido2_2 =in.nextLine();
    System.out.println("Edad: ");
    int age2 = in.nextInt();
    in.nextLine();
    System.out.println("DNI: ");
    String dni2 = in.nextLine();
    System.out.println("*************************");

    persona2.setName(name2);
    persona2.setApellido1(apellido2_1);
    persona2.setApellido2(apellido2_2);
    persona2.setAge(age2);
    persona2.setDni(dni2);

    Persona.saludar(persona2);
    Persona.showInfo(persona2);

    System.out.println("La diferencia de edad es: "+ Persona.diference(age1, age2));


  }

}
