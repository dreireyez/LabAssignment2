public class Speaker implements Device {
    private int volume = 50;

    public String turnOn() {
        return "[Speaker] is ON";
    }

    public String turnOff() {
        return "[Speaker] is OFF";
    }

    public String increaseVolume() {
        volume++;
        return "[Speaker] Volume is set to " + volume;
    }

    public String decreaseVolume() {
        volume--;
        return "[Speaker] Volume is set to " + volume;
    }
}
