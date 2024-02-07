package Herencia.Ejemplo;

public class Perro extends AnimalDomestico{
    private  boolean esPeligroso;
    public Perro(String nombre, String raza, double peso, String color, boolean peligroso){
        super(nombre, raza, peso, color);
        this.esPeligroso = peligroso;
    }
    public void pasear(){
        System.out.println(nombre + " esta paseando.");
    }
    public boolean llamar (){
        System.out.println(nombre + ", ven aqui.");
        return true;
    }
    public void hacerRuido(){
        System.out.println("Guau!");
    }

}
