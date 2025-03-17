//concrete Fact1
public class RegularCustomerFactory implements ICustomerFactory {
    private static RegularCustomerFactory factory = new RegularCustomerFactory();
    
    private RegularCustomerFactory(){

    }

    public static RegularCustomerFactory getRegularCustomerFactory(){
        return factory;
    }
    @Override
    public ICustomerBrochure createCustomerBrochure() {
        return new RegularCustomerBrochure();
    }
    @Override
    public ICustomerMail createCustomerMail() {
        return new RegularCustomerMail();
    }
    
}
