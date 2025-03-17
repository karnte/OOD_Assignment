//concrete 
public class MountainCustomerFactory implements ICustomerFactory {
    private static MountainCustomerFactory factory = new MountainCustomerFactory();
        MountainCustomerFactory(){
    
        }
        public static MountainCustomerFactory getMountainCustomerFactory(){
            return factory;
    }
    @Override
    public ICustomerBrochure createCustomerBrochure() {
        return new MountainCustomerBrochure();
    }

    @Override
    public ICustomerMail createCustomerMail() {
        return new MountainCustomerMail();
    }


}
