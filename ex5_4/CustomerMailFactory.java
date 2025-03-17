//call factory method
public class CustomerMailFactory {
    public static ICustomerFactory createCustomer(String customerType) {
        switch (customerType) {
            case "Regular":
                return RegularCustomerFactory.getRegularCustomerFactory();
            case "Mountain":
                return MountainCustomerFactory.getMountainCustomerFactory();
            case "Delinquent":
                return DelinquentCustomerFactory.gDelinquentCustomerFactory();
            default:
                throw new IllegalArgumentException("Invalid customer type: " + customerType);
        }
    }
}
