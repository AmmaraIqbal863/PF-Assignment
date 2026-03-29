import java.util.Scanner;
public class Lab05{
    public static void main(String[]args){
         Scanner read= new Scanner(System.in);
          int[] values=new int[6];
          for(int j=0;j<6;j++){
                values[j]=read.nextInt();
          }
          int max=values[0];
          int i;
          for(i=0;i<values.length;i++){
                if(values[i]>max)
                {
                    max=values[i];
                }
                }
            System.out.println("largest: "+ max);        


    }
}