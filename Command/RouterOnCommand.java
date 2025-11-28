package Command;

public class RouterOnCommand implements Command {
    private Router router;

    public RouterOnCommand(Router router) {
        this.router = router;
    }

    public void execute() {
        router.powerOn();
    }

    public void undo() {
        router.powerOff();
    }
}
