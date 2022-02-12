class Student {
   private int rno;
   private String name;
   public Student(int r, String n) {
      rno = r;
      name = n;
   }
   public String toString() {
      return rno + " " + name;
   }
}
public class p7{
   public static void main(String[] args) {
      Student s = new Student(101, "sakthi");   
      System.out.println("The student details are:");
      System.out.println(s);
   }
}