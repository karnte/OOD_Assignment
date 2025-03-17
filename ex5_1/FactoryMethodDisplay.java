public class FactoryMethodDisplay {

    public static AutomobileDisplay getAutomobileDisplay(String carType){
        AutomobileDisplay display = null;
        switch (carType) {
            case "Ford":
                display = new FordDisplay();
                break;

            case "Toyota":
                display = new ToyotaDisplay();
                break;
        }

        if (display == null) {
            throw new ExceptionInInitializerError();
        }

        return display;
    }
}