import java.util.Scanner;

class exer3 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter start and end for prime number:");
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(n<m) {
            System.out.println("Prime Numbers are:");
            for(int i=n;i<=m;i++) {
                if(prime(i)) {
                    System.out.print(i+" ");
                }
            }
        }
        sc.close();

    }
    static boolean prime(int a) {
        if(a<=1) {
            return false;   
        }
        for(int i=2;i<=(a/2);i++) {
            if((a%i)==0) {
                return false;
            }
        }
        return true;
    }

}