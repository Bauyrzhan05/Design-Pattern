package Observer;

class Customer implements Observer {
    private String customerName;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void update(String productName, int quantity) {
        if (quantity > 50) {
            System.out.println(" Customer: " + customerName + " " + productName + " is BIG SALE!");
        }
    }
}
