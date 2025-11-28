package Command;

class ComputerOnCommand implements Command {
    private Computer computer;

    public ComputerOnCommand(Computer computer) {
        this.computer = computer;
    }

    public void execute() {
        computer.powerOn();
    }

    public void undo() {
        computer.powerOff();
    }
}
