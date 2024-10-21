import java.util.Scanner;

public class exr5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows for the matrix:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns for the matrix:");
        int cols = scanner.nextInt();

        if (rows != cols) {
            System.out.println("Invalid matrix. It should be a square matrix (rows = columns).");
            return;
        }

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The entered matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matrix is valid.");
    }
}