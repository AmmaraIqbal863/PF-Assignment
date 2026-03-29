public class Lab05{
    public static void main(String[]args){
         int[][] arr1={{1,2,3},{4,5,6}};
         int[][] arr2={{1,2,3},{4,5,6}};
         System.out.println("Addition");
        addMatrix(arr1,arr2);
        System.out.println("Subtraction");
        subMatrix(arr1, arr2);
        System.out.println("Transpose");
        transpose(arr1);
        System.out.println("Check symmertic or not");
        if(check(arr1)){
            System.out.println("symmetric");
        }
        else
            System.out.println("Not symmetric");
        System.out.println("sum of diagonal");
          int sum=sumdiagonal(arr1);
        System.out.println(sum );

    }
    static void printArray(int [][] a){    
            for(int i=0;i<a.length;i++)
            {    
                for(int j=0;j<a[i].length;j++)
                {
                    System.out.print(a[i][j]+ " ");
                }
            System.out.println();
            }
        }
    static void addMatrix(int [][] arr1 ,int [][]arr2){ 
            int[][] result=new int[arr1.length][arr1[0].length];   
            for(int i=0;i<arr1.length;i++)
            {    
                for(int j=0;j<arr2[0].length;j++)
                {
                    result[i][j]=arr1[i][j] + arr2[i][j];
                }
            
            }
            printArray(result);
        }
    static void subMatrix(int [][] arr1 ,int [][]arr2){ 
            int[][] result=new int[arr1.length][arr1[0].length];   
            for(int i=0;i<arr1.length;i++)
            {    
                for(int j=0;j<arr2[0].length;j++)
                {
                    result [i][j]=arr1[i][j] - arr2[i][j];
                }
            
            }
            printArray(result);


    }
    static int[][]  transpose(int[][] arr1){
            int[][] transpose=new int[arr1[0].length][arr1.length];
            for(int i=0;i<arr1.length;i++){
                for( int j=0;j<arr1[0].length;j++){
                   transpose[j][i]=arr1[i][j];
                     }
         }
         printArray(transpose);
         return transpose;
        }
    static boolean check(int[][] arr1){
              int [][] trans=transpose(arr1);
              for(int i=0;i<arr1.length;i++)
            {    
                for(int j=0;j<arr1[0].length;j++)
                {
                    if (arr1[i][j] != trans[j][i]);
                    return false;
            }
              }
              return true;
              
            }
     static int sumdiagonal(int[][] arr1){
            int sum=0;
            for(int i=0;i<arr1.length;i++){
                   sum=sum+arr1[i][i];
                     }
        
         return sum;
        }
        
}
