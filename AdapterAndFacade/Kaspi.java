package AdapterAndFacade;

public class Kaspi implements PaymentProcessor {
//    private KaspiKassa kaspi = new KaspiKassa();

    @Override
    public String pay(double amount) {
        amount += 10;
        return "Paid ₸" + amount + " via Kaspi.";
    }
}
