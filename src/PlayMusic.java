public class PlayMusic implements Command {
    private MusicPlayer player;

    public PlayMusic(MusicPlayer player) {
        this.player = player;
    }

    @Override
    public String execute() {
        return player.playMusic();
    }
}
