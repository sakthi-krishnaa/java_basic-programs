//program to eliminate numerical values in a string
import java.util.Scanner;
class p3
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String s; 
    System.out.println("Enter your string:");
     s= sc.nextLine();
    System.out.println("After deletion of digits the string is:");
    s = s.replaceAll("[0123456789]","");  
    System.out.println(s);
}
}