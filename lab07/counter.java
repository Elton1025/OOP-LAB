class Counter {
    static int count = 0; 

    public Counter() {
        count++; 
    }

    public static void main(String[] args) {
        
        Counter object1 = new Counter();
        Counter object2 = new Counter();
        Counter object3 = new Counter();

        System.out.println("Number of objects created: " + Counter.count);
    }
}