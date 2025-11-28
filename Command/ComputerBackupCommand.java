package Command;

public class ComputerBackupCommand implements Command{
    private Computer computer;

    public ComputerBackupCommand(Computer computer) {
        this.computer = computer;
    }

    public void execute() {
        computer.startBackup();
    }

    public void undo() {
        computer.cancelBackup();
    }
}
