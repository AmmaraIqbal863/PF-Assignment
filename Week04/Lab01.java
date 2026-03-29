public class Lab01{
    public static void main(String[]args){
         int[][] arr1={{1,2,3},{4,5,6}};
         int[][] arr2={{1,2,3},{4,5,6}};
         int[][] result= addMatrix(arr1,arr2);

         for(int i=0;i<result.length;i++)
            {    
                for(int j=0;j<result[i].length;j++)
                {
                    System.out.print(result[i][j]+ " ");
                }
            System.out.println();
            }
    }
    static int[][] addMatrix(int [][] arr1 ,int [][]arr2){ 
            int[][] result=new int[arr1.length][arr1[0].length];   
            for(int i=0;i<arr1.length;i++)
            {    
                for(int j=0;j<arr2[0].length;j++)
                {
                    result[i][j]=arr1[i][j] + arr2[i][j];
                }
        
            }
            return result;


    }

}
