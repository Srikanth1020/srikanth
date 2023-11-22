package array;

public class Min_of_array {
	public static void main(String[] args) 
	 {
	 int a [] = {1,3,5,7,9,11};
	int max = a [0],min = a [0];
	for(int i=0;i<a.length;i++) 
	{
	if(a[i]>max)
	max = a[i];
	else if(a[i]<min)
	min = a[i];
	}
	System.out.println("Maximum is: "+max);
	System.out.println("Minimum is"+min);
}
}