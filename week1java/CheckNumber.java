import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number.");

        int choice = scanner.nextInt();

        if (choice > 0) {
            System.out.println("The numbe is positive.");
        } else if (choice < 0) {
            System.out.println("The number is negatice.");
        } else {
            System.out.println("It is 0.");
        }
    }
}

