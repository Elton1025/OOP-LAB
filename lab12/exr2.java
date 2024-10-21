class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

// Generic Stack class
class Stack<T> {
    private static final int MAX_SIZE = 100;
    private int top;
    private T[] array;

    public Stack() {
        top = -1;
        array = (T[]) new Object[MAX_SIZE];
    }

    public void push(T item) {
        if (top >= MAX_SIZE - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        array[++top] = item;
    }

    public T pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return null;
        }
        return array[top--];
    }

    public boolean isEmpty() {
        return top < 0;
    }
}

public class exr2 {
    public static void main(String[] args) {
        // Stack for Student objects
        Stack<Student> studentStack = new Stack<>();
        studentStack.push(new Student("Alice", 1));
        studentStack.push(new Student("Bob", 2));

        System.out.println("Student Stack:");
        while (!studentStack.isEmpty()) {
            System.out.println(studentStack.pop());
        }

        // Stack for Employee objects
        Stack<Employee> employeeStack = new Stack<>();
        employeeStack.push(new Employee("Charlie", 101));
        employeeStack.push(new Employee("David", 102));

        System.out.println("\nEmployee Stack:");
        while (!employeeStack.isEmpty()) {
            System.out.println(employeeStack.pop());
        }
    }
}