package ITV;

import java.time.LocalDateTime;

class Vehiculo {
    private String tipo;
    LocalDateTime dateTime;

    public Vehiculo(String tipo, LocalDateTime dateTime) {
        this.tipo = tipo;
        this.dateTime = dateTime;
    }
    
    public String getTipo(){
        return tipo;
    }


    public LocalDateTime getHoraEntrada(){
        LocalDateTime dateTime = LocalDateTime.now();
        return dateTime;
    }
    public String toString(){
        return "Tipo: "+ tipo+"\nHora entrada: "+ dateTime;
    }
}
