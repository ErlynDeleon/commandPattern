public class CentralHub {
  public static void main(String[] args) {
    CentralHubRemote remote = new CentralHubRemote();

    //instances of SmartDeviceApp and commands objects
    SmartDeviceApp light = new Light();
    SmartDeviceApp fan = new Fan();
    SmartDeviceApp musicPlayer = new MusicPlayer();
    SmartDeviceApp thermostat = new Thermostat();
    
    //commands for controlling the light
    Command turnOnLight = new TurnOnSmartDevice(light);
    Command setLightBrightness = new SetLightBrightnessLevel((Light) light, 75);
    Command turnOffLight = new TurnOffSmartDevice(light);

    //execute commands for the light
    remote.setCommand(turnOnLight);
    remote.clickButton(); 

    remote.setCommand(setLightBrightness);
    remote.clickButton(); 

    remote.setCommand(turnOffLight);
    remote.clickButton(); 

    //commands for controlung the fan
    Command turnOnFan = new TurnOnSmartDevice(fan);
    Command setFanSpeed = new SetFanSpeed((Fan) fan, 3);
    Command turnOffFan = new TurnOffSmartDevice(fan);

    //execute commands fir the light
    remote.setCommand(turnOnFan);
    remote.clickButton(); 

    remote.setCommand(setFanSpeed);
    remote.clickButton(); 

    remote.setCommand(turnOffFan);
    remote.clickButton(); 

    //commands for controlling the thermostat
    Command turnOnThermostat = new TurnOnSmartDevice(thermostat);
    Command setThermostatTemperature = new SetThermostatTemperature((Thermostat) thermostat, 22);
    Command turnOffThermostat = new TurnOffSmartDevice(thermostat);

  //execute commands fir the thermostat
    remote.setCommand(turnOnThermostat);
    remote.clickButton(); 

    remote.setCommand(setThermostatTemperature);
    remote.clickButton(); 

    remote.setCommand(turnOffThermostat);
    remote.clickButton(); 
    
    //commands for controlling the music player
    Command turnOnMusicPlayer = new TurnOnSmartDevice(musicPlayer);
    Command setMusicPlayerVolume = new SetMusicPlayer((MusicPlayer) musicPlayer, 50);
    Command playMusic = new Command() {
      @Override
      public void execute() {
        ((MusicPlayer) musicPlayer).playMusic("Happy Birthday");
      }
  };
    Command turnOffMusicPlayer = new TurnOffSmartDevice(musicPlayer);

    //execute commands for controlling the music player
    remote.setCommand(turnOnMusicPlayer);
    remote.clickButton(); 

    remote.setCommand(setMusicPlayerVolume);
    remote.clickButton(); 

    remote.setCommand(playMusic);
    remote.clickButton(); 

    remote.setCommand(turnOffMusicPlayer);
    remote.clickButton(); 

    
    










    

}
}