public class SetMusicPlayer implements Command {
  private MusicPlayer musicPlayer;
  private int volumeLevel;

  public SetMusicPlayer(MusicPlayer musicPlayer, int volumeLevel) {
      this.musicPlayer = musicPlayer;
      this.volumeLevel = volumeLevel;
  }

  @Override
  public void execute() {
      musicPlayer.setVolume(volumeLevel);
  }
}
