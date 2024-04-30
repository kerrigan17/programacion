package Colecciones2.ejercicio1;

public abstract class AvistamientoAnimal {
    private int hora;
    private String  especie;

    public AvistamientoAnimal(int hora, String especie){
        this.especie=especie;
        this.hora=hora;
    }

    public int getHora(){
        return hora;
    }

    public String getEspecie(){
        return especie;
    }
    public String toString(){
        return "El animal con la especie: " + especie +", se ha avistado a las " + hora;
    }
}
