import java.util.Scanner;

public class TemperatureCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the current temperature?");

        int choice = scanner.nextInt();

        if (choice > 30) {
            System.out.println("It's Hot.");
        } else if (choice > 20 && choice < 30) {
            System.out.println("It's warm");
        } else if(choice > 10 && choice < 20){
            System .out.println("It's cool.");
        } else {
            System.out.println("It's cold.");
        }
    }
}

