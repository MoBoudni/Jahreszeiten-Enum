package de.enums.jahreszeiten;

/**
 * Enum, das die vier Jahreszeiten repräsentiert: Frühling, Sommer, Herbst und Winter.
 * Jede Jahreszeit hat eine Beschreibung und eine Methode, um die nächste Jahreszeit zu ermitteln.
 */
public enum Jahreszeit {
    Fruehling, Sommer, Herbst, Winter;

    /**
     * Gibt eine Beschreibung der Jahreszeit zurück.
     *
     * @return Beschreibung der Jahreszeit
     */
    public String beschreibung() {
        switch (this) {
            case Fruehling:
                return "Zeit des Erwachens oder Blütezeit";
            case Sommer:
                return "Hochzeit des Jahres oder Sonnenzeit";
            case Herbst:
                return "Erntezeit oder goldene Jahreszeit";
            case Winter:
                return "Zeit der Ruhe oder Kältezeit";
            default:
                return "";
        }
    }   
// Alternativ:
//    private static final String[] BESCHREIBUNGEN = {
//                "Zeit des Erwachens oder Blütezeit",
//                "Hochzeit des Jahres oder Sonnenzeit",
//                "Erntezeit oder goldene Jahreszeit",
//                "Zeit der Ruhe oder Kältezeit"
//            };
//  public String beschreibung() {
//        for (int i = 0; i < values().length; i++) {
//            if (this == values()[i]) {
//                return BESCHREIBUNGEN[i];
//            }
//        }
//        return "";
//    }
        
    /**
     * Gibt die nächste Jahreszeit im Jahreszyklus zurück.
     *
     * @return Die nächste Jahreszeit
     */
    public Jahreszeit naechsteJahreszeit() {
        Jahreszeit[] alleJahreszeiten = Jahreszeit.values();
        return alleJahreszeiten[(this.ordinal() + 1) % alleJahreszeiten.length];
    }
}
