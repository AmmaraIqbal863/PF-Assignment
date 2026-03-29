import java.util.Scanner;
public class Lab01{
    public static void main(String[]args){
         Scanner read= new Scanner(System.in);
         System.out.println("enter number"); 
         int a;
         a=read.nextInt();  
         int i;
         for(i=1;i<=10;i++)
            {
            System.out.println(a + "x" + i + "=" + (a*i));
        }        


    }
}