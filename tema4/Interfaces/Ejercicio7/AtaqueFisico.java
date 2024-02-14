package Interfaces.Ejercicio7;

public class AtaqueFisico implements Ataque {
    private int costo;
    private int dano;
    private int vida;

    public AtaqueFisico(int costo, int dano) {
        this.costo = costo;
        this.dano = dano;
    }

    public AtaqueFisico() {
        this.costo = 0;
        this.dano = 0;
    }

    @Override
    public void lanzar() {
        System.out.println("Ha lanzado un ataque fisico.");
    }

    @Override
    public int coste() {
        vida=vida-costo;
        System.out.println(vida);
        return vida;
        
    }

    @Override
    public int dano() {
        return dano;
    }
    
}
