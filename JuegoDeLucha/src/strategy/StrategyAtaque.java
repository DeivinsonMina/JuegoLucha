package strategy;
import model.Personaje;
public interface StrategyAtaque {
void ejecutar(Personaje atacante, Personaje oponente);
}
