import java.util.Scanner;

class Student_Detail {
    String name;
    int id;
    String college_name = "MIT";

    public Student_Detail(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void display_details() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("College Name: " + college_name);
    }
}

public class exer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int numStudents = scanner.nextInt();
        scanner.nextLine();

        Student_Detail[] students = new Student_Detail[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.println("Enter name:");
            String name = scanner.nextLine();
            System.out.println("Enter ID:");
            int id = scanner.nextInt();
            scanner.nextLine();

            students[i] = new Student_Detail(name, id);
        }

        System.out.println("\nStudent Details:");
        for (Student_Detail student : students) {
            student.display_details();
            System.out.println("--------------------");
        }
    }
}