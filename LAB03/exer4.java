import java.util.Scanner;
class exer4 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements in the array:");
        int n=sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        int s;
        System.out.println("Enter element to be searched:");
        s=sc.nextInt();
        int j=0;
        System.out.print("The value is found at location: ");
        for(int i:a) {
            if(i==s) {
                System.out.print("a["+j+"] ");
            }
            j++;
        }
        sc.close();
    }
    
}