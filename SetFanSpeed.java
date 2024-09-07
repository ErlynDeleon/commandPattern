public class SetFanSpeed implements Command {
  private Fan fan;
  private int speed;

  public SetFanSpeed(Fan fan, int speed) {
      this.fan = fan;
      this.speed = speed;
  }

  @Override
  public void execute() {
      fan.setSpeed(speed);
  }
}