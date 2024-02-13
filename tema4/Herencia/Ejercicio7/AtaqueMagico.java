package Herencia.Ejercicio7;

public class AtaqueMagico implements Ataque {
    private int vida;
    private int coste;
    private int dano;

    public AtaqueMagico (int cantidad){
        this.coste=cantidad;
        this.dano=cantidad;
    }

    @Override
    public void lanzar(){
        System.out.println("Ha lanzado un ataque");
    }
    @Override
    public void coste() {    }

    @Override
    public void dano() {}
}
