//program of remove a substring in string and replace it by another
public class p6 {
     
    public static void main(String[] args) {
        String master = "java is not good language";
        String remove="not";
         
        String new_string = master.replace(remove, "very");
        System.out.println(master);
        System.out.println(new_string);
         
    }
}