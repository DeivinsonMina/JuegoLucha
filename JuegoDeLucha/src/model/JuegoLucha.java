package model;
import java.util.Scanner;


import strategy.StrategyAtaque;
import factory.factoryAtaques;

public class JuegoLucha {
    private Personaje jugador1;
    private Personaje jugador2;
    private Scanner scanner = new Scanner(System.in);

    public JuegoLucha(String nombre1, String nombre2) {
        jugador1 = new Personaje(nombre1);
        jugador2 = new Personaje(nombre2);
    }

    public void iniciarPelea() {
        System.out.println("¡Comienza la pelea entre " + jugador1.getNombre() + " y " + jugador2.getNombre() + "!");

        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            turno(jugador1, jugador2);
            if (jugador2.estaVivo()) {
                turno(jugador2, jugador1);
            }
        }

        if (jugador1.estaVivo()) {
            System.out.println(jugador1.getNombre() + " ha ganado.");
        } else {
            System.out.println(jugador2.getNombre() + " ha ganado.");
        }
    }

    private void turno(Personaje atacante, Personaje defensor) {
        System.out.println("\nTurno de " + atacante.getNombre() + " (HP: " + atacante.getPuntosDeVida() + ")");
        System.out.println(defensor.getNombre() + " tiene " + defensor.getPuntosDeVida() + " puntos de vida.");
        StrategyAtaque estrategia = seleccionarAtaque();
        atacante.atacar(estrategia, defensor);
    }

    private StrategyAtaque seleccionarAtaque() {
        System.out.println("Selecciona tu ataque:");
        System.out.println("1. SCAR");
        System.out.println("2. MP4");
        System.out.println("3. G18");
        int opcion = scanner.nextInt();
        return factoryAtaques.crearAtaque(opcion);

       
    }
}