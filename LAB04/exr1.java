import java.util.Scanner;


class exr1 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of square matrix:");
        int n=sc.nextInt();
        int[][] arr= new int[n][n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        int sum=0;

        for(int i=0;i<n;i++) {
            for(int j=(n-1-i);j<n;) {
                
                    System.out.print(arr[i][j]+" ");
                    sum=sum+arr[i][j];
                    break;
                

            }
            System.out.println();
        }
        System.out.println("Sum is:"+sum);
        sc.close();
    }
}