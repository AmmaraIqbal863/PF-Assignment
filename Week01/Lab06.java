import java.util.Scanner;
public class Lab06{
    public static void main(String[]args){ 
        Scanner read= new Scanner(System.in);
          int[] values=new int[9];
          for(int j=0;j<9;j++){
                values[j]=read.nextInt();
          }
          int i;
          int even=0;
          int odd=0;
          for(i=0;i<values.length;i++){
                if(values[i]%2==0)
                {
                    even++;
                }
                else
                {
                    odd++;
                }
                }
            System.out.println("Even count: " + even);        
            System.out.println( " Odd count: " + odd);

    }
}