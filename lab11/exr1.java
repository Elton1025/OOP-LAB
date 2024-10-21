import java.util.Scanner;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Thread using Runnable interface is running.");
            Thread.sleep(10000); 
            System.out.println("Thread using Runnable interface has ended.");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Thread extending Thread class is running.");
            Thread.sleep(10000); 
            System.out.println("Thread extending Thread class has ended.");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}

public class exr1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create thread using Runnable interface");
            System.out.println("2. Create thread by extending Thread class");
            System.out.println("3. Exit");

            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Thread runnableThread = new Thread(new MyRunnable());
                    runnableThread.start();
                    break;
                case 2:
                    Thread thread = new MyThread();
                    thread.start();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}