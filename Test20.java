//Create a file to write an essay 
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class Test20 {
	public static void main(String[] args)throws Exception {
		String essays="Multithreading is a programming concept in which the application can create a small unit of tasks to execute in parallel.\n If you are working on a computer, it runs multiple applications and allocates processing power to them. \n A simple program runs in sequence and the code statements execute one by one.\n";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter file name and folder name");
		String filename=sc.next();
		String foldername=sc.next();
		File f=new File("C:\\"+foldername+"\\"+filename+".txt");
		FileWriter out=new FileWriter(f);
		System.out.println("file created");
		out.write(essays);
		System.out.println("file written");
		out.close();

	}

}
