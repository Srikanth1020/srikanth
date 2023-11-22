package string;

public class Reverse_of_string {
	 public static void main(String[] args) 
	 {
	 String s = "testing";
	 String rev="";
	for(int i=s.length()-1;i>=0;i--)
	{
	 char ch = s.charAt(i);
	 rev = rev+ch;
	 }
	 System.out.println("Reverse"+" of String is : "+rev);
}
}
