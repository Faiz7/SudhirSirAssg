package StudentAssignment;


import java.util.ArrayList;

public class Admission {
	
	int year;
	ArrayList<Student> sList ;
	
	public void addStudent(Student s, Course c){
		sList = new ArrayList<Student>();
		s.setC(c);
		sList.add(s);

	}

	public ArrayList<Student> getsList() {
		return sList;
	}
	
	


}
