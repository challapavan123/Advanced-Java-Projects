//Readig File
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class Test21 {
	public static void main(String[] args)throws Exception {
		File fileob=new File("C:\\Pavan\\multithread.txt");
		FileReader fr=new FileReader(fileob);
		BufferedReader br=new BufferedReader(fr);
		String line;
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}br.close();

	}

}
