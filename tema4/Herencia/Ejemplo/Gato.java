package Herencia.Ejemplo;

class Gato extends AnimalDomestico {
    public Gato(String nombre, String raza, double peso, String color){
        super(nombre, raza, peso, color);
    }
    public void toserBolaPelo() {
        System.out.println(nombre + " está tosiendo pelo.");
    }

    public boolean llamar() {
        System.out.println(nombre + " está ignorando tu llamada.");
        return false;
    }
    public void hacerRuido() {
        System.out.println("Miau");
    }
}

