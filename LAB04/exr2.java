import java.util.Scanner;

class exr2 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of matrix");
        int n=sc.nextInt();
            int[][] arr=new int[n][n];
            System.out.println("Enter Matrix Elements:");
            for(int i=0;i<n;i++) {
                for(int j=0;j<n;j++) {
                    arr[i][j]=sc.nextInt();
                }
            }
            int sum=0;
            for(int i=0;i<n;i++) {
                for(int j=0;j<n;j++) {
                    if(i==j) {
                        System.out.print(arr[i][j]+" ");
                        sum=sum+arr[i][j];
                    }
                }
                System.out.println();
            }
            System.out.println("Sum:"+sum);
        }   
}