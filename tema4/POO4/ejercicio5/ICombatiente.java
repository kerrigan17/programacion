package ejercicio5;

/**
 * Combatiente
 */
public interface ICombatiente {
    Ataque atacar();
    void defender(Ataque ataque);
    boolean estaVivo();
}