class Test {
  // create private constructor
  private Test () {
    System.out.println("This is a private constructor.");
  }
  public static void instanceMethod() {
    Test obj = new Test();
  }

}
class p6{
  public static void main(String[] args) {
    Test.instanceMethod();
  }
}