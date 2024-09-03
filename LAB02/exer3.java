import java.util.Scanner;

class exer3 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ener a number:");
        long a = sc.nextLong();

        long b= a<<1;
        long c= a>>1;
        System.out.println(a+" Multiply by 2: "+b);
        System.out.println(a+" Divide by 2: "+c);
        sc.close();
    }
}