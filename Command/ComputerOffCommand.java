package Command;

public class ComputerOffCommand implements Command{
    private Computer computer;

    public ComputerOffCommand(Computer computer) {
        this.computer = computer;
    }

    public void execute() {
        computer.powerOff();
    }

    public void undo() {
        computer.powerOn();
    }
}
