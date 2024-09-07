public class TurnOnSmartDevice implements Command{
  private SmartDeviceApp smartDeviceApp;

    public TurnOnSmartDevice(SmartDeviceApp smartDeviceApp){
        this.smartDeviceApp = smartDeviceApp;
    }
    @Override
    public void execute() {
        smartDeviceApp.turnOn();
    }
}
