package factory;
import strategy.AtaqueG18;
import strategy.AtaqueMp40;
import strategy.AtaqueScar;
import strategy.StrategyAtaque;
public class factoryAtaques {
public static StrategyAtaque crearAtaque(int opcion) {
        switch (opcion) {
            case 1: return new AtaqueScar();
            case 2: return new AtaqueMp40();
            case 3: return new AtaqueG18();
            default:
                System.out.println("Opción inválida. Usando MP4 por defecto.");
                return new AtaqueMp40();
        }
    }
}
