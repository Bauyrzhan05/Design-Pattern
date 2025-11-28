package Command;

public class ComputerBrowserCommand implements Command{
    private Computer computer;

    public ComputerBrowserCommand(Computer computer) {
        this.computer = computer;
    }

    public void execute() {
        computer.openBrowser();
    }

    public void undo() {
        computer.closeBrowser();
    }
}
