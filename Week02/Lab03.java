import java.util.Scanner;
public class Lab03{
    public static void main(String[]args){
         Scanner read= new Scanner(System.in);
         System.out.println("enter number"); 
         int n;
         n=read.nextInt();  
         int sum=0;
         if(n>0){
         while(true)
         {
            sum=sum+n;
            n=read.nextInt();
            if(n==0)
               break;

         }
        }
          System.out.println(sum);
      


    }
}