public class MusicPlayer implements Device {

    @Override
    public String turnOn() {
        return "[Music Player] is ON";
    }

    @Override
    public String turnOff() {
        return "[Music Player] is OFF";
    }

    public String playMusic() {
        return "[Music Player] is playing a song";
    }

    public String pauseMusic() {
        return "[Music Player] is pausing a song";
    }
}
