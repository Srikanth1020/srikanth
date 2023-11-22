package string;

public class Duplicate_of_string {
	public static void main(String[] args) 
	 {
	String s = "We Are Test Engineers We Test Application";
	String str [] = s.split(" ");
	for(int i=0;i<str.length;i++)
	{
	 int count=0;
	 for(int j=i+1;j<str.length;j++)
	 {
	if (str[i].equalsIgnoreCase(str[j]))
	{
	str [j] =" ";
	count++;
	}
	 }
	 if ( str[i]!=" ")
	 System.out.println(str[i]); 
	 }
	 }
}
