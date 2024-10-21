import java.util.Scanner;

class Student {
    int regNo;
    String name;
    int age;

    public Student(int regNo, String name, int age) {
        this.regNo = regNo;
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Registration Number: " + regNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class UGStudent extends Student {
    int semester;
    double fees;

    public UGStudent(int regNo, String name, int age, int semester, double fees) {
        super(regNo, name, age);
        this.semester = semester;
        this.fees = fees;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Semester: " + semester);
        System.out.println("Fees: " + fees);
    }
}

class PGStudent extends Student {
    int semester;
    double fees;

    public PGStudent(int regNo, String name, int age, int semester, double fees) {
        super(regNo, name, age);
        this.semester = semester;
        this.fees = fees;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Semester: " + semester);
        System.out.println("Fees: " + fees);
    }
}

public class exer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final int MAX_STUDENTS = 100;
        UGStudent[] ugStudents = new UGStudent[MAX_STUDENTS];
        PGStudent[] pgStudents = new PGStudent[MAX_STUDENTS];
        int ugCount = 0; 
        int pgCount = 0; 

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add UG Student");
            System.out.println("2. Add PG Student");
            System.out.println("3. Display UG Students");
            System.out.println("4. Display PG Students");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    if (ugCount < MAX_STUDENTS) {
                        System.out.println("Enter registration number:");
                        int regNo = scanner.nextInt();
                        scanner.nextLine(); 
                        System.out.println("Enter name:");
                        String name = scanner.nextLine();
                        System.out.println("Enter age:");
                        int age = scanner.nextInt();
                        System.out.println("Enter semester:");
                        int semester = scanner.nextInt();
                        System.out.println("Enter fees:");
                        double fees = scanner.nextDouble();
                        ugStudents[ugCount++] = new UGStudent(regNo, name, age, semester, fees);
                    } else {
                        System.out.println("Maximum limit of UG students reached.");
                    }
                    break;
                case 2:
                    if (pgCount < MAX_STUDENTS) {
                        System.out.println("Enter registration number:");
                        int regNo = scanner.nextInt();
                        scanner.nextLine(); 
                        System.out.println("Enter name:");
                        String name = scanner.nextLine();
                        System.out.println("Enter age:");
                        int age = scanner.nextInt();
                        System.out.println("Enter semester:");
                        int semester = scanner.nextInt();
                        System.out.println("Enter fees:");
                        double fees = scanner.nextDouble();
                        pgStudents[pgCount++] = new PGStudent(regNo, name, age, semester, fees);
                    } else {
                        System.out.println("Maximum limit of PG students reached.");
                    }
                    break;
                case 3:
                    System.out.println("\nUG Students:");
                    for (int i = 0; i < ugCount; i++) {
                        ugStudents[i].displayDetails();
                        System.out.println("--------------------");
                    }
                    System.out.println("Total UG Admissions: " + ugCount);
                    break;
                case 4:
                    System.out.println("\nPG Students:");
                    for (int i = 0; i < pgCount; i++) {
                        pgStudents[i].displayDetails();
                        System.out.println("--------------------");
                    }
                    System.out.println("Total PG Admissions: " + pgCount);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}