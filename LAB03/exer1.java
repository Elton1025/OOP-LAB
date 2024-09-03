import java.util.*;

class exer1 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        int temp=a;
        int m=a;
        int t=a;
        int sum=0;
        int i=0;
        while(m>0) {
            m=m/10;
            i++;
            if(m<10) {
                i++;
                break;
            }
            
        }
        
        
        while (a>0) {
            t=a%10;
            sum=sum+(int)Math.pow(t,i);
            a=a/10;
        }
        System.out.println("Sum="+sum);
        
        if(sum==temp) {
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("Not a Armstrong Number");
        }
        sc.close();
    }
}