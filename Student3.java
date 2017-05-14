package Assg78;

public class Student3 implements Comparable<Student3>{
	
	private int rollNo;
	private String name;
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public Student3(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Roll No : \t" +rollNo+ "Name : "+name+"\n";
	}

	
	@Override
	public int compareTo(Student3 o1) {
		// TODO Auto-generated method stub
		if(this.rollNo>o1.rollNo)
				return 1;
		else if(this.rollNo<o1.rollNo)
				return -1;
		else 
				return 0;
	}
	

}
