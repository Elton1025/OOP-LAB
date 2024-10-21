import java.util.Scanner;

public class exr2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5]; 

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            try {
                numbers[i] = scanner.nextInt();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array overflow! You cannot enter more than 5 numbers.");
                break; 
            }
        }

        System.out.println("The numbers you entered are:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}