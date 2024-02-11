package Herencia.Ejercicio4;

public class Libro extends Ficha {

    private String autor;
    private String editorial;

    public Libro(int number, String title, String autor, String editorial) {
        super(number, title);
        this.autor=autor;
        this.editorial=editorial;
    }
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String getInformacionAdicional() {
        return "Autor: " + autor + "\nEditorial: " + editorial;
    }
}
