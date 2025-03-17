//make this class a subclass of customer
public class DelinquentCustomerFactory implements ICustomerFactory {
    private static DelinquentCustomerFactory factory = new DelinquentCustomerFactory();
    
    DelinquentCustomerFactory(){

    }
    public static DelinquentCustomerFactory gDelinquentCustomerFactory(){
        return factory;
    }
    @Override
    public ICustomerMail createCustomerMail() {
       return new DelinquentCustomerMail();
    }

    @Override
    public ICustomerBrochure createCustomerBrochure() {
        return new DelinquentCustomerBrochure();
        
    }
    
}
