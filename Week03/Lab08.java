import java.util.Scanner;
public class Lab08{
    public static void main(String[]args){ 
        Scanner read= new Scanner(System.in);
          int[] values=new int[6];
            System.out.println("Enter numbers ");
          for(int i=0;i<6;i++){
                values[i]=read.nextInt();
          }
          System.out.println("Before: ");
          for(int j=0;j<6;j++){
               System.out.print(values[j]);
          }
          int first=0;
          int last=values.length-1;
          int temp;
          while(first<last){
            temp=values[first];
            values[first]=values[last];
            values[last]=temp;
            first++;
            last--;}

            System.out.println("\nAfter: ");
          for(int k=0;k<6;k++){
               System.out.print(values[k]);
          }

    }
}