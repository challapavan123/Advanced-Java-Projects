//use of channel and buffer write a file
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.*;
import java.nio.channels.FileChannel;
public class test26 {
	public static void main(String[] args) throws Exception {
    String data="mobile-redmi note 9 price-12k, samsung m31 price-20k";
    RandomAccessFile file = new RandomAccessFile("C:\\pavan\\amazone.store","rw");
    ByteBuffer buffer = ByteBuffer.allocate(data.length());
    System.out.println("contents of buffer:"+buffer.getChar(2));
    for(int i =0; i <data.length(); i++) {
	buffer.put((byte) (data.charAt(i)));
}
	FileChannel channel = file.getChannel();
    // Rewinds buffer, the position is set to zero
	buffer.rewind();
	channel.write(buffer);
	System.out.println("Dta written to file");	
    channel.close();
    file.close();
    read();
}//end of the main  programm
public static void read()  throws Exception {
	RandomAccessFile file = new RandomAccessFile("C:\\pavan\\amazone.store","rw");
	FileChannel channel = file.getChannel();
    ByteBuffer buffer = ByteBuffer.allocate(1024);
    int numOfBytesRead = channel.read(buffer);
    for(int i=0;i<numOfBytesRead;i++) {
    char c=(char)buffer.get(i);
    System.out.print(c);
    }
    channel.close();
    file.close();
    }//end of the read operation
    }//end of the class
