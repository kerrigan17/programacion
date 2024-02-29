package ejercicio5;

import java.util.Random;

class Berserker implements ICombatiente{
    int vida;
    int maxVida;
    Random random;

    public Berserker(int vida) {
        this.vida = vida;
        this.maxVida = vida;
    }

    public Ataque atacar() {
        if (Math.random() < 0.1) {
            System.out.println("El Berserker ha atacado");
            return new Ataque("cuerpo a cuerpo", (int)(Math.random() * 11) + 10 + (maxVida - vida));
        } else {
            System.out.println("El Berserker ha atacado");
            return new Ataque("cuerpo a cuerpo", (int)(Math.random() * 11) + 10);
        }

    }

    public void defender(Ataque ataque) {
        if (ataque.tipo.equals("a distancia")) {
            vida -= (int)(Math.random() * 6) + 5;
        } else {
            vida -= (int)(Math.random() * 4) + 2;
        }
        System.out.println("El Berserker se ha defendido");
    }

    public boolean estaVivo() {
        return vida > 0;
    }
}
