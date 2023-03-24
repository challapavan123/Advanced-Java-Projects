import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

//counting words letters and sentences from multithread.txt
public class test23 {

	public static void main(String[] args) throws Exception{
		File f=new File("C:\\Pavan\\multithread.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String line;
		int no_of_chars=0, no_of_words=0, no_of_sent=0;
		while((line= br.readLine())!=null) {
		System.out.println(line);
		no_of_chars=no_of_chars+line.length();
		String words[] = line.split(" ");
		no_of_words=no_of_words+words.length;
		
		String sent[]=line.split("\n");
		no_of_sent=no_of_sent+sent.length;
	

	}
		System.out.println("no.of chars is "+no_of_chars);
		System.out.println("no.of words is "+no_of_words);
		System.out.println("no.of sents is "+no_of_sent);

}
}