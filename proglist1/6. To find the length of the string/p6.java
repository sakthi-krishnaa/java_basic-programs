//program to find length of the string
import java.util.Scanner;
public class p6{
	public static void main(String arg[])
	{              
	Scanner s =new Scanner(System.in);	
	System.out.println("Enter a string :");	 
	String str=s.nextLine();
	int res=length(str);
	System.out.println("lenth of the string is "+res);
	}
static int length(String s) 
	{
	int j=0;
	try
	{
		for ( j = 0;;j++)
		s.charAt(j);
	} 
	catch (Exception e) 
	{
	
	}
	return j;
	
	}
 
}
 