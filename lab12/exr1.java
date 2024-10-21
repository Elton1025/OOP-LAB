import java.util.Arrays;
import java.util.Scanner;

public class exr1 {

    public static <T> void exchangeElements(T[] array, int index1, int index2) {
        if (array == null || index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            throw new IllegalArgumentException("Invalid input: array cannot be null, and indices must be within the array bounds.");
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage with Integer array
        Integer[] numbers = new Integer[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(numbers));

        System.out.println("Enter the index of the first element to exchange:");
        int index1 = scanner.nextInt();
        System.out.println("Enter the index of the second element to exchange:");
        int index2 = scanner.nextInt();

        exchangeElements(numbers, index1, index2);
        System.out.println("Modified array: " + Arrays.toString(numbers));
    }
}