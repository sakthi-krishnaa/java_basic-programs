//program to concatenate two strings
import java.util.Scanner;
public class p1{
	public static String con(String s1,String s2){
		return s1+s2;
	}
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.println("enter the string1:");
		String s1 = s.nextLine();
		System.out.println("enter the string2:");
		String s2= s.nextLine();
		System.out.println("the concatenated string is: "+con(s1,s2));		
	}
}