package collect;

import java.util.Date;
import java.util.Vector;

public class bill {
	int	billNo;	
	String	custName;
	Date date;
	int	total;	
	
	Vector pizza;

	public int getBillNo() {
		return billNo;
	}

	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Vector getPizza() {
		return pizza;
	}

	public void setPizza(Vector pizza) {
		this.pizza = pizza;
	}
	



}
