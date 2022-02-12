public class p7{  
public static void main(String args[]){  
String s1="the program is to split the string into words";  
String[] words=s1.split("\\s");
for(String w:words){  
System.out.println(w);  
}  
}}  