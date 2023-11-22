package demo;

public class prime {

	public static void main(String[] args) {
	
		for(int i=0;i<=25;i++) {
			int count=0;
			for(int num=1;num<=i;num++)
			if(i%num==0) {
				count++;
			}
		
		if(count==2) {
	System.out.println(i);
		}
		}
}
}