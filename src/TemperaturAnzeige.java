import Interfaces.Observer;

public class TemperaturAnzeige implements Observer {
    private float temperatur;

    @Override
    public void update(float temperatur, float luftfeuchtigkeit) {
        this.temperatur = temperatur;
        anzeigen();
    }

    private void anzeigen() {
        System.out.println("Aktuelle Temperatur: " + temperatur + " °C");
    }
}
