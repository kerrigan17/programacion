package Interfaces.Ejercicio7;

public class AtaqueMagico implements Ataque {
    private int vida;
    private int coste;
    private int dano;

    public AtaqueMagico (){
        this.coste=0;
        this.dano=0;
    }
    public AtaqueMagico (int costo, int dano){
        this.coste=costo;
        this.dano=dano;
    }

    @Override
    public void lanzar(){
        System.out.println("Ha lanzado un ataque magico");
    }
    
    @Override
    public int coste() {
        vida=vida-coste;
        System.out.println(vida);
        return vida;
        
    }

    @Override
    public int dano() {
        return dano;
    }
}
