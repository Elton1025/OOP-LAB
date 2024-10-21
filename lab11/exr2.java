import java.util.Random;

class Matrix {
    private int[][] data;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.data[i][j] = random.nextInt(100); 
            }
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public int getElement(int row, int col) {
        return data[row][col];
    }

    public void displayMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void displayTranspose() {
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(data[j][i] + " ");
            }
            System.out.println();
        }
    }

    public void displayMaxValue() {
        int max = data[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (data[i][j] > max) {
                    max = data[i][j];
                }
            }
        }
        System.out.println("Maximum value: " + max);
    }

    public void displayPrincipalDiagonal() {
        if (rows != cols) {
            System.out.println("Not a square matrix, no principal diagonal.");
            return;
        }
        for (int i = 0; i < rows; i++) {
            System.out.print(data[i][i] + " ");
        }
        System.out.println();
    }

    public void displayNonDiagonal() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i != j) {
                    System.out.print(data[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
class MatrixThread extends Thread {
    private Matrix matrix;
    private int operation;

    public MatrixThread(Matrix matrix, int operation) {
        this.matrix = matrix;
        this.operation = operation;
    }

    @Override
    public void run() {
        switch (operation) {
            case 1:
                matrix.displayMatrix();
                break;
            case 2:
                matrix.displayTranspose();
                break;
            case 3:
                matrix.displayMaxValue();
                break;
            case 4:
                matrix.displayPrincipalDiagonal();
                break;
            case 5:
                matrix.displayNonDiagonal();
                break;
        }
    }
}

public class exr2 {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(4, 4)
    
        Thread t1 = new MatrixThread(matrix, 1); 
        Thread t5 = new MatrixThread(matrix, 5); 
        Thread t2 = new MatrixThread(matrix, 2); 
        Thread t3 = new MatrixThread(matrix, 3); 
        Thread t4 = new MatrixThread(matrix, 4); 

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}