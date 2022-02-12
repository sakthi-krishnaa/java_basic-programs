// program to sort elements in an array ascending order
 import java.util.Scanner;
 public class p2{
 	public static void main(String[] args){
    int n;
    Scanner s = new Scanner(System.in);
    System.out.println("enter the number of elements in array:");
    n= s.nextInt();
    System.out.println("enter the elements of array: ");
    int a[]= new int[n];
    for(int i=0 ; i<n ; i++){
    	a[i] = s.nextInt();
    	      }
    int temp =0;
    for(int i=0; i<n ;i++){
        for(int j=i+1; j<n; j++){
    	if(a[j]<a[i]){
            temp = a[i];
    		 a[i] = a[j];
            a[j]= temp;
    	  }
        }
    	}
        for(int i=0; i<n; i++)
    	System.out.println(a[i]);
 	}

 }