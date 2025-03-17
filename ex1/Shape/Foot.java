package Shape;

import java.util.Scanner;

public class Foot {
    private FootShape shape;

    public Foot() {
        this.shape = new FootShape();
    }

    public static void main(String[] args) {
        Foot foot = new Foot();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("What to draw? 1. Ellipse, 2. Rectangle");
            int choice = scanner.nextInt();
            if (choice == 1 || choice == 2) {
                foot.draw(choice);
                break;
            } else {
                System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }
    }

    public void draw(int choice) {
        switch (choice) {
            case 1:
                System.out.println(shape.drawAsEllipse());
                break;
            case 2:
                System.out.println(shape.drawAsRectangle());
                break;
        }
    }
}