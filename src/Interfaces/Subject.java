package Interfaces;

public interface Subject {

    // Methode zum hinzufuegen von Observern
    void hinzufuegen(Observer beobachter);

    // Methode zum entfernen von Observern
    void entfernen(Observer beobachter);

    //Methode zum Benachrichtigen der Observer über die neuen Messwerte
    void benachrichtigen();
}
