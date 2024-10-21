import java.util.Scanner;

public class exr1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        String inputString = scanner.nextLine();

        try {
            int number = Integer.parseInt(inputString);
            System.out.println("The number is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}