package Herencia.Ejercicio4;

public abstract class Ficha {
    private int number;
    private String title;

    public Ficha(int number, String title){
        this.title=title;
        this.number=number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumero(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitulo(String title) {
        this.title = title;
    }

    public String toString() {
        return "*******************"+
                "\nFicha:" +
                "\nNumero=" + number +
                "\nTitulo='" + title;
    }
    public abstract String getInformacionAdicional();

}
