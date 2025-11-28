package Command;

class CloseBrowserCommand implements Command {
    private Computer computer;

    public CloseBrowserCommand(Computer computer) {
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
