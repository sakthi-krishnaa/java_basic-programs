//program to factorial of a number
import java.util.Scanner;
public class p4{
   public static void main(String args[]){
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the number:");
      int num = s.nextInt();
      int factorial = fact(num);
      System.out.println("Factorial of entered number is: "+factorial);
   }
   static int fact(int n)
   {
       int output;
       if((n==1) || (n==0)){
         return 1;
       }
       
       output = fact(n-1)* n;
       return output;
   }
}
