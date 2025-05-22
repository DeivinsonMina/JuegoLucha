package strategy;
import java.util.Random;

import model.Personaje;

public class AtaqueG18 implements StrategyAtaque{
    public void ejecutar(Personaje atacante, Personaje oponente) {
        int dano = new Random().nextInt(11) + 5; // 5 a 15
        oponente.recibirDano(dano);
        System.out.println(atacante.getNombre() + " dispara con G18 causando " + dano + " de daño.");
    }
}
