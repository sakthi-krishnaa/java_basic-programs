// string example 
/*
public class p{
   public static void main(String args[]) {
      String s1 = "Hello gentleman";
      String upperCase = s1.toUpperCase();
      System.out.println(upperCase);
   }
}
// string is immutable whereas string buffer is mutable so string cant be ultered and appended any new characters
// string buffer example 
*/

public class p5 {
   public static void main(String[] args){
      StringBuffer buffer=new StringBuffer("Hi");
      buffer.append("guys!");
      System.out.println("StringBufferExample : " +buffer);
   }
}
