package array;

import java.util.Scanner;

public class Sum_of_arry {
	 public static void main(String[] args) 
	 {
	 Scanner s = new Scanner(System.in);
	 System.out.println("Enter Array Size");
	 int size = s.nextInt(),sum=0; 
	 int a [] = new int [size]; 
	 for(int i=0;i<size;i++) 
	{ 
	 a [i] = s.nextInt(); 
	 } 
	System.out.println("Array Value are:");
	for (int j=0;j<size;j++)
	{
	sum = sum + a[j];
	}
	System.out.println("summ of arry "+sum);
	 }
}
