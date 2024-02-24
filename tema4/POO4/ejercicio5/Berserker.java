package ejercicio5;

import java.util.Random;

class Berserker implements Combatiente{
    private int vida;
    private boolean vivo;
    private  Random random;

    public Berserker() {
        vida = 100;
        vivo = true;
        random = new Random();
    }
    
    @Override
    public int atacar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atacar'");
    }

    @Override
    public int defender(String ataque) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'defender'");
    }

    @Override
    public boolean estaVivo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'estaVivo'");
    }
}
