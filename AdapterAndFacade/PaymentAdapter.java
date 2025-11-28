package AdapterAndFacade;

public class PaymentAdapter implements PaymentProcessor {
    private  Payment payment = new Payment();

    @Override
    public String pay(double amount) {
        PaylAPI api = new PaylAPI(amount);
        return payment.pay(api);
    }
}

