package metodos;

public class personas {
    personas persona = new personas();
    public String name;
    public String age;
    public static String hello(){
        return "Hola humano! Estas hablando con el reptiliano";
    }
    public static String age (String age){
        return "EStoy hasta los huevos "+ age;
    }


    public static void main(String[] args) {
        System.out.println(personas.age("24"));
    }

}
