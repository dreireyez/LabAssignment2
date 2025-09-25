// Invoker
public class SmartHub {
    private Command command;

    public Command getCommand() {
        return command;
    }
    public void setCommand(Command command) {
        this.command = command;
    }
    public String confirmCommand() {
        return command.execute();
    }
}
