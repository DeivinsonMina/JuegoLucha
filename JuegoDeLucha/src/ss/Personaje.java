package ss;

import strategy.StrategyAtaque;

public class Personaje {
    private String nombre;
    private int puntosDeVida;
    
    public Personaje(String nombre) {
        this.nombre = nombre;
        this.puntosDeVida = 100;
    }

    public void atacar(StrategyAtaque estrategia, Personaje oponente) {
        estrategia.ejecutar(this, oponente);
    }

    public void recibirDano(int dano) {
        this.puntosDeVida -= dano;
        if (this.puntosDeVida < 0) this.puntosDeVida = 0;
    }

    public boolean estaVivo() {
        return this.puntosDeVida > 0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getPuntosDeVida() {
        return this.puntosDeVida;
    }
}
