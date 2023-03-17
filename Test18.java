
import java.io.File;

public class Test18 {

	public static void main(String[] args) {
		File f1 = new File("C:\\COPYRIGHT");
		System.out.print("File Name:"+f1.getName());
		System.out.print("Path:"+f1.getPath());
		System.out.println("Abs Path:"+f1.getAbsolutePath());
		System.out.println("Parent:"+f1.getParent());
		System.out.println(f1.exists()?"exists":"does not exist");
		System.out.println("File last modified:"+f1.lastModified());
		System.out.println("File size:"+f1.length()+"Bytes");

	}

}
