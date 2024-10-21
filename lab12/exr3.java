class Node<T> {
    public T data;
    public Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class GenericList<T> {
    private Node<T> head;

    public GenericList() {
        head = null;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class exr3 {
    public static void main(String[] args) {
        // Integer List
        GenericList<Integer> integerList = new GenericList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        System.out.println("Integer List:");
        integerList.display();

        // Double List
        GenericList<Double> doubleList = new GenericList<>();
        doubleList.add(1.1);
        doubleList.add(2.2);
        doubleList.add(3.3);
        System.out.println("Double List:");
        doubleList.display();
    }
}