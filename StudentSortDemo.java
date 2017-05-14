package Assg78;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Student3 s =new Student3(rollNo, name);
		
		ArrayList<Student3> al = new ArrayList<Student3>();
		Student3 s1=new Student3(101,"Akash");
		Student3 s2=new Student3(103,"Mayur");
		Student3 s3=new Student3(105,"Brij");
		Student3 s4=new Student3(104,"Yogesh");
		Student3 s5=new Student3(102,"Neel");
		
		
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		//System.out.println(al);
		Iterator<Student3> it = al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		Collections.sort(al);
		System.out.println(al);
		

	}

}
