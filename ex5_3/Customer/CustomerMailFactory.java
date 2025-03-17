package Customer;

public class CustomerMailFactory {
    public static Customer createCustomer(String customerType) {
        Customer output = null;
        switch (customerType) {
            case "Regular":
                output = new RegularCustomer();
                break;
            case "Mountain":
                output = new MountainCustomer();
                break;
            case "Delinquent":
                output = new DelinquentCustomer();
                break;
            default:
                throw new IllegalArgumentException("Invalid customer type: " + customerType);
        }
        return output;
    }
}