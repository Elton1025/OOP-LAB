import java.util.Scanner;

class leap{
    public static void main(String[] args) {
        int year;
        
        System.out.println("Enter a year:");
        Scanner sc = new Scanner(System.in);

        year = sc.nextInt();

        sc.close();

        boolean isLeapYear;

        if(year%4!=0) isLeapYear = false;
        else if(year%100!=0) isLeapYear = true;
        else if(year%400!=0) isLeapYear = false;
        else isLeapYear = true;

        if(isLeapYear) System.out.println("Is Leap Year");
        else System.out.println("Not a leap Year.");
    }
}