package Command;

class ComputerBackupCancelCommand implements Command {
    private Computer computer;

    public ComputerBackupCancelCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.cancelBackup();
    }

    @Override
    public void undo() {
        computer.startBackup();
    }
}