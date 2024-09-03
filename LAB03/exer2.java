import java.util.Scanner;

class exer2 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        for(int i=1;i<=a;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        int b[]= new int[a];
        for(int i=0;i<a;i++) {
            b[i]=(i+1);
        }
        for(int i:b) {
            int t=i;
            while(t>0) {
                System.out.print(i);
                t--;
            }
            System.out.println();
        }
        sc.close();
    }
}