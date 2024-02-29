package ejercicio5;

class Mago implements ICombatiente{
    int vida;

    public Mago(int vida) {
        this.vida = vida;
    }

    public Ataque atacar() {
        if (Math.random() < 0.9) {
            System.out.println("El Mago ha atacado");
            return new Ataque("a distancia", (int)(Math.random() * 11) + 15 + (int)(vida * 0.1));
        } else {
            System.out.println("El Mago ha atacado");
            return new Ataque("a distancia", (int)(Math.random() * 11) + 15);
        }
    }

    public void defender(Ataque ataque) {
        System.out.println("El Mago se ha defendido");        
        if (ataque.tipo.equals("cuerpo a cuerpo")) {
            vida -= (int)(Math.random() * 6) + 5;
        }
    }

    public boolean estaVivo() {
        return vida > 0;
    }
    
}
