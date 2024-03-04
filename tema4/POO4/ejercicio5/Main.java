package ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        List<ICombatiente> combatientes = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            int tipo = random.nextInt(3);
            switch (tipo) {
                case 0:
                    combatientes.add(new Berserker(100));
                    break;
                case 1:
                    combatientes.add(new Mago(80));
                    break;
                case 2:
                    combatientes.add(new Bardo(120));
                    break;
            }
        }    
            while (combatientes.size() > 1) {
                List<ICombatiente> sobrevivientes = new ArrayList<>();
    
                for (int i = 0; i < combatientes.size(); i += 2) {
                    if (i + 1 < combatientes.size()) {
                        ICombatiente combatiente1 = combatientes.get(i);
                        ICombatiente combatiente2 = combatientes.get(i + 1);
    
                        while (combatiente1.estaVivo() && combatiente2.estaVivo()) {
                            Ataque ataque = combatiente1.atacar();
                            combatiente2.defender(ataque);
                            if (!combatiente2.estaVivo()) {
                                sobrevivientes.add(combatiente1);
                            }
    
                            ataque = combatiente2.atacar();
                            combatiente1.defender(ataque);
                            if (!combatiente1.estaVivo()) {
                                sobrevivientes.add(combatiente2);
                            }
                        }
                    } else {
                        sobrevivientes.add(combatientes.get(i));
                    }
                }
    
                combatientes = sobrevivientes;
    
                if (combatientes.size() == 1) {
                    break;
                }
            }

        ICombatiente ganador = combatientes.get(0);
        System.out.println("El ganador del Battle Royale es: " + ganador.getClass().getSimpleName());
    }
}

        