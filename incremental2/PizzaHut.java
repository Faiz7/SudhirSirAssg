package incremental2;

public class PizzaHut {

	public static void main(String[] args) {
		
		Customer c1=new Customer(1001,"NEEL","pune");
		Customer.display();
		System.out.println("Customer Name:"+c1.getCustName());
		System.out.println("Customer Address:"+c1.getCustAddr());
		
		Customer c2=new Customer(1002,"akash","nagpur");
		Customer.display();
		System.out.println("Customer Name:"+c2.getCustName());
		System.out.println("Customer Address:"+c2.getCustAddr());
	}

}
