package customer;

public class MountainCustomer extends Customer {

    // Complete this class
    @Override
    public String createMail() {
        return this.getClass().getName();
    }

}
