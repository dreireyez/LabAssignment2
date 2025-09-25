public class Speaker {
    private int volume = 50;

    public String increaseVolume() {
        volume++;
        return "[Speaker] Volume is set to " + volume;
    }

    public String decreaseVolume() {
        volume--;
        return "[Speaker] Volume is set to " + volume;
    }
}
