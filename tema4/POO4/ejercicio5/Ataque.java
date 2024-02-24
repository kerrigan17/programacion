package ejercicio5;

public class Ataque {
    enum Danio {FISICO, MAGICO}
    enum Alcance {CORTO, LARGO}

    private int cantidad;
    private Danio danio;
    private Alcance alcance;

    
    public Ataque(int cantidad, Danio danio, Alcance alcance){
        this.cantidad = cantidad;
        this.danio=danio;
        this.alcance = alcance;
    }
    public int getCantidad() {
        return cantidad;
    }

    public Danio getDanio() {
        return danio;
    }

    public Alcance getAlcance() {
        return alcance;
    }
}
