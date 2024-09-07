public class Light implements SmartDeviceApp{
  private int brightness;

  @Override
  public void turnOn() {
      System.out.println("Light turned on.");
  }

  @Override
  public void turnOff() {
      System.out.println("Light turned off.");
  }

  public void setBrightness(int level) {
    this.brightness = level;
    System.out.println("Light brightness set to " + level);
}

}