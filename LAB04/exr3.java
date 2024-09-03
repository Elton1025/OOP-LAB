import java.util.Scanner;

class exr3 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of rows and columns:");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=1;
        int[][] arr=new int[n][m];
        int[][] trp=new int[n][m];
        if(n==m) {
            System.out.println("Enter Matrix Elements:");
            for(int i=0;i<n;i++) {
                for(int j=0;j<m;j++) {
                    arr[i][j]=sc.nextInt();
                }
            }

            for(int i=0;i<n;i++) {
                for(int j=0;j<m;j++) {
                   // if(i!=j) {
                        trp[i][j]=arr[j][i];
                    //}
                }
            }
            label: for(int i=0;i<n;i++) {
                for(int j=0;j<m;j++) {
                    if(trp[i][j]!=arr[i][j]) {
                        k=0;
                        break label;
                    }
                }
            }
            System.out.println("Transpose Matrix:");
            for(int i=0;i<n;i++) {
                for(int j=0;j<m;j++) {
                    System.out.print(trp[i][j]+" ");
                }
                System.out.println();
            }

        }
        else {
            k=0;
        }
        if(k==1) {
            System.out.println("Symmetric matrix");

        }
        else {
            System.out.println("Non Symmetric matrix");
        }
        sc.close();
    }
}