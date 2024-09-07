public class Fan implements SmartDeviceApp {
  private int speed;

  @Override
  public void turnOn() {
      System.out.println("Fan turned on.");
  }

  @Override
  public void turnOff() {
      System.out.println("Fan turned off.");
  }

  public void setSpeed(int speed) {
      this.speed = speed;
      System.out.println("Fan speed set to " + speed);
  }
}
