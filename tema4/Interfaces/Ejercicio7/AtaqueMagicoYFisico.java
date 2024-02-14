package Interfaces.Ejercicio7;

public class AtaqueMagicoYFisico implements Ataque {
    private int costo;
    private int danio;

    public AtaqueMagicoYFisico(int costo, int danio) {
        this.costo = costo;
        this.danio = danio;
    }
    public AtaqueMagicoYFisico() {
        this.costo = 0;
        this.danio = 0;
    }

    @Override
    public void lanzar() {
        System.out.println("Lanzando ataque mágico y físico");
    }

    @Override
    public int coste() {
        return costo;
    }

    @Override
    public int dano() {
        return danio;
    }
}
