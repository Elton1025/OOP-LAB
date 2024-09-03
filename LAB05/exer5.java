
import java.util.Scanner;

class Number {
    double num;
    Number(double n) {
        num=n;
    }

    boolean isZero() {
        if(num==0) {
            return true;
        }
        return false;
    }

    boolean isPositive() {
        if(num>0) {
            return true;
        }
        return false;
    }
    boolean isNegative() {
        if(num<0) {
            return true;
        }
        return false;
    }
    boolean isOdd() {
        if(num%2!=0) {
            return true;
        }
        return false;
    }
    boolean isEven() {
        if(num%2==0) {
            return true;
        }
        return false;
    }
    boolean isPrime() {
        for (int i = 2; i <= num/2; i++) {
            if(num%i==0)
                return false;
        }
        return true;
    }
    boolean isArmstrong() {
        int temp=(int)num;
        int t=(int)num;
        int m=(int)num;
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
        
        
        while (num>0) {
            t=(int)num%10;
            sum=sum+(int)Math.pow(t,i);
            num=num/10;
        }
        System.out.println(sum);
        if(sum==temp) {
            return true;
        }
        else {
            return false;
        }
    }
}

class exer5 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        double n=sc.nextDouble();
        Number a=new Number(n);
        if(a.isZero()) {
            System.out.println("Number is Zero");
        }
        else {
            System.out.println("Not a Zero");
        }
        if(a.isPositive()) {
            System.out.println("Number is Positive");
        }
        if(a.isNegative()) {
            System.out.println("Number is Negative");
        }
        if(a.isOdd()) {
            System.out.println("Number is Odd");
        }
        if(a.isEven()) {
            System.out.println("Number is Even");
        }
        if(a.isPrime()) {
            System.out.println("Number is Prime number");
        }
        else {
            System.out.println("Numbe is not a prime number");
        }
        if(a.isArmstrong()) {
            System.out.println("Number is Armstrong");
        }
        else {
            System.out.println("Numbe is Not a Armstrong number");
        }
        


        sc.close();
    }
}