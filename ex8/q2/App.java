public class App {
    public static void main(String[] args) {
        // Create CEO
        Employee ceo = new Employee("Settha", "CEO", 500000);
        
        // Create Head of Sales Department
        Employee headSales = new Employee("Kamphaka", "Head Sales", 300000);
        
        // Create Sales Department employees
        Employee sales1 = new Employee("Wiroj", "Sales", 150000);
        Employee sales2 = new Employee("Weeranan", "Sales", 100000);
        
        // Create Head of Marketing Department
        Employee headMarketing = new Employee("UngInk", "Head Marketing", 300000);
        
        // Create Marketing Department employees
        Employee marketing1 = new Employee("Oak", "Marketing", 200000);
        Employee marketing2 = new Employee("Aem", "Marketing", 250000);
        
        // Assign subordinates to Head of Sales
        headSales.addSubordinate(sales1);
        headSales.addSubordinate(sales2);
        
        // Assign subordinates to Head of Marketing
        headMarketing.addSubordinate(marketing1);
        headMarketing.addSubordinate(marketing2);
        
        // Assign department heads to CEO
        ceo.addSubordinate(headSales);
        ceo.addSubordinate(headMarketing);
        
        // Print all employees
        printAllEmployee(ceo);
    }
    
    public static void printAllEmployee(Employee employee) {
        // Print current employee information
        System.out.println(employee);
        
        // Print all subordinates
        for (Employee subordinate : employee.getSubordinates()) {
            printAllEmployee(subordinate);
        }
    }
}
