package AdapterAndFacade;

public class PaymentFacade {
    private PaymentProcessor processor;

    public void setPaymentProcessor(PaymentProcessor processor) {
        this.processor = processor;
    }

    public void makePayment(double amount) {
        String result = processor.pay(amount);
        System.out.println(result);
    }
}

