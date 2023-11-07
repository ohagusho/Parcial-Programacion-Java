import java.util.Map;
import java.util.Scanner;

public class JuegoAdivinanzaAnimalesMain {
    public static void main(String[] args) {
        Map<String, String> adivinanzas;
        adivinanzas = Map.of(
                "mono", "A este animal le encanta comer bananas y colgarse de los árboles, saltando de rama en rama...",
                "leon", "A este animal le llaman el rey de la selva, tiene una gran melena y un rugido muy fuerte.",
                "hipopotamo", "Soy muy grande, tengo una boca gigante. Me gusta bañarme y en el barro rebozarme.",
                "rinoceronte", "Mucha memoria, gran tamaño, y dura piel, pero este animal tiene la nariz más grandota que puedas ver.",
                "serpiente", "A este animal le encanta “deslizarse” por el suelo, enrollándose de las ramas de los árboles.",
                "oso", "¿Qué animal es muy grande y le encanta comer miel?",
                "elefante", "En el circo lo veo, en el zoo, también, tiene la nariz más grande que en el mundo puede haber."

        );

        Scanner input = new Scanner(System.in);

        do {
            JuegoAdivinanza juego = new JuegoAdivinanza(adivinanzas);
            juego.jugar();

            System.out.print("¿Quieres jugar de nuevo? (si/no): ");
            String respuesta = input.nextLine().toLowerCase();

            if (!respuesta.equals("si")) {
                break;
            }

        } while (true);

        input.close();
    }
}