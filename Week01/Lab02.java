import java.util.Scanner;
public class Lab02{
    public static void main(String[]args){
         Scanner read= new Scanner(System.in);
         System.out.println("enter number"); 
         int a;
         a=read.nextInt();  
         int sum=0;
         while(a!=0)
         {
            sum=sum+(a%10);
            a=a/10;

         }
            System.out.println("Sum of entered numbers " + sum);
                


    }
}