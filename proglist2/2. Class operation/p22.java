//array operations program

public class p22{
  public static void main(String[] args) {
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    cars[0] = "tesla";
    cars[3] = "audi";
    System.out.println("number of cars: "+cars.length);
    for (String i : cars) {
      System.out.println(i);
    }    
  }
}
