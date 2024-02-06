package POO;

public class Persona {
  private String dni;
  private String name;
  private String apellido1;
  private String apellido2;
  private int age;
  private static final int NUM_POR_DEFECTO = 0;
  private static final String POR_DEFECTO = "Desconocido";
  private static int adultAge=18;
  private static int retiredAge=65;


  public Persona(){
    this.name = POR_DEFECTO;
    this.apellido1=POR_DEFECTO;
    this.apellido2=POR_DEFECTO;
    this.age = NUM_POR_DEFECTO;
    this.dni=POR_DEFECTO;
  }
  public Persona(String name, String apellido1, String apellido2, int age, int dni){
    this.name = name;
    this.apellido1=apellido1;
    this.apellido2=apellido2;
    this.age = age;
    this.dni=POR_DEFECTO;
  }
  public String getDni(){
    return dni;
  }
  public void setDni(String dni){
      this.dni = dni;
  }
  String getName(){
    return name;
  }
  public void setName(String name){
      this.name = name;
  }
  String getApellido1(){
    return apellido1;
  }
  public void setApellido1(String apellido1){
      this.apellido1 = apellido1;
  }
  String getApellido2(){
    return apellido2;
  }
  public void setApellido2(String apellido2){
      this.apellido2 =apellido2;
  }
  public int getAge(){
      return age;
  }
  public void setAge(int age){
      this.age=age;
  }
  public static void showInfo(Persona persona){
    System.out.println("Nombre: " + persona.getName());
    System.out.println("Primer apellido: "+persona.getApellido1());
    System.out.println("Segundo apellido: "+persona.getApellido2());
    System.out.println("Edad: "+persona.getAge());
    System.out.println("DNI: "+persona.getDni());
    System.out.println("Es adulto: " + isAdult(persona.getAge()));
    System.out.println("Es jubilado: " + isRetired(persona.getAge()));
    System.out.println("DNI correcto: " +checkDNI(persona.getDni()));
    System.out.println("*********************************");
  }
  public static boolean isAdult (int edad){
    boolean isAdult=false;
    if (edad>= adultAge ) {
      isAdult =true;
    }
    return isAdult;
  }

  public static boolean isRetired (int edad){
    boolean isRetired=false;
    if (edad> retiredAge ) {
      isRetired =true;
    }
    return isRetired;
  }

  public static int diference(int edad1, int edad2){
    int diference;
    if (edad1>edad2) {
      diference = edad1-edad2;
    }else{
      diference=edad2-edad1;
    }
    return diference;
  }

  public static void saludar (Persona persona){
    System.out.println("Hola! " + persona.getName() + " " + persona.getApellido1()+ " estos son tus datos: ");
  }

  public static boolean checkDNI(String dni){
    boolean isCorrect = false;
    char[] cadena = dni.toCharArray();
    if (cadena.length == 9) {
      isCorrect = true;
    }
    return isCorrect;

  }
  public String getNivel() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getNivel'");
  }
public void setDNI(String dni2) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setDNI'");
}
public void setLastName(String apellido) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setLastName'");
}

}
