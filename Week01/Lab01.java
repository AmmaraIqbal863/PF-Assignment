import java.util.Scanner;
public class Lab01{
    public static void main(String[]args){ 
        Scanner read= new Scanner(System.in);
        System.out.println("Enter numbers");  
        int[] values=new int[5];
          for(int i=0;i<5;i++){
                values[i]=read.nextInt();
          }
          int sum=0;
          int i=0;
          while(i<5)
          {
            sum=sum+values[i];
            i++;
          }
            System.out.println("Sum: " + sum);     

    }
}