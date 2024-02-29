package ejercicio4;

public class Revista extends Item{
    String producto;

    public Revista(String title) {
        super(title);
        this.title=title;
        this.producto="Libro";

    }
    public void ojearRevista(){
        System.out.println("Estas ojeando la revista: " +title);
    }
    
    public String toString() {
        return "Titulo: " + title +", tipo de producto: "+producto;
    }
    
}
