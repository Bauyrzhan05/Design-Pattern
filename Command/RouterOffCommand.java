package Command;

public class RouterOffCommand implements Command {
    private Router router;

    public RouterOffCommand(Router router) {
        this.router = router;
    }

    public void execute() {
        router.powerOff();
    }

    public void undo() {
        router.powerOn();
    }
}
