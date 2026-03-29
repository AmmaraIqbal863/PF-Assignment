import java.util.Scanner;
public class Lab03{
    public static void main(String[]args){
        Scanner read= new Scanner(System.in);
         double a;
         System.out.println("Enter number to check max number between two numbers");
         a=read.nextDouble();
         double b;
         b=read.nextDouble();
          double result= max(a,b);
          System.out.println(result);
         System.out.println("Enter number to check  max number among three numbers");
         a=read.nextDouble();
         b=read.nextDouble();
          double c;
          c=read.nextDouble();
          double result3= max3(a,b,c);
          System.out.println(result3);
    }
     static double max(double a ,double b){ 
            if(a>b)
                return a;
            else
                return b;


    } static int max(int a ,int b){ 
            if(a>b)
                return a;
            else
                return b;
    }
    static double max3(double a ,double b,double c){ 
            if(a>b && a>c)
                return a;
            else if(b>a && b>c)
                return b;
            else if(c>a && c>b)
                return c;
            else
                return 0;

    } static int max3(int a ,int b,int c ){ 
            if(a>b && a>c)
                return a;
            else if(b>a && b>c)
                return b;
            else if(c>a && c>b)
                return c;
            else
                return 0;

    }
}
