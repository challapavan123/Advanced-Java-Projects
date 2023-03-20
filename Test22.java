//either printwriter or bufferedwriter
import java.io.*;
public class Test22 {
	public static void main(String[] args) throws Exception {
		File source=new File("c:\\Pavan\\multithread.txt");
		File target=new File("c:\\Pavan\\multithread_copy.txt");
		FileReader fr = new FileReader(source);
		FileWriter fw = new FileWriter(target);
		BufferedReader br = new BufferedReader(fr);
		PrintWriter pw = new PrintWriter(fw,false);
		String line;
		while((line=br.readLine())!=null) {
			pw.write(line);
			pw.println();
		}
		System.out.println("1 file copied");
		br.close();
		pw.close();
	

	}

}
