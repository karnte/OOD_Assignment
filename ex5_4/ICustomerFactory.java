//abstract Factory
public interface ICustomerFactory {
    ICustomerMail createCustomerMail();
    ICustomerBrochure createCustomerBrochure();

}
