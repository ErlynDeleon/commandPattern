public class Thermostat implements SmartDeviceApp {
  private int temperature;

  @Override
  public void turnOn() {
      System.out.println("Thermostat turned on.");
  }

  @Override
  public void turnOff() {
      System.out.println("Thermostat turned off.");
  }

  public void setTemperature(int temperature) {
      this.temperature = temperature;
      System.out.println("Thermostat temperature set to " + temperature);
  }
}

