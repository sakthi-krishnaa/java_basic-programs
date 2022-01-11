//program of remove a substring in string
public class p4 {
     
    public static void main(String[] args) {
        String master = "1,2,3,4,5";
        String remove="3,";
         
        String new_string = master.replace(remove, "");
        System.out.println(master);
        System.out.println(new_string);
         
    }
}