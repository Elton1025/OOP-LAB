import java.util.Scanner;

class calculator {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        do {
        System.out.println("Enter a number, operator and another number:");
        float a = sc.nextFloat();
        char o = sc.next().charAt(0);
        float b= sc.nextFloat();

        switch(o) {
            case '+':
                System.out.println(a+"+"+b+"="+(a+b));
                break;


            case '-':
                System.out.println(a+"-"+b+"="+(a-b));
                break;

            case '*':
                System.out.println(a+"*"+b+"="+(a*b));
                break;
            case '/':
                System.out.println(a+"/"+b+"="+(a/b));
                break;


        }
        
        System.out.println("Enter y for another calculation and n for exit: ");
        char c=sc.next().charAt(0);
        if(c=='n') {
            break;
        }
        } while(true);

        sc.close();
    }
}