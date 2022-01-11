// program to find the count of upper,lowerrcase, special and digits
public class p8{  
    static void charPercentage(String input) {  
        int totalChar = input.length();  
        int upperCase = 0;  
        int lowerCase = 0;  
        int digits = 0;  
        int others = 0;  
        for (int i = 0; i < input.length(); i++) {  
            char ch = input.charAt(i);  
            if (Character.isUpperCase(ch)) {  
                upperCase++;  
            }  
            else if (Character.isLowerCase(ch)) {  
                lowerCase++;  
            }  
            else if (Character.isDigit(ch)) {  
                digits++;  
            }  
            else {  
                others++;  
            }  
        }  
       
        System.out.println("Uppercase letters count:" +upperCase);  
        System.out.println("Lowercase letters count:" +lowerCase); 
        System.out.println("numeric Digits count:   " +digits);  
        System.out.println("specialCharacters count:" +others);  
   
    }  
    public static void main(String[] args) {  
        charPercentage("hi friends ! my mobile no -> 6374647006");  
    }  
   
}  