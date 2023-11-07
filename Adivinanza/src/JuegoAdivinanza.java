import java.util.*;

class JuegoAdivinanza {
    private Map<String, String> adivinanzas;
    private String animalAdivinar;
    private int intentos;
    private boolean adivinado;

    public JuegoAdivinanza(Map<String, String> adivinanzas) {
        this.adivinanzas = adivinanzas;
        Random random = new Random();
        List<String> keys = new ArrayList<>(adivinanzas.keySet());
        animalAdivinar = keys.get(random.nextInt(keys.size()));
        intentos = 0;
        adivinado = false;
    }

    public void jugar() {
        Scanner input = new Scanner(System.in);

        System.out.println("Adivina el nombre del animal: " + adivinanzas.get(animalAdivinar));

        while (!adivinado) {
            System.out.print("Ingresa tu Respuesta: ");
            String intento = input.nextLine().toLowerCase(); // Convierte la respuesta del usuario a minúsculas
            intentos++;

            if (intento.equals(animalAdivinar.toLowerCase())) { // Compara en minúsculas
                System.out.println("¡Felicidades! Adivinaste el animal en " + intentos + " intentos.");
                adivinado = true;
            } else {
                System.out.println("Incorrecto, Intenta de nuevo.");
            }
        }
    }
}