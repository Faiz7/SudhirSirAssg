package StudentAssignment;

import java.io.Serializable;

public class Student implements Serializable {
	
	private int sid;
	private String sName;
	private int sContact;
	private Course c;
	
	
	public Student(int sid, String sName) {
		super();
		this.sid = sid;
		this.sName = sName;
	}


	public int getSid() {
		return sid;
	}


	public String getsName() {
		return sName;
	}


	public int getsContact() {
		return sContact;
	}


	public Course getC() {
		return c;
	}


	public void setsContact(int sContact) {
		this.sContact = sContact;
	}


	public void setC(Course c) {
		this.c = c;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student Id : "+sid+"\nStudent Name  :"+sName+"\nContact Number : "
				+sContact+"\nCourse Id : "+c.getCid()+"\nCourse name : "+c.getcName()+
				"\nCourse Credit Point : "+c.getCreditPoint();
	}
	
	
	
	

}
