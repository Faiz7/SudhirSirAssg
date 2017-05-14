package com.pune.pizzahut;


public class Reception {

	public static void main(String[] args) {
		//Scanner sc =new Scanner(System.in);
		
		
		Order o1=new Order(1001,500,"akash","pune",2);
		
		
		
		if(o1.delivery())
		{
			System.out.println("delivery applicable");
		}
		else{
			System.out.println("delivery not applicable");
		}

	}

}
