import java.io.*;
public class test28 {

	public static void main(String[] args)throws Exception {
		Student ob1 = null;
		FileInputStream fileIn = new FileInputStream("C:\\pavan\\4cse02_student.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		ob1 = (Student) in.readObject();
		in.close();
		fileIn.close();
		System.out.println("Deserialized Student...");
		System.out.println("Name:"+ ob1.name);
		System.out.println("Regd no: " + ob1.regdno);
		System.out.println("CGPA: " + ob1.cgpa);
		
	}

}
