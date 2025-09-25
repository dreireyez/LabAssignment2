public class PauseMusic implements Command {
    private MusicPlayer player;

    public PauseMusic(MusicPlayer player) {
        this.player = player;
    }

    @Override
    public String execute() {
        return player.pauseMusic();
    }

}
