//student is serializable
import java.io.Serializable;
import java.io.*;
class Student implements Serializable {
	int regdno;
	String name;
	double cgpa;
	public Student(int regdno, String name, double cgpa) {
		this.regdno = regdno;
		this.name = name;
		this.cgpa = cgpa;
		
	}
}
public class Test27 {
	public static void main(String[] args) throws Exception {
		Student ob1=new Student(123,"pavan",7.4);
		Student ob2=new Student(124,"nithu",8.9);
		Student ob3=new Student(125,"vinay",6.5);
		Student ob4=new Student(126,"priya",9.8);
		Student ob5=new Student(127,"basha",6.4);
		Student ob6=new Student(128,"mouni",9.4);
		Student ob7=new Student(129,"sai",7.1);
		Student ob8=new Student(130,"colours",8.4);
		Student ob9=new Student(131,"vamshi",6.7);
		Student ob10=new Student(132,"koti",7.3);
		Student ob11=new Student(133,"CSB",8.4);
		Student ob12=new Student(134,"manasa",9.4);
		FileOutputStream fileOut = new FileOutputStream("C:\\pavan\\4cse02_student.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(ob1);
		out.write('\n');
		out.writeObject(ob2);
		out.write('\n');
		out.writeObject(ob3);
		out.write('\n');
		out.writeObject(ob4);
		out.write('\n');
		out.writeObject(ob5);
		out.write('\n');
		out.writeObject(ob6);
		out.write('\n');
		out.writeObject(ob7);
		out.write('\n');
		out.writeObject(ob8);
		out.write('\n');
		out.writeObject(ob9);
		out.write('\n');
		out.writeObject(ob10);
		out.write('\n');
		out.writeObject(ob11);
		out.write('\n');
		out.writeObject(ob12);
		out.write('\n');
		out.close();
		fileOut.close();
		System.out.println("Serialized data is saved in /pavan/4cse02_student.ser");
	}

}
