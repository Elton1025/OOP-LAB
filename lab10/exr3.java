import java.util.Scanner;

public class exr3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter student's name:");
            String name = scanner.nextLine();

            System.out.println("Enter roll number:");
            int rollNumber = Integer.parseInt(scanner.nextLine()); 

            System.out.println("Enter marks in subject 1:");
            int marks1 = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter marks in subject 2:");
            int marks2 = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter marks in subject 3:");
            int marks3 = Integer.parseInt(scanner.nextLine());

            int totalMarks = marks1 + marks2 + marks3;
            double percentage = (double) totalMarks / 300 * 100;

            String grade = calculateGrade(percentage);

            System.out.println("\nStudent Details:");
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Percentage: " + percentage + "%");
            System.out.println("Grade: " + grade);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numbers for roll number and marks.");
        }
    }

    public static String calculateGrade(double percentage) {
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}