import Interfaces.Observer;

public class FeuchtigkeitsAnzeige implements Observer {
    private float luftfeuchtigkeit;

    //Methode, welche die Luftfeuchtigkeitsvariable auf die aktuelle Luftfeuchtigkeit setzt
    @Override
    public void update(float temperatur, float luftfeuchtigkeit) {
        this.luftfeuchtigkeit = luftfeuchtigkeit;
        anzeigen();
    }

    //Methode zum Anzeigen der aktuellen Luftfeuchtigkeit
    private void anzeigen() {
        System.out.println("Aktuelle Luftfeuchtigkeit: " + luftfeuchtigkeit + " %");
    }
}

