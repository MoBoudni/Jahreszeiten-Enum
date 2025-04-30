package de.enums.jahreszeiten;

/**
 * Demonstrationsklasse für die Verwendung des Enums `Jahreszeit`.
 * Diese Klasse enthält die `main`-Methode, die die Funktionalitäten des Enums demonstriert.
 */
public class JahreszeitDemo {

    /**
     * Hauptmethode, die die Funktionalitäten des Enums `Jahreszeit` demonstriert.
     *
     * @param args Kommandozeilenargumente (werden in diesem Beispiel nicht verwendet)
     */
    public static void main(String[] args) {
        // Durchlaufen aller Jahreszeiten und Ausgabe ihrer Beschreibungen
        for (Jahreszeit season : Jahreszeit.values()) {
            System.out.println(season + ": " + season.beschreibung());
        }

        // Beispiel für die Verwendung der Methode `naechsteJahreszeit`
        Jahreszeit aktuelleJahreszeit = Jahreszeit.Sommer;
        System.out.println("Die nächste Jahreszeit nach " + aktuelleJahreszeit + " ist " + aktuelleJahreszeit.naechsteJahreszeit());
    }
}
