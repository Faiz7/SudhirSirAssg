package ExceptionHandle;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Reports {

	public static void main(String[] args) {
		String[] items=new String[2];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter bill no:");
		int bno=sc.nextInt();
		System.out.println("enter cust name:");
		String cname=sc.next();
		System.out.println("enter items:");
		
		for(int x=0;x<items.length;x++){
			items[x]=sc.next();
			
		}
		
		System.out.println("enter bill date");
		
		String sdate=sc.next();
		
	DateFormat df=new SimpleDateFormat("dd-mm-yyyy");
	 Date dt=null;
	 try {
		dt=df.parse(sdate);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Date dt1=dt;
	
	System.out.println("enter bill total");
	int btotal=sc.nextInt();
	
	Bill bl=new Bill();
	
	bl.setBillNo(bno);
	bl.setCustName(cname);
	bl.setDate(dt1);
	bl.setItems(items);
	bl.setTotal(btotal);
	
	BillReports br=new BillReports();
	
	
	br.addBill(bl);
	
	br.getBills();
	
	br.updateBill(101,1000);
	
	try {
		br.searchbill(101);
	} catch (BillNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
