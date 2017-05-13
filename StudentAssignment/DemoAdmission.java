package StudentAssignment;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class DemoAdmission {
	
	public void Feedback(){
		
		File f = new File("feedback.txt");
		
		
		try {
		FileWriter fw = new FileWriter(f,true);
		BufferedWriter bw = new BufferedWriter(fw);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		for(int i=0;i<2;i++){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Student Id : ");
			int x = sc.nextInt();
			System.out.println("Enter Course Name :");
			String y = sc.next();
			System.out.println("Enter Feedback : ");
			String z = sc.next();
		
			
			bw.write("Student Id : "+x+"\t\tCourse : "+y);
			bw.newLine();
			bw.write("--------------------------------------------------");
			bw.newLine();
			bw.write(z);
			bw.newLine();
			bw.newLine();
			/*bw.write("This course is pathetic and faculty too.");
			bw.newLine();
			bw.write("We want Akash Chhava as faculty for JAVA");*/
			
		}	
		bw.flush();
		bw.close();
		fw.close();
			
			String str=br.readLine();
			while(str!=null){
				System.out.println(str.toUpperCase());
				str=br.readLine();
			}
			br.close();
			fr.close();
	
	
			
	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}

		//f.delete();
		

	}
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoAdmission da = new DemoAdmission();
		da.Feedback();
		
		Course c1 = new Course(1, "JAVA");
		try {
			c1.setCreditPoint(4);
		} catch (InvalidCreditPointException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Course c2 = new Course(2, "PLSQL");
		try {
			c2.setCreditPoint(6);
		} catch (InvalidCreditPointException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Student s1 = new Student(101, "Akash");
		s1.setsContact(987456321);
		Student s2 = new Student(102, "Mayur");
		s2.setsContact(987456321);
		Student s3 = new Student(103, "Neel");
		s3.setsContact(987456321);
		Student s4 = new Student(104, "Yogesh");
		s4.setsContact(987456321);
		Student s5 = new Student(105, "Faiz");
		s5.setsContact(987456321);
		
		
		Admission a = new Admission();
		a.addStudent(s1, c1);
		//a.addStudent(s1, c2);
		a.addStudent(s2, c2);
		a.addStudent(s3, c1);
		a.addStudent(s4, c2);
		a.addStudent(s5, c1);
		
		System.out.println(a.getsList());
		
		/*try {
			FileOutputStream fos = new FileOutputStream("admission.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(s1);
			oos.writeObject(s2);
			oos.writeObject(s3);
			oos.writeObject(s4);
			oos.writeObject(s5);
			
			oos.close();
			fos.close();
			
			
			FileInputStream fis = new FileInputStream("admission.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<Student> as1 = (ArrayList<Student>)ois.readObject();
			ArrayList<Student> as2 = (ArrayList<Student>)ois.readObject();
			ArrayList<Student> as3 = (ArrayList<Student>)ois.readObject();
			ArrayList<Student> as4 = (ArrayList<Student>)ois.readObject();
			ArrayList<Student> as5 = (ArrayList<Student>)ois.readObject();
			
			Student as1 = (Student)ois.readObject();
			Student as2 = (Student)ois.readObject();
			Student as3 = (Student)ois.readObject();
			Student as4 = (Student)ois.readObject();
			Student as5 = (Student)ois.readObject();
			
			System.out.println(as1);
			System.out.println(as2);
			System.out.println(as3);
			System.out.println(as4);
			System.out.println(as5);
			
			
			
			ois.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		
		

	}

}
