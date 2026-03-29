import java.util.Scanner;
public class Lab03{
    public static void main(String[]args){ 
        Scanner read= new Scanner(System.in);
        System.out.println("Enter numbers");  
        int[][] a=new int[3][3];
        int[][] b=new int[3][3];
        int[][] c=new int[3][3];
        int i=0;
        int j=0;
          for(i=0;i<3;i++){
            System.out.println("Enter numbers of " + (i+1) + "  row of first matrix");
                for(j=0;j<3;j++){
                    a[i][j]=read.nextInt();
                }
         }
         for(i=0;i<3;i++){
            System.out.println("Enter numbers of " + (i+1) + "  row of second matrix");
                for(j=0;j<3;j++){
                    b[i][j]=read.nextInt();
                }
         }
        for(i=0;i<3;i++){
            System.out.println("\n");
                for(j=0;j<3;j++){
                    c[i][j]=a[i][j]+b[i][j];
                     System.out.print(c[i][j]);
                    System.out.print("   ");

                     }
         }

    }
}