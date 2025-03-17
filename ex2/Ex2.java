package ex2;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Ex2 {
    public static final int MAX = 5;

    public static void main(String[] args) {
        System.out.println("Welcome to the Application!");
        
        List<Integer> nums = getInput();
        Collections.sort(nums);
        displayNumbers(nums);
    }

    private static List<Integer> getInput() {
        Scanner inp = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        System.out.println("Enter 5 valid integers in the range [0, 10]");
        
        while (nums.size() < MAX) {
            String s = inp.nextLine();
            if (isValidNumber(s)) {
                int num = Integer.parseInt(s);
                if (isInRange(num)) {
                    nums.add(num);
                } else {
                    System.out.println("Invalid range! Try again!");
                }
            } else {
                System.out.println("Invalid! Try again!");
            }
        }
        inp.close();
        return nums;
    }

    private static boolean isValidNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private static boolean isInRange(int num) {
        return num >= 0 && num <= 10;
    }

    private static void displayNumbers(List<Integer> nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
