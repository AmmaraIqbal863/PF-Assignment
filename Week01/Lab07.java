import java.util.Scanner;
public class Lab07{
    public static void main(String[]args){   
            Scanner read= new Scanner(System.in);
          int[] values=new int[6];
          System.out.println("Enter numbers");
          for(int j=0;j<6;j++){
                values[j]=read.nextInt();
          }
          int target ;
          System.out.println("Enter target number");
          target=read.nextInt();
          
          boolean found=false;
          for( int i=0;i<values.length;i++){
                if(values[i]==target)
                {
                    System.out.println("Found  " + target + " At index  " + i );
                    found=true;
                    break;        
                }
                }
            if(!found){
            System.out.println(" NOT Found");
            }


    }
}