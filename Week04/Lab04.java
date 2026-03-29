import java.util.Scanner;
public class Lab04{
    public static void main(String[]args){
        Scanner read= new Scanner(System.in);
         int a;
         System.out.println("Enter number ");
         a=read.nextInt();
         boolean result= check(a);
          if(result)
         System.out.println("Prime number");
        else
            System.out.println("not prime number");

    }
     static boolean check(int  a){ 
        if(a<=1)
            return false; 
        for(int i=2;i<a;i++){
                if(a%i==0)
                return false;
            }
        return true;

    } 
}
