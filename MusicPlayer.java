public class MusicPlayer implements SmartDeviceApp {
  private int volume;

  @Override
  public void turnOn() {
      System.out.println("Music player turned on.");
  }

  @Override
  public void turnOff() {
      System.out.println("Music player turned off.");
  }

  public void setVolume(int level) {
    this.volume = level;
    System.out.println("Music player volume set to " + level);
}

public void playMusic(String playlist) {
    System.out.println("Playing playlist " + playlist);
}
}