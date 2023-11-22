package demo;

import java.util.Scanner;

public class Dupli {
	public static void main(String[] args){	
		java.util.Scanner sc =new Scanner(System.in);
		System.out.println("enter the product price");
		int productprice = sc.nextInt();
		System.out.println("enter the quantity");
		int quantity = sc.nextInt();
		int totalcost=quantity*productprice;
		System.out.println("Totalcost:"+ totalcost);
		if(quantity<5 ) {
			System.out.println("there is nodiscount");
		}
		else if (quantity>10) {
			System.out.println("you got 10% discount");
			int discount =(totalcost/100)*10;
			int costtopaid = totalcost-discount;
			System.out.println("Total cost after discount:"+costtopaid);

		}
			}
}
