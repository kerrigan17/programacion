package ejercicio4;

public class Libro extends Item{
    String producto;

    public Libro(String title) {
        super(title);
        this.title=title;
        this.producto="Libro";
    }
    public void leerLibro(){
        System.out.println("Estas viendo el DVD: " +title);
    }
    
    public String toString() {
        return "Titulo: " + title +", tipo de producto: "+producto;
    }
}