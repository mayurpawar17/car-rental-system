public class Customer {
    private String name;
    private String customerId;

    public Customer(String customerName, String customerId) {
        this.name = customerName;
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }
}
