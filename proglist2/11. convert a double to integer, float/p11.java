public class p11{
 
  public static void main(String[] args) {
 
    Float fObj = new Float("10.50");
    int i = fObj.intValue();

    System.out.println("integer value:"+i);
    double d = fObj.doubleValue();
    System.out.println("double value:"+d);
 
  }
}