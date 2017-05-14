package com.pune.pizzahut;


public class Order implements Deliverable {

			int orderNo;
	     	int cost;
			String custName;
			String custAddress;
			int approxDistance;
			
			

	
	










	public Order(int orderNo, int cost, String custName,
					String custAddress, int approxDistance) {
				super();
				this.orderNo = orderNo;
				this.cost = cost;
				this.custName = custName;
				this.custAddress = custAddress;
				this.approxDistance = approxDistance;
				
			}









	@Override
	public boolean delivery() {
		
		if(this.approxDistance<=deliveryAreaLimit){
			/*System.out.println("delivery applicable");*/
			return true;
		}
			
		else 
			/*System.out.println("delivery not applicable");*/
			return false;
		
	}

}
