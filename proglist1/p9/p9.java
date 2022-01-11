//copy one string to another 
import java.util.Scanner;
public class p9 {
    public static void main(String args[]) {
        String str, copy;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        str = scanner.nextLine();
        copy = new String(str);
        System.out.println("Input String : " + str);
        System.out.println("Copied String : " + copy);
    }
}