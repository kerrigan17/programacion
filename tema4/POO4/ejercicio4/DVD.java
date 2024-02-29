package ejercicio4;

public class DVD extends Item{

    public DVD(String title) {
        super(title);
        this.title=title;
    }
    public void verDVD(){
        System.out.println("Estas viendo el DVD: " +title);
    }
    
    public String toString() {
        return "Titulo: " + title +", tipo de producto: DVD";
    }
}
