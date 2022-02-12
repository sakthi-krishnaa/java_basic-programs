// program to find the biggest number in an array
 import java.util.Scanner;
 public class p1{
 	public static void main(String[] args){
    int n, max;
    Scanner s = new Scanner(System.in);
    System.out.println("enter the number of elements in array:");
    n= s.nextInt();
    System.out.println("enter the elements of array: ");
    int a[]= new int[n];
    for(int i=0 ; i<n ; i++){
    	a[i] = s.nextInt();
    	      }
    max = a[0];
    for(int i=0; i<n ;i++){
    	if(max < a[i]){
    		max = a[i];
    	  }
    	}
    	System.out.println("biggest number in the array : "+ max);
 	}

 }