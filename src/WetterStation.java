import Interfaces.Observer;
import Interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class WetterStation implements Subject {

    private List<Observer> observerListe = new ArrayList<>();
    private float temperatur;
    private float luftfeuchtigkeit;

    // Methode zum Setzen neuer Messwerte
    public void setMesswerte(float temperatur, float luftfeuchtigkeit) {
        this.temperatur = temperatur;
        this.luftfeuchtigkeit = luftfeuchtigkeit;
        benachrichtigen();
    }

    @Override
    public void hinzufuegen(Observer observer) {
        observerListe.add(observer);
    }

    @Override
    public void entfernen(Observer observer) {
        observerListe.remove(observer);
    }

    @Override
    public void benachrichtigen() {
        for (Observer observer : observerListe) {
            observer.update(temperatur, luftfeuchtigkeit);
        }
    }
}

