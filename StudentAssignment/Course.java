package StudentAssignment;

import java.io.Serializable;

public class Course implements Serializable {
	
	private int cid;
	private String cName;
	private int creditPoint;
	
	
	public Course(int cid, String cName) {
		super();
		this.cid = cid;
		this.cName = cName;
	}


	public int getCid() {
		return cid;
	}


	public String getcName() {
		return cName;
	}


	public int getCreditPoint() {
		
		return creditPoint;
	}


	public void setCreditPoint(int creditPoint) throws InvalidCreditPointException {
		if(creditPoint<2 || creditPoint>8){
			throw new InvalidCreditPointException("Credit Points should between 2 and 8");
		}
		else{
		this.creditPoint = creditPoint;
		}

	}


}
