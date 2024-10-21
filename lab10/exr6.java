import java.util.Scanner;

public class exr6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a negative number:");
            double number = Double.parseDouble(scanner.nextLine());

            if (number >= 0) {
                System.out.println("Invalid input. Please enter a negative number.");
            } else {
                double root = Math.sqrt(-number); 
                System.out.println("The square root of " + number + " is " + root + "i");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }
}