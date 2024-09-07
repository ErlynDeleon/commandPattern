public class SetLightBrightnessLevel implements Command {
  private Light light;
  private int level;

  public SetLightBrightnessLevel(Light light, int level) {
      this.light = light;
      this.level = level;
  }

  @Override
  public void execute() {
      light.setBrightness(level);
  }
}