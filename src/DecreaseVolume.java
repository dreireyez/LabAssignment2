// Concrete Command
public class DecreaseVolume implements Command {
    private Speaker speaker;

    public DecreaseVolume(Speaker speaker) {
        this.speaker = speaker;
    }

    @Override
    public String execute() {
        return speaker.decreaseVolume();
    }
}
