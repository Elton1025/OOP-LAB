import java.util.Scanner;

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

public class exr4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a positive number:");
            int number = Integer.parseInt(scanner.nextLine());

            if (number <= 0) {
                throw new InvalidInputException("Invalid input: Number must be positive.");
            }

            System.out.println("The number is: " + number);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }
    }
}