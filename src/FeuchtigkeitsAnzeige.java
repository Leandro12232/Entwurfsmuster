import Interfaces.Observer;

public class FeuchtigkeitsAnzeige implements Observer {
    private float luftfeuchtigkeit;

    @Override
    public void update(float temperatur, float luftfeuchtigkeit) {
        this.luftfeuchtigkeit = luftfeuchtigkeit;
        anzeigen();
    }

    private void anzeigen() {
        System.out.println("Aktuelle Luftfeuchtigkeit: " + luftfeuchtigkeit + " %");
    }
}

