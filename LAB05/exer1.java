

import java.util.Scanner;

class Box {
    double width;
    double height;
    double depth;
    Box(double w,double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width*height*depth;
    }
}
class exer1 {

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter height,width and depth:");
        double h,w,d;
        h=sc.nextDouble();
        w=sc.nextDouble();
        d=sc.nextDouble();
        Box b=new Box(h,w,d);

        double a = b.volume();
        System.out.println("Volume of the Box is:"+a);
        sc.close();
    }
}