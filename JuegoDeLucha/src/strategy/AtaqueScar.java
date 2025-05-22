package strategy;
import java.util.Random;

import ss.Personaje;

public class AtaqueScar implements StrategyAtaque{
    public void ejecutar(Personaje atacante, Personaje oponente) {
        int dano = new Random().nextInt(11) + 20; // 20 a 30
        oponente.recibirDano(dano);
        System.out.println(atacante.getNombre() + " dispara con SCAR causando " + dano + " de daño.");
    }
}
