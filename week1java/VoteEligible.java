import java.util.Scanner;

public class VoteEligible {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter an integer
        System.out.print("Enter the age: ");
        int number = scanner.nextInt();
        
        // Check if the number is even or odd
        if (number >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You arent eligible to vote.");
        }
        
        // Close the scanner
        scanner.close();
    }
}

