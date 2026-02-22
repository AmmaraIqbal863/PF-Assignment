import java.util.Scanner;
public class Lab04{
    public static void main(String[]args){ 
        Scanner read= new Scanner(System.in);
        System.out.println("Enter total number of subjects");
        int n;
        n=read.nextInt();  
        System.out.println("Enter scores");
        int[] Scores=new int[n];
          for(int i=0;i<n;i++){
                Scores[i]=read.nextInt();
          }
          int sum=0;
          int j;
          for(j=0;j<n;j++){
            sum=sum+Scores[j];
          }
          int avg;
          avg=sum/n; 
          System.out.println("average: " + avg);     

    }
}