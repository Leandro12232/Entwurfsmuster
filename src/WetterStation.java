import Interfaces.Observer;
import Interfaces.Subject;

//Import für gebrauchte Listen
import java.util.ArrayList;
import java.util.List;

public class WetterStation implements Subject {

    // Neue Liste für Observer
    private List<Observer> observerListe = new ArrayList<>();
    private float temperatur;
    private float luftfeuchtigkeit;

    // Methode zum Setzen neuer Messwerte und startet Methode benachrichtigen
    public void setMesswerte(float temperatur, float luftfeuchtigkeit) {
        this.temperatur = temperatur;
        this.luftfeuchtigkeit = luftfeuchtigkeit;
        benachrichtigen();
    }

    // Methode zum Hinzufügen von neuen Observern und prüft, ob Observer bereits existiert
    @Override
    public void hinzufuegen(Observer observer) {
        if (observer == null) return;
        if (!observerListe.contains(observer)) {
            observerListe.add(observer);
        }
    }

    //Methode zum Entfernen von Observern in der Liste
    @Override
    public void entfernen(Observer observer) {
        observerListe.remove(observer);
    }

    //Methode, welche die Methode update, bei allen Observern in der Observerliste, auslöst
    @Override
    public void benachrichtigen() {
        for (Observer observer : observerListe) {
            observer.update(temperatur, luftfeuchtigkeit);
        }
    }
}

