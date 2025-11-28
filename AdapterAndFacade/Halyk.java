package AdapterAndFacade;

public class Halyk implements PaymentProcessor {

    @Override
    public String pay(double amount) {
        amount += 10;
        return "Charged $" + amount + " via Halyk pay.";
    }
}

