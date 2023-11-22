package string;

public class Palindro_of_string {
	public static void main(String[] args) 
	 {
	String s = "jai";
	String rev="";
	for(int i=s.length()-1;i>=0;i--)
	{
	char ch = s.charAt(i);
	rev = rev+ch;
	}
	if (rev.equals(s))
	 System.out.println(s+" is a palindrome");
	else
	 System.out.println(s+" is not a palindrome");
}
}