package Interfaces;

public interface Subject {
    void hinzufuegen(Observer beobachter);

    void entfernen(Observer beobachter);

    void benachrichtigen();
}
