package Herencia.Ejercicio4;

public class Dvd extends Ficha{
    private String director;
    private int ano;
    private TipoDvd tipo;

    public enum TipoDvd{
        ANIMACION,
        ACCION,
        DOCUMENTAL,
        CIENCIA_FICCION
    }

    public Dvd(int number, String title, String director, int ano, TipoDvd tipo){
        super(number, title);
        this.tipo=tipo;
        this.director=director;
        this.tipo=tipo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public TipoDvd getTipo() {
        return tipo;
    }

    public void setTipo(TipoDvd tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getInformacionAdicional() {
        return "Director: " + director + "\nAño: " + ano + "\nTipo: " + tipo;
    }
} 
