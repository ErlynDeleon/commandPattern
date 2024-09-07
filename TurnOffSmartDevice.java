public class TurnOffSmartDevice implements Command{
  private SmartDeviceApp smartDeviceApp;

    public TurnOffSmartDevice(SmartDeviceApp smartDeviceApp){
        this.smartDeviceApp = smartDeviceApp;
    }
    @Override
    public void execute() {
        smartDeviceApp.turnOff();
    }
} 
