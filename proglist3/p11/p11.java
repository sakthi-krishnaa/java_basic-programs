//checking difference == operator and equals  
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class p11{

    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String formatted = current.format(formatter);
        String user= "12:15";
        String remove=":";
         
        String cur = formatted.replace(remove, "");
        String test = user.replace(remove,"");
        if(cur.equals(test))
        	System.out.println("current time is equal to user defined time");  // equals example
        else
        	System.out.println("Current Time is not equaluser_ip time");

        System.out.println(cur == test);  // == operator example
    }
}