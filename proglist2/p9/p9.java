// program to get system properties
import java.util.Properties;
 
public class p9 {
 
 public static void main(String[] args) {
 	 Properties prop = System.getProperties();
 	 System.out.println("Printing all System properties");
     prop.list(System.out);
 }
}