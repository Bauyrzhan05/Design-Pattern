package AdapterAndFacade;

public class Payment {

    public String pay(PaylAPI api){
        api.amount += 10;
        return "Paid by Bank" + api.amount;
    }
}
