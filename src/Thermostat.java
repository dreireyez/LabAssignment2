// Receiver
public class Thermostat {
    private int temp = 22;

    public String increaseTemp() {
        temp++;
        return "[Thermostat] Temperature is set to " + temp + "°C";
    }

    public String decreaseTemp() {
        temp--;
        return "[Thermostat] Temperature is set to " + temp + "°C";
    }
}
