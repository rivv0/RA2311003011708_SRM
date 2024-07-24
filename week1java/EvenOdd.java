import java.util.Scanner;

public class VoteEligible {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        if (number >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You arenot eligible to vote");
        }
        
        
        scanner.close();
    }
}

