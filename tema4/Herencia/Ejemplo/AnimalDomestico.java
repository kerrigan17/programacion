package Herencia.Ejemplo;

public class AnimalDomestico {
    protected String nombre;
    protected String raza;
    protected double peso;
    protected String color;
    protected String ruido;
    protected static final String DEFAULT = "Desconcido";
    protected static final int DEFAULT_PESO = 0;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public AnimalDomestico (){
        this.nombre=DEFAULT;
        this.raza=DEFAULT;
        this.peso=DEFAULT_PESO;
        this.color=DEFAULT;
    }

    public String getRuido() {
        return ruido;
    }


    public void setRuido(String ruido) {
        this.ruido = ruido;
    }

    public AnimalDomestico (String nombre, String raza, double peso, String color){
        this.nombre=nombre;
        this.raza=raza;
        this.peso=peso;
        this.color=color;
    }

}
