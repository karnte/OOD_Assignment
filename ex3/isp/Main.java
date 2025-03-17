public class Main {
    public static void main(String[] args) {
        System.out.println("Testing CEO functionalities:");
        CEO ceo = new CEO();
        ceo.addBonus();
        ceo.salary();
        ceo.makeDecisions();
        ceo.addStocks();
        
        System.out.println("\nTesting Manager functionalities:");
        Manager manager = new Manager();
        manager.salary();
        manager.hire();
        manager.train();
        manager.addBonus();
        
        System.out.println("\nTesting Employee functionalities:");
        Employee employee = new Employee();
        employee.salary();
    }
}