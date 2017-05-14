package ExceptionHandle;

public class BillReports {
	int i=0;
		Bill[] bill=new Bill[1];
		
		public void addBill(Bill b)
		{
			
				//bill[i]=new Bill();
				bill[i]=b;
				//i++;
				}
		
		public boolean updateBill(int billno,int newtotal){
			boolean result=false;
			for(int j=0;j<bill.length;j++){
			
				if(bill[j].getBillNo()==billno){
					int ntotal=bill[j].getTotal()+newtotal;
					bill[j].setTotal(ntotal);
					result=true;
				}
				else 
					result=false;
				
			
			}
			
			return result;
		}//end of update
		
		public void getBills(){
			for(int c=0;c<bill.length;c++){
				System.out.println(bill[c]);
			}
		}//end of getbill
		
		public void searchbill(int billno) throws BillNotFoundException{
			
			for(int d=0;d<bill.length;d++){
				if(bill[d].getBillNo()==billno){
					System.out.println("bill found");
					System.out.println(bill[d]);
				}
				else{
					throw new BillNotFoundException("bill not found");
				}
			}
		}//end of search bill
		
			
}//end of class
		


