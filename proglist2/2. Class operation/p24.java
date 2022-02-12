// string array operations

import java.util.Arrays;  
public class p24 {  
        public static void main(String[] args) {  
            String[] sa = new String[7];   
            sa[0] = "A"; 
            sa[1] = "B";  
            sa[2] = "C";  
            sa[3] = "D";  
            sa[4] = "E";  
            System.out.println("Original Array Elements:" + Arrays.toString(sa));  
            int numberOfItems = 5;  
            String newItem = "F";   
            String newItem2 ="G";  
            sa[numberOfItems++] = newItem;  
            sa[numberOfItems++] = newItem2;  
            System.out.println("Array after adding two elements:" +  Arrays.toString(sa));  
        }  
    } 