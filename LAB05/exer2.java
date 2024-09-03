
import java.util.Scanner;
class Employee {

    String name,city;
    float salary,da,hra,total;
    void getdata(String n,String c,float s,float d,float h) {
        name=n;
        city=c;
        salary=s;
        da=d;
        hra=h;
    }
    void calculate() {
        total=salary+((salary*da)/100)+((salary*hra)/100);
    }
    void display() {
        System.out.println("Total salary is:"+total);
    }
}

class exer2 {
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name,city, basic salary, DA and HRA");
        String name=sc.nextLine();
        String city=sc.nextLine();
        float basic = sc.nextFloat();
        float da=sc.nextFloat();
        float hra = sc.nextFloat();
        Employee e1=new Employee();
        e1.getdata(name,city,basic,da,hra);
        e1.calculate();
        e1.display();
        sc.close();
    }
}