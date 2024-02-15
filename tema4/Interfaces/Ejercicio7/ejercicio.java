package Interfaces.Ejercicio7;

public class ejercicio {
    
public interface Ataque3 {
    double PI = 3.14; // NO SON ATRIBUTOS DEL OBJETO
    void lanzar();
    void coste();
    void dano();
}



public abstract class Ataque2 {
    String a;
    int b;

    public void lanzar() {
        System.out.println("!adsadsadas");
    }
    abstract void coste();
    abstract void dano();

}

public class Espada implements Ataque {
    @Override
    void coste() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'coste'");
    }
    void afilar() {

    }
    @Override
    void dano() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dano'");
    }
}

public class Arco implements Ataque {

    public void tensarArco() {

    }
    @Override
    public void lanzar() {
        this.a = 9;
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'lanzar'");
    }

    @Override
    public void coste() {
        
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'coste'");
    }

    @Override
    public void dano() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dano'");
    }
    
}

public static void main() {
    int a;
    Arco arco = new Arco();
    Espada espada = new Espada();
    arco.tensarArco();
    espada.afilar();
    ((Ataque) arco).
    
    Ataque miArma = new Arco();
    miArma.dano();
    ((Arco) miArma).tensarArco();

    miArma = new Espada();
    //inicializadas
    for (Ataque2 arma : armas) {
        arma.dano();
    }

    heroe.ataca(heroe, arma);

    arco.dano();
    espada.dano();


}
}
