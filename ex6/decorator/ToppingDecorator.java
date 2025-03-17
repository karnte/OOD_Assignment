public abstract class ToppingDecorator implements Beverage {
    protected Beverage beverage;
    
    public ToppingDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}