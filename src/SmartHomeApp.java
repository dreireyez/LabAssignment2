// Client
public class SmartHomeApp {
    public static void main(String[] args) {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        Speaker speaker = new Speaker();

        SmartHub smartHub = new SmartHub();

        // Light Commands
        smartHub.setCommand(new TurnOnLight(light));
        System.out.println(smartHub.confirmCommand());

        smartHub.setCommand(new TurnOffLight(light));
        System.out.println(smartHub.confirmCommand());

        // Thermostat Commands
        smartHub.setCommand(new IncreaseTemp(thermostat));
        System.out.println(smartHub.confirmCommand());

        smartHub.setCommand(new DecreaseTemp(thermostat));
        System.out.println(smartHub.confirmCommand());

        // TV Commands

        // Speaker Commands
        smartHub.setCommand(new IncreaseVolume(speaker));
        System.out.println(smartHub.confirmCommand());

        smartHub.setCommand(new DecreaseVolume(speaker));
        System.out.println(smartHub.confirmCommand());

    }
}
