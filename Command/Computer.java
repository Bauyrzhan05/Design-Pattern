package Command;

class Computer {
    private String name;

    public Computer(String name) {
        this.name = name;
    }

    public void powerOn() {
        System.out.println(name + " computer: Powering ON");
    }

    public void powerOff() {
        System.out.println(name + " computer: Powering OFF");
    }

    public void startBackup() {
        System.out.println(name + " computer: Starting backup process");
    }

    public void cancelBackup() {
        System.out.println(name + " computer: Canceling backup process");
    }

    public void openBrowser() {
        System.out.println(name + " computer: Opening web browser");
    }

    public void closeBrowser() {
        System.out.println(name + " computer: Closing web browser");
    }
}
