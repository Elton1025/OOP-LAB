import java.util.ArrayList;
import java.util.List;

public class exr4 {

    // Method with wildcard argument
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // List of Integers
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        // List of Doubles
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.1);
        doubleList.add(2.2);
        doubleList.add(3.3);

        // Using wildcard argument to print both lists
        System.out.println("Integer List:");
        printList(integerList);

        System.out.println("Double List:");
        printList(doubleList);
    }
}