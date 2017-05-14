package incremental2;

public class Customer {

	private int custNo;
	private String custName;
	private String custAddr;
	private static int billno;
	
	static{
		billno=0;
	}
	
	public static void display(){
		System.out.println("BILLNO: "+billno);
	}
	
	public Customer(int custNo, String custName, String custAddr) {
		super();
		this.custNo = custNo;
		this.custName = custName;
		this.custAddr = custAddr;
		billno++;
	}
	public int getCustNo() {
		return custNo;
	}
	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddr() {
		return custAddr;
	}
	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}
	
	/*public void init(){
		this.custNo=100;
		this.custName="akash";
		this.custAddr="hfhd92392";
		
	
	}*/
	/*public void display(){
		System.out.println("customer name: "+custName);
		System.out.println("customer no:"+custNo);
		System.out.println("customer address:"+custAddr);
		
	}*/
	/*@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "customer name:"+custName+" custid:"+custNo+"cutomer address: "+custAddr;
	}*/
	

}

