public class Lab01{
    public static void main(String[]args){
         String a="abc";
         String reversed="";
         int n=a.length();         
         for (int i=0;i<n;i++){
               char c=a.charAt(i);
               reversed=c+reversed;

         }
            System.out.println(reversed);
                


    }
}