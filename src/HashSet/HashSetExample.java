package HashSet;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // HashSet erstellen
        HashSet<String> fruits = new HashSet<String>();

        // Elemente hinzufügen
        fruits.add("Apfel");
        fruits.add("Banane");
        fruits.add("Orange");
        fruits.add("Apfel"); // Duplikat wird ignoriert

        // Elemente ausgeben
        System.out.println("Früchte: " + fruits);

        // Prüfen, ob ein Element existiert
        if (fruits.contains("Banane")) {
            System.out.println("Banane ist in der Menge enthalten.");
        }

        // Element entfernen
        fruits.remove("Orange");

        // Nach Entfernung anzeigen
        System.out.println("Früchte nach Entfernung: " + fruits);
    }
}
