public class exr4 {

    public static void main(String[] args) {
        
        Thread highPriorityThread = new Thread(() -> {
            try {
                System.out.println("High priority thread is running.");
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                System.out.println("High priority thread interrupted.");
            }
        });
        highPriorityThread.setPriority(Thread.MAX_PRIORITY);

        
        Thread normalPriorityThread = new Thread(() -> {
            try {
                System.out.println("Normal priority thread is running.");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Normal priority thread interrupted.");
            }
        });
        normalPriorityThread.setPriority(Thread.NORM_PRIORITY);

        
        highPriorityThread.start();
        normalPriorityThread.start();

        try {
            Thread.sleep(1000); 
            highPriorityThread.interrupt(); 
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
    }
}