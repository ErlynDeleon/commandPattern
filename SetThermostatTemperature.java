public class SetThermostatTemperature implements Command {
  private Thermostat thermostat;
  private int temperature;

  public SetThermostatTemperature(Thermostat thermostat, int temperature) {
      this.thermostat = thermostat;
      this.temperature = temperature;
  }

  @Override
  public void execute() {
      thermostat.setTemperature(temperature);
  }
}