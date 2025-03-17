public class App {
    public static void main(String[] args) {
        // Create the subject
        ScoreSubject scoreSubject = new ScoreSubject();
        
        // Create and register observers
        ScoreReporter reporter1 = new ScoreReporter("Reporter 1");
        ScoreReporter reporter2 = new ScoreReporter("Reporter 2");
        
        scoreSubject.registerObserver(reporter1);
        scoreSubject.registerObserver(reporter2);
        
        // User input loop
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String input;
        
        while (true) {
            System.out.print("Enter Score: ");
            input = scanner.nextLine();
            if (input.isEmpty()) {
                break; // Exit on empty input
            }
            scoreSubject.setScore(input);
        }
        
        scanner.close();
        System.out.println("Program ended.");
    }
}