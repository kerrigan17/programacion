package ejercicio5;

class Bardo implements ICombatiente {
    int vida;

    public Bardo(int vida) {
        this.vida = vida;
    }

    public Ataque atacar() {
        if (Math.random() < 0.5) {
            return new Ataque("cuerpo a cuerpo", (int)(Math.random() * 11) + 10);
        } else {
            return new Ataque("a distancia", (int)(Math.random() * 11) + 15);
        }
    }

    public void defender(Ataque ataque) {
        vida -= (int)(Math.random() * 11) + 5;
    }

    public boolean estaVivo() {
        return vida > 0;
    }
}
