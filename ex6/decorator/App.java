
public class App {
	public static void main(String[] args) {
		Beverage plainBeverage = new PlainBeverage();
        System.out.println("You order " + plainBeverage.getDescription());
        System.out.println("The cost is " + plainBeverage.getCost());
        
        // Beverage with milk and 2 sugars
        Beverage decoratedBeverage = new PlainBeverage();
        decoratedBeverage = new MilkDecorator(decoratedBeverage);
        decoratedBeverage = new SugarDecorator(decoratedBeverage);
        decoratedBeverage = new SugarDecorator(decoratedBeverage);
        System.out.println("You order " + decoratedBeverage.getDescription());
        System.out.println("The cost is " + decoratedBeverage.getCost());
	}
}
