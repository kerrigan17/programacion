package Interfaces.Ejercicio7;

public class AtaqueMagico implements Ataque {
    private int vida;
    private int coste;
    private int dano;

    public AtaqueMagico (){
        this.coste=0;
        this.dano=0;
    }

    @Override
    public void lanzar(){
        System.out.println("Ha lanzado un ataque");
    }
    @Override
    public void coste() {
        vida=vida-coste;
        System.out.println(vida);
        
    }

    @Override
    public void dano() {}
}
