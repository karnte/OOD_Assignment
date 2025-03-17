public class SugarDecorator extends ToppingDecorator {
    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }
    
    @Override
    public int getCost() {
        return beverage.getCost() + 1;
    }
    
    @Override
    public String getDescription() {
        return beverage.getDescription() + "sugar ";
    }
}