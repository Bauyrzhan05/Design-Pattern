package Command;

public class RouterWifiCommand implements Command{
    private Router router;

    public RouterWifiCommand(Router router) {
        this.router = router;
    }

    public void execute() {
        router.enableWifi();
    }

    public void undo() {
        router.disableWifi();
    }
}
