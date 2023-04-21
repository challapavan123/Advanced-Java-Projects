package ssss;
import java.io.*;
class Student0123 implements Serializable
{
	String name,scc,roll,school,cc;
	Student0123(String n,String s,String r,String sc,String c)
	{
		name=n;
		scc=s;
		roll=r;
		school=sc;
		cc=c;
	}
}
public class serialize0123
{
	public static void main(String[] args) throws Exception
	{
		FileOutputStream fos=new FileOutputStream("C:XYZ.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Student0123 st=new Student0123("isha","4CSE8","20211CSE0078","COMPUTER SCIENCE","XYZ");
		oos.writeObject(st);
		oos.flush();
		oos.close();
		FileInputStream fis=new FileInputStream("C:XYZ.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student0123 st1=(Student0123) ois.readObject();
		System.out.println(st1.name + "\t" + st1.scc + "\t" + st1.roll + "\t" + st1.school +"\t" + st1.cc);
	}
}
	
