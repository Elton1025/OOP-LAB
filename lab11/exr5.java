class Counter {
    private int count = 0;

    
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

    
    public void incrementWithBlock() {
        synchronized (this) {
            count++;
        }
    }
}

class MyThread1 extends Thread {
    private Counter counter;

    public MyThread1(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            counter.increment();
        }
    }
}

class MyThread2 extends Thread {
    private Counter counter;

    public MyThread2(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            counter.incrementWithBlock();
        }
    }
}

public class exr5 {

    public static void main(String[] args) {
        Counter counter = new Counter();

        
        MyThread1 thread1 = new MyThread1(counter);

        
        MyThread1 thread2 = new MyThread1(counter);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Count using synchronized method: " + counter.getCount());

        
        counter = new Counter();

        
        MyThread2 thread3 = new MyThread2(counter);

       
        MyThread2 thread4 = new MyThread2(counter);

        thread3.start();
        thread4.start();

        try {
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Count using synchronized block: " + counter.getCount());
    }
}