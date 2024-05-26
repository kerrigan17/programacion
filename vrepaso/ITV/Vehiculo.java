package vrepaso.ITV;

import java.time.LocalDateTime;

class Vehiculo {
    String tipo;
    String matricula;
    LocalDateTime hora;

    public Vehiculo (String matricula, String tipo, LocalDateTime hora){
        this.matricula=matricula;
        this.tipo=tipo;
        this.hora=hora;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getTipo() {
        return tipo;
    }

    public LocalDateTime getHora(){
        return hora;
    }

    @Override
    public String toString() {
        return "Vehiculo " +
        "matricula:'" + matricula + '\'' +
        ", tipo:'" + tipo + '\'' +
        ", horaRegistro:'" + hora + '\'' +
        '}';
    }

}
