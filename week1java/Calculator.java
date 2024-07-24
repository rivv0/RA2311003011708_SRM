import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 for  + and 2 for - ");

        int choice = scanner.nextInt();
        System.out.println("Enter a number");
        int a = scanner.nextInt();
        System.out.println("Enter seconf number");
        int b = scanner.nextInt();

        if (choice == 1) {
            System.out.println(a + b);
        } else if (choice == 2) {
            System.out.println(a - b);
        } else {
            System.out.println("Invalid choice.");
        }
    }
}

