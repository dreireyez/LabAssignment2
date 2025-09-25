// Client
public class SmartHomeApp {
    public static void main(String[] args) {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        Speaker speaker = new Speaker();
        MusicPlayer player = new MusicPlayer();

        SmartHub smartHub = new SmartHub();

        // Light Commands
        smartHub.setCommand(new TurnOn(light));
        System.out.println(smartHub.confirmCommand());

        smartHub.setCommand(new TurnOff(light));
        System.out.println(smartHub.confirmCommand());

        // Thermostat Commands
        smartHub.setCommand(new TurnOn(thermostat));
        System.out.println(smartHub.confirmCommand());

        smartHub.setCommand(new TurnOff(thermostat));
        System.out.println(smartHub.confirmCommand());

        smartHub.setCommand(new IncreaseTemp(thermostat));
        System.out.println(smartHub.confirmCommand());

        smartHub.setCommand(new DecreaseTemp(thermostat));
        System.out.println(smartHub.confirmCommand());

        // Speaker Commands
        smartHub.setCommand(new TurnOn(speaker));
        System.out.println(smartHub.confirmCommand());

        smartHub.setCommand(new TurnOff(speaker));
        System.out.println(smartHub.confirmCommand());

        smartHub.setCommand(new IncreaseVolume(speaker));
        System.out.println(smartHub.confirmCommand());

        smartHub.setCommand(new DecreaseVolume(speaker));
        System.out.println(smartHub.confirmCommand());

        // MusicPlayer Commands
        smartHub.setCommand(new TurnOn(player));
        System.out.println(smartHub.confirmCommand());

        smartHub.setCommand(new TurnOff(player));
        System.out.println(smartHub.confirmCommand());

        smartHub.setCommand(new PlayMusic(player));
        System.out.println(smartHub.confirmCommand());

        smartHub.setCommand(new PauseMusic(player));
        System.out.println(smartHub.confirmCommand());
    }
}
