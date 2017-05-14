package AbstractClassess;

import java.util.Scanner;

public class Delivery {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter type:veg or non-veg");
		String ptype=sc.next();
		System.out.println("enter size:medium or small");
		String psize=sc.next();
		System.out.println("do you want toppings : yes or no");
		String ptop=sc.next();
		
		ItalianPizza i=new ItalianPizza(ptype, psize, ptop);
		
		
		int bill=i.calculateCost();
		
		System.out.println("your bill is :"+bill);
	}

}
