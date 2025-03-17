package Customer;
import java.util.Scanner;

public class CustomerMailApplication {
    private Customer customer;

    public CustomerMailApplication(Customer customer) {
        this.customer = customer;
    }

    public static String getCustomerTypeFromUser() {
        String customerType = null;
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent: ");
        int type = inp.nextInt();
        switch (type) {
            case 1:
                customerType = "Regular";
                break;
            case 2:
                customerType = "Mountain";
                break;
            case 3:
                customerType = "Delinquent";
                break;
            default:
                System.out.println("Invalid choice");
        }
        inp.close();
        return customerType;
    }

    public void displayCustomerInfo() {
        System.out.println(customer.createMail());
        System.out.println(customer.createBrochure());
    }

    public static void main(String[] args) {
        String customerType = getCustomerTypeFromUser();
        if (customerType != null) {
            Customer customer = CustomerMailFactory.createCustomer(customerType);
            CustomerMailApplication app = new CustomerMailApplication(customer);
            app.displayCustomerInfo();
        } else {
            System.out.println("No customer type selected.");
        }
    }
}
