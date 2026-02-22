import java.util.Scanner;
public class Lab02{
    public static void main(String[]args){ 
        Scanner read= new Scanner(System.in);
        System.out.println("Enter numbers");  
        int[][] a=new int[3][3];
        int[][] transpose=new int[3][3];
        int i=0;
        int j=0;
          for(i=0;i<3;i++){
            System.out.println("Enter numbers of " + (i+1) + "  row of  matrix");
                for(j=0;j<3;j++){
                    a[i][j]=read.nextInt();
                }
         }
        for(i=0;i<3;i++){
                for(j=0;j<3;j++){
                    transpose[j][i]=a[i][j];

                     }
         }
         for(j=0;j<3;j++){
            System.out.println("\n");
                for(i=0;i<3;i++){
                     System.out.print(transpose[j ][i]);
                    System.out.print("   ");

                     }
         }

    }
}