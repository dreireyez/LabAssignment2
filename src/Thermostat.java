// Receiver
public class Thermostat implements Device {
    private int temp = 22;

    public String turnOn() {
        return "[Thermostat] is ON]";
    }

    public String turnOff() {
        return "[Thermostat] is OFF]";
    }

    public String increaseTemp() {
        temp++;
        return "[Thermostat] Temperature is set to " + temp + "°C";
    }

    public String decreaseTemp() {
        temp--;
        return "[Thermostat] Temperature is set to " + temp + "°C";
    }
}
