import java.util.StringTokenizer;  
public class p8{  
 public static void main(String args[]){  
   StringTokenizer st = new StringTokenizer("to tokenize a string"," ");  
     while (st.hasMoreTokens()) {  
         System.out.println(st.nextToken());  
     }  
   }  
}  	