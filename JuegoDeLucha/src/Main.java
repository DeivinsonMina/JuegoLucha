import java.util.Scanner;

import model.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del jugador 1: ");
        String nombre1 = sc.nextLine();
        System.out.print("Nombre del jugador 2: ");
        String nombre2 = sc.nextLine();

        JuegoLucha juego = new JuegoLucha(nombre1, nombre2);
        juego.iniciarPelea();
    }
}
