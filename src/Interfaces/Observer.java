package Interfaces;

public interface Observer {

    // Methode soll sowohl Temperatur als auch Luftfeuchtigkeit auf den aktuellen Wert setzen
    void update(float temperatur, float luftfeuchtigkeit);
}
