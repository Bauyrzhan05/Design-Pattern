package Command;

public class RouterSecurityModeCommand implements Command {
    private Router router;

    public RouterSecurityModeCommand(Router router) {
        this.router = router;
    }

    public void execute() {
        router.enableSecurityMode();
    }

    public void undo() {
        router.disableSecurityMode();
    }
}
