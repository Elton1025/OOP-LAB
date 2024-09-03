import java.util.Scanner;

class exr4 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of rows and columns for matrix 1:");
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println("Enter Matrix 1:");
        int[][] arr1=new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                arr1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter number of rows and columns for matrix 2:");
        int p=sc.nextInt();
        int q=sc.nextInt();
        System.out.println("Enter Matrix 2:");
        int[][] arr2=new int[p][q];
        for(int i=0;i<p;i++) {
            for(int j=0;j<q;j++) {
                arr2[i][j]=sc.nextInt();
            }
        }

        if(n==p && m==q) {
            int[][] sum=new int[n][m];
            System.out.println("Sum:");
            for(int i=0;i<n;i++) {
                for(int j=0;j<m;j++) {
                    sum[i][j]=arr1[i][j]+arr2[i][j];
                    System.out.print(sum[i][j]+" ");
                }
                System.out.println();
            }
            
        }
        else {
            System.out.println("Matrix addition not possible");
        }

        if(m==p) {
            int[][] mul=new int[n][q];
            
                for(int i=0;i<n;i++) {
                    for(int j=0;j<q;j++) {
                        mul[i][j]=0;
                        for(int k=0;k<m;k++) {
                            mul[i][j]+=arr1[i][k]*arr2[k][j];
                        }
                        
                    }
                }
        
            System.out.println("Multiplication:");
            for(int i=0;i<n;i++) {
                for(int j=0;j<q;j++) {
                    System.out.print(mul[i][j]+" ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("matrix multiplication not possible");
        }



        sc.close();

    }
}