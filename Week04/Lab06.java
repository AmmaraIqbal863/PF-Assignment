 import java.util.Scanner;
public class Lab06{
    public static void main(String[]args){
         Scanner read= new Scanner(System.in);
         System.out.println("enter  table number"); 
         int a;
         a=read.nextInt();  
         System.out.println("enter range of table"); 
         int b;
         b=read.nextInt();
         multi(a,b);  
    }
    static void multi(int a,int b){    
            for(int i=1;i<=b;i++)
            {    
            System.out.println(a + "x" + i + "=" + (a*i));
            }


    }
}