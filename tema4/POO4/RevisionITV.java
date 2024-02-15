package POO4;

public class RevisionITV {
    private String tipo;
    private String matricula;
    private int horaEntrada;

    public RevisionITV(String tipo, String matricula, int horaEntrada) {
        this.tipo = tipo;
        this.matricula = matricula;
        this.horaEntrada = horaEntrada;
    }

    public String toString(){
        return "Tipo: "+ tipo+ "\nMatricula: " + matricula + "\nHora entrada: "+ horaEntrada;
    }
}
