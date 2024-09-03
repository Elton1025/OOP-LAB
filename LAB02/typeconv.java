import java.util.Scanner;

class typeconv {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a integer,double and char:");
        int a = Integer.parseInt(sc.next());
        double b = sc.nextDouble();
        char c = sc.next().charAt(0);
        
        byte d=(byte)a;
        int e =(int)c;
        byte f=(byte)b;
        System.out.println("Int to Byte:"+d);
        System.out.println("Char to Int:"+e);
        System.out.println("Double to Byte:"+f);
        sc.close();
    }
}