public class Lab02{
    public static void main(String[]args){
         String s="abba";
         boolean ispalindrome=true;
         int n=s.length();
         int i,j;
         for (i=0,j=n-1;i<j;i++,j--){
                if(s.charAt(i)!=s.charAt(j)){
                    ispalindrome=false;
                    break;
                }
         }
            
         if(ispalindrome){
            
            System.out.println("Its palindrome");
         }


    }
}