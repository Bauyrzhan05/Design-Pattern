package Command;

public class Router {
    private String name;

    public Router(String name) {
        this.name = name;
    }

    public void powerOn() {
        System.out.println(name + " router: Powering ON");
    }

    public void powerOff() {
        System.out.println(name + " router: Powering OFF");
    }

    public void enableWifi() {
        System.out.println(name + " router: Enabling WiFi");
    }

    public void disableWifi() {
        System.out.println(name + " router: Disabling WiFi");
    }

    public void enableSecurityMode() {
        System.out.println(name + " router: Enabling Security Mode");
    }

    public void disableSecurityMode() {
        System.out.println(name + " router: Disabling Security Mode");
    }
}
