public class TurnOff implements Command {
    private Device device;

    public TurnOff(Device device) {
        this.device = device;
    }

    @Override
    public String execute() {
        return device.turnOff();
    }
}
