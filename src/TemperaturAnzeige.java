import Interfaces.Observer;

public class TemperaturAnzeige implements Observer {
    private float temperatur;

    //Methode, welche die Temperaturvariable auf die aktuelle Temperatur setzt
    @Override
    public void update(float temperatur, float luftfeuchtigkeit) {
        this.temperatur = temperatur;
        anzeigen();
    }

    //Methode zum Anzeigen der aktuellen Temperatur
    private void anzeigen() {
        System.out.println("Aktuelle Temperatur: " + temperatur + " °C");
    }
}
