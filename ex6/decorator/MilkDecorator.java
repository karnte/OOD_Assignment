public class MilkDecorator extends ToppingDecorator {
    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }
    
    @Override
    public int getCost() {
        return beverage.getCost() + 8;
    }
    
    @Override
    public String getDescription() {
        return beverage.getDescription() + "milk ";
    }
}