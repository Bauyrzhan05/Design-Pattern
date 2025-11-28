package Command;



class disableWifiCommand implements Command {
    private Computer computer;

    public disableWifiCommand(Computer computer) {
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