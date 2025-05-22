package strategy;
import java.util.Random;

import model.Personaje;

public class AtaqueMp40 implements StrategyAtaque {
    public void ejecutar(Personaje atacante, Personaje oponente) {
        int dano = new Random().nextInt(11) + 10; // 10 a 20
        oponente.recibirDano(dano);
        System.out.println(atacante.getNombre() + " dispara con MP40 causando " + dano + " de daño.");
    }
}
