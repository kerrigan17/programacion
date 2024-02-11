package Herencia.Ejercicio4;

public class Revista extends Ficha {
    private int numeroPublicacion;
    private int ano;

    public Revista(int number, String title,  int numeroPublicacion, int ano) {
        super(number, title);
        this.ano=ano;
        this.numeroPublicacion=numeroPublicacion;
    }

    public int getNumeroPublicacion() {
        return numeroPublicacion;
    }

    public void setNumeroPublicacion(int numeroPublicacion) {
        this.numeroPublicacion = numeroPublicacion;
    }

    public int getAño() {
        return ano;
    }

    public void setAño(int año) {
        this.ano = año;
    }

    @Override
    public String getInformacionAdicional() {
        return "Número de publicación: " + numeroPublicacion + "\nAño: " + ano;
    }
}
