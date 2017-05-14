package InstanceNMethodOverriding;

import java.util.Scanner;

public class PizzaHut {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("choose 1 for italian pizza and 2 for mexican pizza");
		System.out.println("enter choice");
		
		int ch=sc.nextInt();
		
		if (ch==1){
			
			ItalianPizza ip=new ItalianPizza("Veg","mushroom","Margherita Pizza",10);
			System.out.println(ip);
		}else if(ch==2){
			
			MexicanPizza mp=new MexicanPizza("Non-Veg","chicken","Mexican Pizza",15);
			System.out.println(mp);
		}else{
			System.out.println("choice is invalid");
		}
		

	}

}
