public class Main {

        public static void main(String[] args) {
            // Subjekt (Observable)
            WetterStation wetterstation = new WetterStation();

            // Observer erstellen
            TemperaturAnzeige temperaturAnzeige = new TemperaturAnzeige();
            FeuchtigkeitsAnzeige feuchtigkeitsAnzeige = new FeuchtigkeitsAnzeige();

            // Observer registrieren
            wetterstation.hinzufuegen(temperaturAnzeige);
            wetterstation.hinzufuegen(feuchtigkeitsAnzeige);

            //Neue Messwerte werden gesetzt
            System.out.println("=== Erste Messung ===");
            wetterstation.setMesswerte(21.5f, 65.0f);

            //Neue Messwerte werden gesetzt
            System.out.println("\n=== Zweite Messung ===");
            wetterstation.setMesswerte(23.0f, 60.0f);

            //Feuchtigkeitsanzeige wird entfernt
            System.out.println("\n=== Feuchtigkeitsanzeige wird entfernt ===");
            wetterstation.entfernen(feuchtigkeitsAnzeige);

            //Neue Messwerte werden gesetzt, ohne Feuchtigkeitsanzeige
            System.out.println("\n=== Dritte Messung (nur Temperatur beobachtet) ===");
            wetterstation.setMesswerte(25.2f, 55.0f);
        }
    }
