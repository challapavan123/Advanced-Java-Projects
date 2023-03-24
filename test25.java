package File;
import java.io.*;
import java.util.Scanner;
public class test25 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name==>");
		String filename=sc.next();
		FileOutputStream output=new FileOutputStream("C:\\4CSE02\\"+filename+".dat");
		System.out.println("file created");
		output.close();
	}

}